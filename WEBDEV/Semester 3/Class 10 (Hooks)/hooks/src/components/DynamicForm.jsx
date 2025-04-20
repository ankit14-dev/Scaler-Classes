import React, { useRef } from 'react';

function DynamicForm() {
  const inputRefs = useRef([]); // Step 1: useRef to store array of refs

  const fields = ['First Name', 'Last Name', 'Email']; // Dynamic fields

  const handleFocus = (index) => {
    inputRefs.current[index]?.focus(); // Focus input at given index
  };

  const handleSubmit = () => {
    const values = inputRefs.current.map(ref => ref?.value);
    alert('Form values:\n' + values.join('\n'));    
  };

  return (
    <div>
      {fields.map((label, index) => (
        <div key={index}>
          <label>{label}</label>
          <input
            type="text"
            ref={(el) => (inputRefs.current[index] = el)} // Step 2: assign ref dynamically
            placeholder={label}
          />
          <button type="button" onClick={() => handleFocus(index)}>
            Focus {label}
          </button>
        </div>
      ))}
      <button onClick={handleSubmit}>Submit</button>
    </div>
  );
}

export default DynamicForm;
