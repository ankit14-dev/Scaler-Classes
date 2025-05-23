import "./App.css";
import Navbar from "./components/Navbar";
import Movies from "./components/Movies.jsx";
import WatchList from "./components/Watchlist.jsx";
import MovieRecommendation from "./components/MovieRecommendation.jsx";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Banner from "./components/Banner.jsx";
import { createContext, useEffect, useState } from "react";

export const WatchListContext = createContext();

function App() {
  const [watchlist, setWatchlist] = useState([]);

  useEffect(()=>{
    const movies = localStorage.getItem('watchlist');
    if(movies){
      setWatchlist(JSON.parse(movies));
    }
  },[]);
  useEffect(()=>{
    localStorage.setItem('watchlist', JSON.stringify(watchlist));
  },[watchlist]);

  function handleAddtoWatchlist(movie) {
    setWatchlist(prevWatchlist => [...prevWatchlist, movie]);
  }
  return (
    <>
      <BrowserRouter>
        <Navbar />
        <WatchListContext.Provider value={{ watchlist,setWatchlist ,handleAddtoWatchlist }}>
          <Routes>
            <Route path="/" element={<><Banner /> <Movies /></>} />
            <Route path="/watchlist" element={<WatchList watchlist={watchlist} />} />
            <Route path="/recommendation" element={<MovieRecommendation />} />
          </Routes>
        </WatchListContext.Provider>
      </BrowserRouter>
    </>
  );
}

export default App;
