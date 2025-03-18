import React, { useEffect, useState } from "react";
import MovieCard from "./MovieCard";
import axios from "axios";
import Pagination from "./Pagination";

function Movies() {
  const [movies, setMovies] = useState([]);
  const [loading, setLoading] = useState(true);
  const [page, setPage] = useState(1);

  useEffect(() => {
    document.title = "Movies";
    axios
      .get(
        `https://api.themoviedb.org/3/movie/popular?api_key=3aec63790d50f3b9fc2efb4c15a8cf99&language=en-US&page=${page}`
      )
      .then((response) => {
        console.log(response.data);
        setMovies(response.data.results);
        setLoading(false);
      })
      .catch((error) => {
        console.log(error);
      });
  }, [page]);

  function pageNext() {
    setPage(page + 1);
  }
  function pagePrev() {
    setPage(page - 1);
  }

  return (
    <div>
      <div className="text-2xl font-bold text-center m-5">
        <h1>Trending Movies</h1>
      </div>
      <div className="flex justify-evenly flex-wrap gap-8">
        {loading ? <div>Loading...</div>
          : movies.map((movie) => {
            return <MovieCard movie={movie} key={movie.id}/>
          })}
      </div>
      <div className="flex justify-center mt-10 bg-blue-200 p-5">
        <Pagination pageNext={pageNext} pagePrev={pagePrev} pageNo={page} />
      </div>
      <div className="text-center text-sm text-gray-500 bg-gray-200 p-5">
        <p>© 2021 All Rights Reserved</p>
        <p>Powered by The Movie Database API</p>
      </div>
    </div>

  );
}

export default Movies;
