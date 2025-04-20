import React from 'react'

function UseRefHook() {
    const [input, setInput] = React.useState("")
    const inputRef = React.useRef(null)
    console.log(inputRef);
    function reset(){
        inputRef.current.focus()
        setInput("")
    }
    return (
        <div>
            <h1>Use Ref</h1>
            <input
                type="text"
                placeholder='Enter your name'
                value={input}
                onChange={(e) => setInput(e.target.value)}
                ref={inputRef}

            />
            <button onClick={reset}>Reset</button>
            <h2>{input}</h2>
        </div>
    )
}

export default UseRefHook;