
import 'bootstrap/dist/css/bootstrap.min.css';
import './NavCSS.css';
import React from 'react';

const NavBar = () => {
  return (
    <div>
    <div className="navbar navbar-expand-lg navs">
      <div className="container-fluid">
        <a className="navbar-brand" href="#">DevStack</a>



        <form className="SearchBar">
            <input
              className="SearchBarInside"
              type="search"
              placeholder="Search"
              aria-label="Search"
            />
          </form>



    
        <div className="collapse navbar-collapse justify-content-end" id="navbarNavAltMarkup">
          {/* Profile Picture and Sign In Option to the Right */}
          <div className="d-flex align-items-center">
            <a href="#" className="text-white me-3">Sign In</a>
            <img
              src="https://placekitten.com/30/30"  // Placeholder image, replace with your profile picture
              alt="Profile"
              className="rounded-circle"
            />
          </div>
        </div>
      </div>
    </div>
  </div>
  )
}

export default NavBar;
