
import React from 'react';
import ReactDom from 'react-dom/client';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../App.css'
import './Sign.css'
import UploadBox from './UploadBox'
import SignUp from './SignUp'
import * as ReactDOM from "react-dom/client";




const SignIn = () => {
  return (
    <div>
    <div className="container">
      <div className= "Spaced">
     
    <div className="card container General-Text ">
    <h1>Upload Video</h1>
    
      <form>
  <div className ="mb-3 ">
    <label htmlFor="exampleInputEmail1" className="form-label">Title</label>
    <input type="email" className="form-control" id="exampleInputEmail" aria-describedby="emailHelp" />
    
  </div>
  <div className="mb-3">
    <label htmlFor="exampleInputPassword1" className="form-label">Description</label>
    <textarea className="form-control Description" />  
  </div>

  <UploadBox />


    
</form>


    </div>
    </div>
    </div>
    </div>
  );
};



export default SignIn;
