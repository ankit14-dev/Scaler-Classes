import React, { use } from 'react'

function Temp() {
    const refI=useRef(null)
    const refII=useRef(null)
    const handleClick=()=>{
        refI.current=refII;
        console.log(refI.current);
        console.log(refII.current);
    }
  return (
    <div>
        <input type="text" ref={refI} />
        <button onClick={() => handleClick()}>Focus</button>
        <button ref={refII} />
    </div>
  )
}

export default Temp