import React from 'react'

function Form(props) {
    const {name, setName} = props

    const handleSubmit = (event) => {
        event.preventDefault()
        console.log('You clicked submit.')
    }

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <label>Name:</label>
                <input type="text" name="name" value={name} onChange={(e)=>setName(e.target.value)} />
                <input type="submit" value="Submit" />
            </form>
        </div>
    )
}

export default Form