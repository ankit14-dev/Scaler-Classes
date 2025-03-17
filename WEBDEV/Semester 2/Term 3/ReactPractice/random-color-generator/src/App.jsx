import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  const handleChangeColor = () => {
    let randomColor = '#';
    for(let i = 0; i < 6; i++) {
      randomColor += Math.floor(Math.random() * 16).toString(16)
    }
    const color = '#' + Math.floor(Math.random() * 16777215).toString(16)
    document.body.style.backgroundColor = randomColor;
  }
  return (
    <>
      <button onClick={handleChangeColor}>Change Color</button>
    </>
  )
}

export default App
