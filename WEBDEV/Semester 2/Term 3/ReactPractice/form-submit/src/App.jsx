import { useState } from 'react'
import './App.css'
import Form from './Form'

function App() {
  const [name, setName] = useState('')
  return (
    <>
      <Form name={name} setName={setName}/>
      <h1>{name}</h1>
      
    </>
  )
}

export default App
