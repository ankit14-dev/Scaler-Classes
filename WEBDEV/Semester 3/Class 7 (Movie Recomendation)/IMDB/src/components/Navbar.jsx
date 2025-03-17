import React from "react";
import logo from "../assets/logo.png";
import {Link} from "react-router-dom";

function Navbar() {
  return (
    <>
      <div className="font-bold underline space-x-8 flex start bg-black text-white p-4 items-center">
        <Link to="/">
          <img src={logo} alt="Logo" className="h-[40px] w-[40px]" />
        </Link>
        <Link to="/" className="text-3l">
          Home
        </Link>
        <Link to="/watchlist" className="text-10l">
          WatchList
        </Link>
        <Link to="/recommendation" className="text-10l">
          Recommendation
        </Link>
      </div>
    </>
  );
}

export default Navbar;
