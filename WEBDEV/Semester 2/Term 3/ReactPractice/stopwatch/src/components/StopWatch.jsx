import React, { useEffect, useState } from 'react'

function StopWatch() {
    const [time, setTime] = useState(0)
    const [isActive, setIsActive] = useState(false)

    useEffect(()=>{
        let interval = null

        if(isActive){
            interval = setInterval(() => {
                setTime((time) => time + 1)
            }, 1000)
        }

        return () => clearInterval(interval)
    },[isActive])

    function startTime() {
        setIsActive(true)
    }
    function stopTime() {
        setIsActive(false)
    }

    function resetTime() {
        stopTime()
        setTime(0)
    }

    const formatTime = () => {
        const hours = Math.floor(time / 3600)
        const minutes = Math.floor((time % 3600) / 60)
        const seconds = time % 60

        return [
            hours.toString().padStart(2, '0'),
            minutes.toString().padStart(2, '0'),
            seconds.toString().padStart(2, '0')
        ].join(':')
    }

    return (
        <div className="stopwatch">
            <div className="display">{formatTime()}</div>
            <div className="controls">
                {!isActive ? 
                    <button onClick={startTime}>Start</button> : 
                    <button onClick={stopTime}>Stop</button>
                }
                <button onClick={resetTime}>Reset</button>
            </div>
        </div>
    )
}

export default StopWatch