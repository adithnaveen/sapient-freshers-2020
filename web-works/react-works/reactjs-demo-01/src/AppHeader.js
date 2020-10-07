import React, { Component, Fragment } from 'react'

export default  class AppHeader extends Component {
    render() {

        console.log(this);
        console.log(this.props);
        return (
            <Fragment>
                <h1>{this.props.title}</h1>
               
                <h2>{this.props.company}</h2>
                <hr/>
            </Fragment>
        );
    }
} 

