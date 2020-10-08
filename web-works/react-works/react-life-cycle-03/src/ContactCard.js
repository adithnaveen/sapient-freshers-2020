import React from 'react';

const ContactCard = ({ contact }) => (

    <div className="card" style={{
        width: "400px", height: "140",
        padding: "10px", margin: "15px"
    }}>
        <div className="row">
            <div className="row">
                <div className="col-md-4">
                    <img src={contact.picture} className="card-img"
                        alt={contact.name}
                        style={{ width: 100, height: 100 , marginLeft:"15px"}} />
                </div>

                <div className="col-md-8">
                    <h4 className="card-title" style={{marginLeft:"30px"}}>{contact.name}</h4>
                    <div className="card-text" style={{marginLeft:"30px"}}>{contact.email}</div>
                    <div className="card-text" style={{marginLeft:"30px"}}>{contact.phone}</div>
                </div>
            </div>

        </div>
    </div>
);

export default ContactCard; 
