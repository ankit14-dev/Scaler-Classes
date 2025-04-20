import React, { useRef, useState } from 'react';

const SaveInputWithoutRerender = () => {
  const inputRef = useRef(null);         // Direct access to the DOM input element
  const [submittedValue, setSubmittedValue] = useState(''); // Updates only on submit

  const handleSubmit = () => {
    const value = inputRef.current.value;
    setSubmittedValue(value);
    console.log('Submitted:', value);
  };

  return (
    <div>
      <input type="text" ref={inputRef} placeholder="Type here..." />
      <button onClick={handleSubmit}>Submit</button>
      <p>Submitted Value: {submittedValue}</p>
    </div>
  );
};

export default SaveInputWithoutRerender;
