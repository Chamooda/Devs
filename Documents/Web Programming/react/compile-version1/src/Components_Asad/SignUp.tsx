// Header.js

import React, { useRef, useEffect } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../App.css'
import './Sign.css'


const SignUp = () => {
  return (
    <div>
    <div className="container">
      <div className= "Spaced">
     
    <div className="card container General-Text ">
    <h1>SignUp</h1>
    
      <form>
  <div className ="mb-3 ">
    <label htmlFor="exampleInputEmail1" className="form-label">Email address</label>
    <input type="email" className="form-control" id="email"  />
    
  </div>


  <div className="mb-3">
    <label htmlFor="first_name" className="form-label">Username</label>
    <input type="text" className="form-control" id="fn" />
  </div>

  <div className="mb-3">
    <label htmlFor="profession" className="form-label">Profession</label>
    <input type="text" className="form-control" id="prof" />
  </div>



  <div className="mb-3">
    <label htmlFor="password" className="form-label">Password</label>
    <input type="password" className="form-control" id="pass" />
  </div>
    
    

  
    <button type="submit" className="">Login</button>
</form>
    </div>
    </div>
    </div>
    </div>
  );
};



export default SignUp;
