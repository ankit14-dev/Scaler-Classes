import React, { useEffect, useState } from "react";
import MovieCard from "./MovieCard";
import axios from "axios";

function Movies() {
  const [movies,setMovies] = useState([]);
  const [loading,setLoading] = useState(true);
  useEffect(() => {
    document.title = "Movies";
    axios
      .get(
        "https://api.themoviedb.org/3/movie/popular?api_key=3aec63790d50f3b9fc2efb4c15a8cf99&language=en-US&page=1"
      )
      .then((response) => {
        console.log(response.data);
        setMovies(response.data.results);
        setLoading(false);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  return (
    <div>
      <div className="flex justify-evenly flex-wrap gap-8">
        {loading? <div>Loading...</div> :movies.map((movie)=>{return <MovieCard movie={movie} key={movie.id}/>})}
      </div>
    </div>
  );
}

export default Movies;
