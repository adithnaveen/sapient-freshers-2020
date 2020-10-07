import React from 'react'
import './AppFooter.css';
 
export default function AppFooter (props) {
    console.log(props);
    return (
        <div>
            <hr />
            <p className="app-footer">This is my footer</p>
    <p className="app-footer">{props.company} | {props.website} | {props.year}</p>
        </div>

    );
}