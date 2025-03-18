import React, { useContext, useState, useEffect } from 'react';
import { WatchListContext } from '../App';
import MovieListTile from './MovieListTile';
import './Watchlist.css'; // You'll need to create this CSS file

function Watchlist() {
  const watchListContextValue = useContext(WatchListContext);
  const { watchlist } = watchListContextValue;
  const [sortedWatchlist, setSortedWatchlist] = useState([]);
  const [sortCriteria, setSortCriteria] = useState('title'); // Default sorting by title
  const [sortOrder, setSortOrder] = useState('asc'); // Default ascending order

  const genres = {
    28: 'Action',
    12: 'Adventure',
    16: 'Animation',
    35: 'Comedy',
    80: 'Crime',
    99: 'Documentary',
    18: 'Drama',
    10751: 'Family',
    14: 'Fantasy',
    36: 'History',
    27: 'Horror',
    10402: 'Music',
    9648: 'Mystery',
    10749: 'Romance',
    878: 'Science Fiction',
    10770: 'TV Movie',
    53: 'Thriller',
    10752: 'War',
    37: 'Western'
  };
  
  // Function to get genre name by ID
  function getGenreById(id) {
    return genres[id] || 'Unknown Genre'; // Default if genre ID is not found
  }

  useEffect(() => {
    if (watchlist && watchlist.length > 0) {
      sortMovies(sortCriteria, sortOrder);
    } else {
      setSortedWatchlist([]);
    }
  }, [watchlist, sortCriteria, sortOrder]);

  const sortMovies = (criteria, order) => {
    const sorted = [...watchlist].sort((a, b) => {
      let valueA, valueB;

      switch (criteria) {
        case 'title':
          valueA = a.title || '';
          valueB = b.title || '';
          break;
        case 'rating':
          valueA = a.vote_average || 0;
          valueB = b.vote_average || 0;
          break;
        case 'date':
          valueA = a.release_date || '';
          valueB = b.release_date || '';
          break;
        case 'popularity':
          valueA = a.popularity || 0;
          valueB = b.popularity || 0;
          break;
        default:
          valueA = a.title || '';
          valueB = b.title || '';
      }

      // Handle string comparison
      if (typeof valueA === 'string' && typeof valueB === 'string') {
        return order === 'asc' ? valueA.localeCompare(valueB) : valueB.localeCompare(valueA);
      }

      // Handle numeric comparison
      return order === 'asc' ? valueA - valueB : valueB - valueA;
    });

    setSortedWatchlist(sorted);
  };

  const handleSortChange = (e) => {
    setSortCriteria(e.target.value);
  };

  const toggleSortOrder = () => {
    setSortOrder(sortOrder === 'asc' ? 'desc' : 'asc');
  };

  return (
    <div className="watchlist-container">
      <h1 className="watchlist-title">My Watchlist</h1>

      {watchlist && watchlist.length > 0 ? (
        <>
          <div className="sorting-controls">
            <div className="sort-group">
              <label htmlFor="sort-select">Sort by:</label>
              <select
                id="sort-select"
                value={sortCriteria}
                onChange={handleSortChange}
                className="sort-select"
              >
                <option value="title">Title</option>
                <option value="rating">Rating</option>
                <option value="date">Release Date</option>
                <option value="popularity">Popularity</option>
              </select>
            </div>

            <button
              className="sort-order-btn"
              onClick={toggleSortOrder}
            >
              {sortOrder === 'asc' ? '↑ Ascending' : '↓ Descending'}
            </button>
          </div>

          <div className="movies-list">
            {sortedWatchlist.map((movie) => (
              <div key={movie.id} className="movie-list-item">
                <div className="image-container">
                  <div
                    className="h-[40vh] w-[30vh] bg-cover bg-center flex items-end rounded-lg"
                    style={{
                      backgroundImage:
                        `url(https://image.tmdb.org/t/p/original/${movie.poster_path})`,
                    }}
                  />
                </div>
                <div className="movie-details">
                  <div className='text-white w-full text-center text-xl p-2 bg-gray-900/70 rounded-lg'>{movie.title}</div>
                  <p><strong>Rating:</strong> {movie.vote_average} / 10</p>
                  <p><strong>Release Date:</strong> {movie.release_date}</p>
                  <p><strong>Genres:</strong> {movie.genre_ids?.map(id => getGenreById(id)).join(', ') || 'N/A'}</p>
                  <p><strong>Overview:</strong> {movie.overview}</p>
                </div>
              </div>
            ))}
          </div>
        </>
      ) : (
        <div className="empty-watchlist">
          <p>Your watchlist is empty. Add some movies to get started!</p>
        </div>
      )}
    </div>
  );
}

export default Watchlist;