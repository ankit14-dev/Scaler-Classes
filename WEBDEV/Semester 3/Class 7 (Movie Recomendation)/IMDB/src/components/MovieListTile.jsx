import React from 'react'
import MovieCard from './MovieCard'

function MovieListTile({ movie }) {
    return (
        <div className="flex items-center m-5">
            <div
                className="h-[40vh] w-[30vh] bg-cover bg-center flex items-end rounded-lg"
                style={{
                    backgroundImage:
                        `url(https://image.tmdb.org/t/p/original/${movie.poster_path})`,
                }}
            />
            <div className='text-white w-full text-center text-xl p-2 bg-gray-900/70 rounded-lg'>{movie.title}</div>
        </div>
    )
}

export default MovieListTile