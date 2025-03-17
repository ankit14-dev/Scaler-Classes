import React from 'react'

function TodoCard({ task, deadline, onDelete }) {
    return (
        <div style={{
            border: '1px solid black',
            padding: '10px',
            margin: '10px',
            width: '200px',
            height: '200px',
            display: 'flex',
            flexDirection: 'column',
            justifyContent: 'center',
            alignItems: 'center',
            backgroundColor: 'lightgreen'
        }}>
            <h3>Todo Card</h3>
            <p>Task: {task}</p>
            <p>Deadline: {deadline}</p>
            <button onClick={onDelete} style={{
                padding: '5px',
                backgroundColor: 'red',
                color: 'white',
                border: 'none',
                borderRadius: '5px',
                cursor: 'pointer'
            }}>
                Delete
            </button>
        </div>
    )
}

export default TodoCard;