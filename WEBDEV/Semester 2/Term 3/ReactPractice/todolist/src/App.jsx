import { useState } from 'react'
import './App.css'
import TodoCard from './conponents/TodoCard'
import CreateTodo from './conponents/CreateTodo'

function App() {
  const [todoList, setTodoList] = useState([])
  
  const addTodo = (newTodo) => {
    setTodoList([...todoList, newTodo]);
  }

  const deleteTodo = (index) => {
    setTodoList(todoList.filter((x, i) => i !== index));
  }

  return (
    <>
      <h1>Todo App</h1>
      <CreateTodo addTodo={addTodo}/>
      <div style={{ display: 'flex', justifyContent: 'center' }}>

        {todoList.map((obj, index) => {
          return (
            <TodoCard 
              key={index} 
              task={obj.task} 
              deadline={obj.deadline} 
              onDelete={() => deleteTodo(index)} 
            />
          )
        })}
      </div>
    </>
  )
}

export default App
