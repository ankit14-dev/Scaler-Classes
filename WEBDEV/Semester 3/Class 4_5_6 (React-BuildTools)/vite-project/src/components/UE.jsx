import React, { useEffect, useState } from 'react'

function UE() {
    const [count,setCount] =useState(0)
    const [text,setText] =useState('')

    function increment(){
        setCount(count+1)
    }
    function decrement(){
        setCount(count-1)
    }
    useEffect(()=>{
        console.log("useEffect");
        document.title=`Clicked ${count} times`;
    },[])//the use efffect hook will at the end.
    
  return (
    <div>
        <button onClick={increment}>Increment</button>
        <h1>{count}</h1>
        <button onClick={decrement}>Decrement</button>
        <input type='text' value={text} onChange={(e)=>setText(e.target.value)} />
        <h3>{text}</h3>
    </div>
  )
}

export default UE