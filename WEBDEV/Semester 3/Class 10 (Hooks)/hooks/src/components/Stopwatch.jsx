import React, { useState, useRef } from 'react';

const Stopwatch = () => {
  const [time, setTime] = useState(0);            // Time in seconds
  const intervalRef = useRef(null);               // Holds the interval ID

  const start = () => {
    if (intervalRef.current !== null) return;     // Prevent multiple intervals

    intervalRef.current = setInterval(() => {
      setTime(prevTime => prevTime + 1);          // Update time every second
    }, 1000);
  };

  const pause = () => {
    if (intervalRef.current) {
      clearInterval(intervalRef.current);
      intervalRef.current = null;
    }
  };

  const reset = () => {
    pause();
    setTime(0);
  };

  return (
    <div>
      <h2>Stopwatch: {time}s</h2>
      <button onClick={start}>Start</button>
      <button onClick={pause}>Pause</button>
      <button onClick={reset}>Reset</button>
    </div>
  );
};

export default Stopwatch;
