import React, { useState } from 'react'

function CreateTodo({ addTodo }) {
    const [task, setTask] = useState('');
    const [deadline, setDeadline] = useState('');

    const handleTodoGeneration = () => {
        if (task.trim() && deadline.trim()) {
            // Create new todo object
            const newTodo = {
                task: task,
                deadline: deadline
            };

            // Add the new todo to the list
            addTodo(newTodo);
            setTask('');
            setDeadline('');
            console.log('Todo Created:', newTodo);
        } else {
            alert('Please fill in both task and deadline!');
        }
    }
    return (
        <div style={{ margin: '20px 0' }}>
            <input
                type="text"
                value={task}
                onChange={(e) => setTask(e.target.value)}
                placeholder="Enter task"
                style={{ padding: '8px', marginRight: '10px' }}
            />
            <input
                type="text"
                value={deadline}
                onChange={(e) => setDeadline(e.target.value)}
                placeholder="Enter deadline"
                style={{ padding: '8px', marginRight: '10px' }}
            />
            <button onClick={handleTodoGeneration} style={{
                padding: '10px',
                backgroundColor: 'lightblue', 
                border: 'none', 
                borderRadius: '5px',
                cursor: 'pointer'
            }}>
                Create Todo
            </button>


        </div>
    )
}

export default CreateTodo;