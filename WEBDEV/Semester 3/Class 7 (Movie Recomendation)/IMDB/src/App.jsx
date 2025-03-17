import "./App.css";
import Navbar from "./components/Navbar";
import Movies from "./components/Movies.jsx";
import WatchList from "./components/Watchlist.jsx";
import MovieRecommendation from "./components/MovieRecommendation.jsx";
import { BrowserRouter, Routes,Route } from "react-router-dom";
import Banner from "./components/Banner.jsx";

function App() {
  return (
    <>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/" element={<><Banner/> <Movies /></>} />
          <Route path="/watchlist" element={<WatchList />} />
          <Route path="/recommendation" element={<MovieRecommendation />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
