import React from 'react'

function FilterUsersList() {
    const [searchTerm, setSearchTerm] = React.useState('')
    const [filtered, setFiltered] = React.useState([])
    function handleFilter() {
        const filteredUsers = users.filter(user => user.name.toLowerCase().includes(searchTerm.toLowerCase()))
        setFiltered(filteredUsers)
    }
  return (
    <div>
        <h1>Filtered User List</h1>
        <input type="text" placeholder="Search..." value={searchTerm} onChange={(e) => setSearchTerm(e.target.value)} />
        <button onClick={() => handleFilter}>Add</button>
        <ul>
            {filtered.map(user => (
                <li key={user.id}>{user.name}</li>
            ))}
        </ul>
    </div>
  )
}

export default FilterUsersList