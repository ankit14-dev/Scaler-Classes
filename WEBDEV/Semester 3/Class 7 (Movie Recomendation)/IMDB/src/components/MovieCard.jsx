import React from "react";

function MovieCard({movie}) {
  return (
    <div>
      <div
        className="h-[40vh] w-[30vh] bg-cover bg-center flex items-end rounded-lg hover:scale-110 duration-300"
        style={{
          backgroundImage:
            `url(https://image.tmdb.org/t/p/original/${movie.poster_path})`,
        }}
      >
        <div className="text-white w-full text-center text-xl p-2 bg-gray-900/70 rounded-lg">
          {movie.title}
        </div>
      </div>
    </div>
  );
}

export default MovieCard;
