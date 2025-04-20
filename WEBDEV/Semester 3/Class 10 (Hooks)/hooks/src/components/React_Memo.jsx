import React, { use, useMemo } from 'react'

const ReactMemo=React.memo(function ReactMemo({buttonName}) {
    console.log("ReactMemo component rendered")

    
    return (
        <div>
            <button>{buttonName}</button>
        </div>
    )
})

export default ReactMemo