import React from 'react';
import ProductForm from './ProductForm'
import 'bootstrap/dist/css/bootstrap.css'

function App() {
  return (
    <div className="container">
      <h1 className="alert alert-info">Form Validation</h1>
      <div className="row">
        <div className="col">
          <ProductForm />
        </div>
        <div className="col"></div>
      </div>
    </div>
  );
}

export default App;
