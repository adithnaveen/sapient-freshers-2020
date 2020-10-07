import React, { Component } from 'react'
import AppHeader from './AppHeader';
import AppComponent from './AppComponent'
import AppFooter from './AppFooter'
import CounterApp from './CounterApp'
import 'bootstrap/dist/css/bootstrap.css'

class App extends Component {

  render() {
    const title = "This is app header from App";
    const company = "Publicis Sapient"

    const footerProps = {
      website: "http://ps.com",
      company: "Publicis Sapient",
      year: "2020"
    };

    return (
      <div>
        <AppHeader
          title={title}
          company={company} />

        <div className="container">
          <div className="row">
            <div className="col"> <AppComponent /> </div>
            <div className="col"> <CounterApp /> </div>
          </div>
        </div>


        {/* <AppFooter 
          website={footerProps.website} 
          company={footerProps.company} 
          year={footerProps.year} />  */}
        <AppFooter {...footerProps} />
      </div>
    );
  }
}

export default App;