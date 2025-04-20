import React from 'react';
const Children = React.memo(function Child({ onClick }) {
    console.log('Child rendered');
    return <button onClick={onClick}>Click Me</button>;
})

export default Children;