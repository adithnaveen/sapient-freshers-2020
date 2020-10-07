import React, { Component } from 'react'
import './AppContent.css'

class AppComponent extends Component {
    // btnHandler() {
    //     console.log("Button clicked from App Component");
    // }

    constructor() {
        super()
        this.btnHandler = this.btnHandler.bind(this);
    }

    btnHandler = () => {
        console.log("Button clicked from App Component");
    }

    render() {
        return (
            <div className="app-content">
                <button className="btn btn-primary"
                    onClick={this.btnHandler}>
                    click me </button>

                <h2>This is Component Data</h2>
                <h2>This is Component Data</h2>
                <h2>This is Component Data</h2>
                <h2>This is Component Data</h2>
                <h2>This is Component Data</h2>
            </div>
        );
    }
}

export default AppComponent;