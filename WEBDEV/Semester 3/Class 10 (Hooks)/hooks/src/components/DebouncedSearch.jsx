import React, { useState, useRef } from 'react';

const DebouncedSearch = () => {
  const [query, setQuery] = useState('');
  const timerRef = useRef(null);

  const handleInputChange = (e) => {
    const value = e.target.value;
    setQuery(value);

    // Clear the previous timer
    if (timerRef.current) {
      clearTimeout(timerRef.current);
    }

    // Set a new timer
    timerRef.current = setTimeout(() => {
      performSearch(value);
    }, 500); // 500ms debounce delay
  };

  const performSearch = (searchTerm) => {
    // Simulate API call
    console.log('Searching for:', searchTerm);
    // In real scenario, you'd do:
    // fetch(`/api/search?q=${searchTerm}`).then(...)
  };

  return (
    <div>
      <input
        type="text"
        value={query}
        onChange={handleInputChange}
        placeholder="Search..."
      />
    </div>
  );
};

export default DebouncedSearch;
