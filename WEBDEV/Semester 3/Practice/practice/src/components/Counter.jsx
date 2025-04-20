import React, { useState } from 'react'


function Counter() {
    const [count, setCount] = useState(0);
    const [xyz, setxyz] = useState(5);

    /* const increment = () => {
        setCount(count + 1);
        console.log(count);
    }
    const decrement = () => {
        setCount(count - 1);
        console.log(count);
    }
    const reset = () => {
        setCount(0);
        console.log(count);
    } */

    function handleClick() {
        setCount(xyz + 1);
        console.log(count);
    }
    return (
        <>
            <div>Counter</div>
            <div>{count}</div>
            <button onClick={handleClick}>Increment</button>
            <div>{xyz}</div>
        </>
    )
}

export default Counter;