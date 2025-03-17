import React from 'react'

function ListCard(e) {
    return (
        <div style={{ border: '1px solid white', height: '200px', width: "200px" }}>
            <h1>{e.heading}</h1>
            <p>{e.description}</p>

        </div>
    )
}

export default ListCard