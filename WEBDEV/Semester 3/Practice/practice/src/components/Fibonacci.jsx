import React, { useState, useMemo } from 'react';

function Fibonacci() {
    const [number, setNumber] = useState(0);

    const sequence = useMemo(() => {
        const num = parseInt(number, 10); // Convert input to a number
        if (isNaN(num) || num <= 0) {
            return []; // Handle invalid input
        }
        let fib = [0, 1];
        for (let i = 2; i < num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib.slice(0, num);
    }, [number]);

    return (
        <div>
            <input
                type="number"
                placeholder="Enter a number"
                value={number}
                onChange={(e) => setNumber(e.target.value)}
            />
            <div className="result">
                {sequence.map((num, index) => (
                    <span key={index}>{num} </span>
                ))}
            </div>
        </div>
    );
}

export default Fibonacci;