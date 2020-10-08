import React, { Component } from 'react'

// since this is class basec component the prop is implicit 
class CounterApp extends Component {
    state = {
        count: 1
    }
    num = 1;

    constructor() {
        super();
        console.log('CounterApp.constructor called');
    }

    render() {
        console.log('CounterApp.render() called');

        return (
            <div>
                <h3>{this.props.title}</h3>
                <p>Value of count is {this.state.count}</p>
                <p>Value of num is {this.num}</p>

                <button className="btn btn-secondary"
                    onClick={
                        () => this.setState({ count: this.state.count + 1 })
                    }
                >Increment count</button>

                <button className="btn btn-secondary"
                    onClick={
                        () => {
                            this.num++;
                            this.forceUpdate();
                        }
                    }
                > Increment Num
                </button>


            </div >
        );
    }
    static getDerivedStateFromProps() {
        console.log('CounterApp.getDerivedStateFromProps called');
        return null;
    }
    componentWillUnmount() {
        console.log("CounterApp:componentWillUnmount - Invoked");
    }

    componentDidUpdate() {
        console.log("CounterApp:componentDidUpdate - Called ");
    }

    componentDidMount() {
        console.log('CounterApp.componentDidMount called');
    }

    getSnapshotBeforeUpdate() {
        console.log('CounterApp.getSnapshotBeforeUpdate called');
        return null;
    }

    shouldComponentUpdate() {
        return true;
    }
}

export default CounterApp;