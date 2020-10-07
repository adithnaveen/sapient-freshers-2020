import React, { Component } from 'react';
import EmployeeForm from "./EmployeeForm"; 

import 'bootstrap/dist/css/bootstrap.css'

class App1 extends Component {
  
  render(){
    return (
      <div className="container">
       <h1 className="alert alert-info">Form Validation </h1>
       <div className="row">
         <div className="col">
      
        <EmployeeForm />
         </div>
         <div className="col"></div>
       </div>
        
      </div>
    ); 
  }
}

export default App1;