import React from 'react'
import ListCard from './ListCard'

export default function Item({ list }) {
    // const {list} = props
    // const list = props.list

    return (
        <>
            {list.map((e, index) => {
                return <ListCard key={index} {...e} />
            })}
        </>
    )
}
