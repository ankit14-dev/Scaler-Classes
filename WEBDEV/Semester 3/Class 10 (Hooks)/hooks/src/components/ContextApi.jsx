import React, { useContext } from 'react'
import { MovieContext } from '../App'

function MovieDisplay() {
    const movies=useContext(MovieContext)
  return (
    <div>Movies: {movies}</div>
  )
}

export default MovieDisplay