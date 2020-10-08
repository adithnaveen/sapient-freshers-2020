// import React, { Component } from 'react'

// class based component 
// function loading(OldComponent) {

//    return class NewComponent extends Component {
//         render() {
               
//                 let output = <OldComponent {... this.props} /> 
//                 console.log(this.props.contacts.length);
//                 if(this.props.contacts.length ===0) {
//                     output = <p className="text-center">Loading Please wait... </p>
//                 }
//              return output; 
//         }
//     }

// }


// function basec component 
import React from 'react'

function isEmpty(data) {
    if(data && data instanceof Array){
        return data.length ===0; 
    }
    // if it is not array 
    if(data){
        return Object.keys(data).length ===0; 
    }
    return false; 
}

const loading = (property) => (OldComponent) => (props) => {
    let output = <OldComponent {... props} /> 

    if(isEmpty(props[property])) {
        output = <p className="text-center">Loading Please wait... </p>
    }
    return output; 
}



export default loading;