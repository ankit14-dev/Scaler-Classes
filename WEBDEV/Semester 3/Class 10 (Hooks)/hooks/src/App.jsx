import React, { createContext, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Memo from './components/Memo'
import ReactMemo from './components/React_Memo'
import UseRefHook from './components/UseRefHook'
import UseCallback from './components/UseCallback'
import MovieDisplay from './components/ContextApi'
import FilterUsersList from './components/FilterUsersList'
import DebouncedSearch from './components/DebouncedSearch'
import SaveInputWithoutRerender from './components/SaveInputWithoutRerender '
import Stopwatch from './components/Stopwatch'
import DynamicForm from './components/DynamicForm'

export const MovieContext = createContext();
function App() {
  const [name, setName] = useState("Click Me");
  const [counter, setCounter] = useState(0);


  

  return (
    <>
      {/* <UseCallback /> */}
      {/* <FilterUsersList /> */}
      {/* <div>{counter}</div>
      <button onClick={() => setCounter(counter + 1)}>Increment</button>
      <button onClick={() => setCounter(counter - 1)}>Decreament</button>
      <input type="text" value={name} onChange={(e) => setName(e.target.value)} />

      <ReactMemo buttonName={name} /> */}
      {/* <DebouncedSearch /> */}
      {/* <SaveInputWithoutRerender /> */}
      {/* <Stopwatch /> */}
      {/* <DynamicForm /> */}
      <Temp/>
      
    </>
  )
}

export default App
