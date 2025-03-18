import React from 'react'

function Pagination({pageNext, pagePrev, pageNo}) {
  return (
    <div >
        <div className="flex justify-center space-x-4">
            {pageNo === 1 ? null : <button onClick={pagePrev} className="bg-gray-200 px-4 py-2 rounded-lg"><i className="fa-solid fa-arrow-left"></i></button>}
            <button className="bg-gray-200 px-4 py-2 rounded-lg">{pageNo}</button>
            <button onClick={pageNext} className=" bg-gray-200 px-4 py-2 rounded-lg"><i className="fa-solid fa-arrow-right"></i></button>
        </div>
    </div>
  )
}

export default Pagination;