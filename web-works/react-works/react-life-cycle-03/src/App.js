import React, { Component } from 'react'
import CounterApp from './CounterApp';

import 'bootstrap/dist/css/bootstrap.css'
class App extends Component {
  state = { showCounterApp: false, title: 'Counter app' }



  render() {
    let output = null;
    if (this.state.showCounterApp === true) {
      output = <CounterApp title={this.state.title} />
    }
    return (

      <div className="container">
        <h1 className="alert alert-info">Component Lifecycle Demo</h1>
        <hr />

        <button className="btn btn-primary"
          onClick={() => {
            this.setState({ showCounterApp: !this.state.showCounterApp });
          }}
        >Show / Hide CounterApp component</button>

        { output}
      </div>


    );
  }
}

export default App; 