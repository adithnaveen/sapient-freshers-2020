import React, { Component } from 'react'


const Btn = ({ caption, handler }) => (
    // props in react always shippped with hander 
    <button className="btn btn-secondary" onClick={handler}>
        {caption}
    </button>
)


class CounterApp extends Component {
    state = {
        num: 0
    }

    increment = () => {
        // do not mutate the state variable directly 
        // rather use setState 
        // this.state.num++;
        this.setState({ num: this.state.num + 1 });

    }
    decrement = () => {
        // this.state.num--;
        this.setState({ num: this.state.num - 1 });
    }

    incrementOrDecrement = (val) => {
        this.setState({ num: this.state.num + val });
    }

    render() {
        // do not mutate setState in render as it calls render again 
        // this.setState({ num: this.state.num + 1 })

        return (
            <div className="container">
                <h2 className="alert alert-info">Counter App </h2>
                <hr />
                <h3>Value of Number : {this.state.num} </h3>

                <button
                    className="btn btn-primary"
                    onClick={this.increment} >
                    Increment - 1
                </button>


                <button
                    className="btn btn-primary"
                    onClick={() => this.incrementOrDecrement(1)} >
                    Increment
                </button>

                <button
                    className="btn btn-primary"
                    onClick={() => this.incrementOrDecrement(-1)}>
                    Decrement
                </button>
                <hr />
                <Btn caption="Increment" handler={() => this.incrementOrDecrement(1)}></Btn>
                <Btn caption="Decrement" handler={() => this.incrementOrDecrement(-1)}></Btn>


            </div >
        );
    }
}

export default CounterApp;