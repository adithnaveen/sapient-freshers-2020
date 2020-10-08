import React from 'react';
import ContactCard from "./ContactCard";
import loading from './loading'
const ContactList = ({ contacts }) => (
    <div>
        {contacts.map(c => <ContactCard contact={c} key={c.id} />)}
    </div>
)
 
// export default loading(ContactList);  

// carrier function 
export default loading("contacts")(ContactList)