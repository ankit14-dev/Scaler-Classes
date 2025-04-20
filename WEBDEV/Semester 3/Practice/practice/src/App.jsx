import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Fibonacci from './components/Fibonacci'
import Counter from './components/Counter'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Fibonacci />
      {/* <Counter /> */}
    </>
  )
}

export default App
