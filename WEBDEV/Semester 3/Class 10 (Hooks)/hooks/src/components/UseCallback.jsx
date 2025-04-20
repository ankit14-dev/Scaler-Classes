import React, { useCallback, useState } from 'react'
// import Children from './Children';

function UseCallback() {
    const [count, setCount] = useState(0);

    // const handleClick =useCallback( () => {
    //   console.log('Button clicked');
    //   // setCount(count + 1);
    // },[]); // Dependency array

    const handleClick = useCallback(() => {
      console.log('Button clicked');
    },[]);
  
    return (
      <div>
        <Child onClick={handleClick} />
        <button onClick={() => setCount(count + 1)}>Increment Count</button>
        <div>Count: {count}</div>
      </div>
    );
}

export default UseCallback;
const Child = React.memo(function Child({ onClick }) {
    console.log('Child rendered');
    return <button onClick={onClick}>Click Me</button>;
})