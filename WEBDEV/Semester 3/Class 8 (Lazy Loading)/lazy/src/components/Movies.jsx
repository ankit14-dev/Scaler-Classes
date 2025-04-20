import React, { useState } from 'react'
import { movies } from './moviesData'

export default function Movies() {
    const [mmoviesData, setMoviesData] = useState([])
    function getMovies() {
        // import('./moviesData')
        // .then((module) => {
        //     const movies = module.movies
        //     console.log(movies)
        //     setMoviesData(JSON.stringify(movies))
        // })
        setMoviesData(JSON.stringify(movies))
    }
  return (
    <div>
        <button onClick={() => getMovies()}>Get Movies</button>
        <h4>{mmoviesData}</h4>
    </div>
  )
}
