import React,{useEffect, useState} from 'react'

export default AutoResetCounter
function AutoResetCounter() {
    const [count, setCount] = useState(0);
    useEffect(()=>{
        const timer=setInterval(()=>{
            setCount(0);
        },5000)
        return ()=>clearInterval(timer)
    },[count])

    const handleIncrement = () => {
      setCount(count + 1);
    };
    return (
      <div>
        <p>Count: {count}</p>
        <button onClick={handleIncrement}>Increment</button>
      </div>
    );
  }