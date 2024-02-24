
import React from 'react';
import ReactDom from 'react-dom/client';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../App.css'
import './Sign.css'
import SignUp from './SignUp'
import * as ReactDOM from "react-dom/client";




const SignIn = () => {
  return (
    <div>
    <div className="container">
      <div className= "Spaced">
     
    <div className="card container General-Text ">
    <h1>SignUp</h1>
    
      <form>
  <div className ="mb-3 ">
    <label htmlFor="exampleInputEmail1" className="form-label">Email address</label>
    <input type="email" className="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" />
    
  </div>
  <div className="mb-3">
    <label htmlFor="exampleInputPassword1" className="form-label">Password</label>
    <input type="password" className="form-control" id="exampleInputPassword1" />
  </div>

  
    <button type="submit" className="">Login</button>


    
</form>


    </div>
    </div>
    </div>
    </div>
  );
};



export default SignIn;
