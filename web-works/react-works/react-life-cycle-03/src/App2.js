import React, { Component } from 'react'
import ContactList from './ContactList'
import 'bootstrap/dist/css/bootstrap.css'

class App2 extends Component {

  state = {
    contacts: []
  }

  // to invoke the end point http://localhost:4000/contacts
  // version 1.0 
  // componentDidMount() {
  //   fetch("http://localhost:4000/contacts")
  //     .then(resp => resp.json())
  //     .then(data => this.setState({contacts:data}))
  // }

  // version 2 
  async componentDidMount() {
    let resp = await fetch("http://localhost:4000/contacts")
    let data = await resp.json();
    this.setState({ contacts: data })
  }

  render() {
    return (
      <div className="container">
        <h1 className="alert alert-info">HOC Example</h1>
        <div className="row">
          <div className="col">
            <ContactList contacts={this.state.contacts} />
          </div>
        </div>
      </div>
    ) 
  } 


}



export default App2;