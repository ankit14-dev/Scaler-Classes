import React, { useContext, useState, useEffect, useRef } from 'react';
import { WatchListContext } from '../App';
import './Watchlist.css';
import getGenreById from '../utils/genres';

function Watchlist() {
  const watchListContextValue = useContext(WatchListContext);
  const { watchlist } = watchListContextValue;
  const [sortedWatchlist, setSortedWatchlist] = useState([]);
  const [sortCriteria, setSortCriteria] = useState('title');
  const [sortOrder, setSortOrder] = useState('asc');
  const [searchQuery, setSearchQuery] = useState('');
  const [filteredWatchlist, setFilteredWatchlist] = useState([]);
  const searchInputRef = useRef(null);

  useEffect(() => {
    if (watchlist && watchlist.length > 0) {
      sortMovies(sortCriteria, sortOrder);
    } else {
      setSortedWatchlist([]);
    }
  }, [watchlist, sortCriteria, sortOrder]);

  // Apply search filter whenever sortedWatchlist or searchQuery changes
  useEffect(() => {
    if (searchQuery.trim() === '') {
      setFilteredWatchlist(sortedWatchlist);
    } else {
      const query = searchQuery.toLowerCase();
      const filtered = sortedWatchlist.filter(movie => {
        // Search through various fields
        const matchesTitle = movie.title?.toLowerCase().includes(query);
        const matchesOverview = movie.overview?.toLowerCase().includes(query);
        const matchesGenres = movie.genre_ids?.some(id => getGenreById(id).toLowerCase().includes(query));
        
        return matchesTitle || matchesOverview || matchesGenres;
      });
      setFilteredWatchlist(filtered);
    }
  }, [sortedWatchlist, searchQuery]);

  // Handle keyboard shortcuts
  useEffect(() => {
    const handleKeyDown = (event) => {
      if (event.key === '/') {
        event.preventDefault();
        searchInputRef.current.focus();
      }
    };

    window.addEventListener('keydown', handleKeyDown);
    return () => {
      window.removeEventListener('keydown', handleKeyDown);
    };
  }, []);

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

      if (typeof valueA === 'string' && typeof valueB === 'string') {
        return order === 'asc' ? valueA.localeCompare(valueB) : valueB.localeCompare(valueA);
      }

      return order === 'asc' ? valueA - valueB : valueB - valueA;
    });

    setSortedWatchlist(sorted);
  };

  const handleSortClick = (criteria) => {
    if (sortCriteria === criteria) {
      setSortOrder(sortOrder === 'asc' ? 'desc' : 'asc');
    } else {
      setSortCriteria(criteria);
      setSortOrder('asc');
    }
  };

  const getSortIcon = (column) => {
    if (sortCriteria !== column) return null;
    return sortOrder === 'asc' ? '↑' : '↓';
  };

  const handleSearchChange = (e) => {
    setSearchQuery(e.target.value);
  }

  const clearSearch = () => {
    setSearchQuery('');
  }

  return (
    <div className="watchlist-container">
      <div className="watchlist-header">
        <h1 className="watchlist-title">My Watchlist</h1>
      </div>

      {watchlist && watchlist.length > 0 ? (
        <>
          <div className="search-container">
            <input
              type="text"
              className="search-input"
              placeholder="Search movies by title, genre, or keywords..."
              value={searchQuery}
              onChange={handleSearchChange}
              ref={searchInputRef}
            />
            {searchQuery && (
              <button className="clear-search-btn" onClick={clearSearch}>
                ✕
              </button>
            )}
          </div>
          
          {filteredWatchlist.length === 0 && searchQuery ? (
            <div className="no-results">
              <p>No movies found matching "{searchQuery}"</p>
              <button className="reset-search-btn" onClick={clearSearch}>
                Clear search
              </button>
            </div>
          ) : (
            <div className="table-responsive">
              <table className="watchlist-table">
                <thead>
                  <tr>
                    <th className="poster-cell">Poster</th>
                    <th
                      className="sortable-header"
                      onClick={() => handleSortClick('title')}
                    >
                      Title {getSortIcon('title')}
                    </th>
                    <th
                      className="sortable-header"
                      onClick={() => handleSortClick('rating')}
                    >
                      Rating {getSortIcon('rating')}
                    </th>
                    <th
                      className="sortable-header"
                      onClick={() => handleSortClick('date')}
                    >
                      Release Date {getSortIcon('date')}
                    </th>
                    <th>Genres</th>
                    <th
                      className="sortable-header"
                      onClick={() => handleSortClick('popularity')}
                    >
                      Popularity {getSortIcon('popularity')}
                    </th>
                    <th>Overview</th>
                    <th>Action</th>
                  </tr>
                </thead>
                <tbody>
                  {filteredWatchlist.map((movie) => (
                    <tr key={movie.id} className="movie-row">
                      <td className="poster-cell">
                        <img
                          src={`https://image.tmdb.org/t/p/w92/${movie.poster_path}`}
                          alt={movie.title}
                          className="movie-poster-thumbnail"
                          onError={(e) => {
                            e.target.onerror = null;
                            e.target.src = 'https://via.placeholder.com/92x138?text=No+Image';
                          }}
                        />
                      </td>
                      <td><b>{movie.title}</b></td>
                      <td>{movie.vote_average} / 10</td>
                      <td>{movie.release_date}</td>
                      <td>{movie.genre_ids?.map(id => getGenreById[ id]).join(', ') || 'N/A'}</td>
                      <td>{movie.popularity?.toFixed(1)}</td>
                      <td className="overview-cell">
                        <div className="overview-text">{movie.overview}</div>
                      </td>
                      <td>
                        <button 
                          style={{cursor:"pointer"}} 
                          className='p-1 border border-red-500 rounded-md hover:bg-red-500 hover:text-white' 
                          onClick={() => {
                            console.log("to delete", movie.id)
                            watchListContextValue.setWatchlist(watchlist.filter(item => item.id !== movie.id));
                          }}
                        >
                          Delete
                        </button>
                      </td>
                    </tr>
                  ))}
                </tbody>
              </table>
            </div>
          )}
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