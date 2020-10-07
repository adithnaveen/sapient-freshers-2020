import React, { Component } from 'react'


class EmployeeForm extends Component {
    state = {
        name: '',
        email: '',
        phone: '',
        picture: '',
        formError: {
            name: 'Name is required',
            email: 'Email is required',
            phone: 'phone is required'
        }, 
        errorMessages : null
    };

    tfHandler = (evt) => {
        // console.log(evt.target);
    
        let { name, value } = evt.target;
        let { formError } = this.state;

        switch (name) {
            case 'name':
                if (!value || value.length == 0) {
                    formError.name = "Name is required";
                } else if (value.length < 3 || value.length > 20) {
                    formError.name = "Name much be entered betwen 3 - 20 chars "
                } else {
                    formError.name = '';
                }
                break;
            case 'email':
                if (!value || value.length == 0) {
                    formError.email = "Email is required";
                } else if (!value.match(/^([\w.%+-]+)@([\w-]+\.)+([\w]{2,})$/i)) {
                    formError.email = "Sorry invalid Email"
                } else {
                    formError.email = '';
                }
                break;
            case 'phone':
                if (!value || value.length == 0) {
                    formError.email = "Phone Number is required";
                } else if (!value.match(/\d{10,12}$/)) {
                    formError.phone = "Sorry invalid phone"
                } else {
                    formError.phone = '';
                }
                break;
            default:
                break;
        }

        this.setState ({[name]:value, formError }); 


    }

    // helper function 
    validateForm =(formError) =>{
        let valid = true; 
        Object.values(formError).forEach(err => valid = valid && err.length ===0 )
        return valid; 
    }

    // if successful you can add 
    submitHandler = (event) =>{
        console.log("submit handler called... ");
        
        event.preventDefault(); 
        let {formError} = this.state; 


        if(this.validateForm(formError)){
            alert("Form Submitted")
        }else{
            let errorMessages = Object.values(formError).map((err, index) =>   
                err.length === 0?null:<li key={index}>{err}</li>); 

	// as soon as you call set state the render method will be called.          
   this.setState({errorMessages}); 
        }
    }


    render() {
        return (
            <div className="row">
                <div className="col">
                    <h3>Add New Employee</h3>

                    <form className="form" onSubmit={this.submitHandler}>

                        <div className="form-group row ">
                            <label htmlFor="" className="control-label col-md-4">Employee Name </label>
                            <div className="col-md-8">
                                <input value={this.state.name} onChange={this.tfHandler}
                                 name="name" type="text" 
                                 className="form-control" />
                            </div>
                        </div>
                        <div className="form-group row ">
                            <label htmlFor="" className="control-label col-md-4">Employe email </label>
                            <div className="col-md-8">
                                <input value={this.state.email} onChange={this.tfHandler} name="email" type="text" className="form-control" />
                            </div>
                        </div>
                        <div className="form-group row ">
                            <label htmlFor="" className="control-label col-md-4">Contact Number  </label>
                            <div className="col-md-8">
                                <input value={this.state.phone} onChange={this.tfHandler} name="phone" type="text" className="form-control" />
                            </div>
                        </div>
                        <div className="form-group row ">
                            <label htmlFor="" className="control-label col-md-4">Photo </label>
                            <div className="col-md-8">
                                <input value={this.state.pic} onChange={this.tfHandler} name="pic" type="text" className="form-control" />
                            </div>
                        </div>

                        <button className="btn btn-primary">Save</button>
                    </form>
                </div>


                <div className="col">
                    <h2>Current State</h2>
                    <pre>{JSON.stringify(this.state, null, 2)}</pre>
                </div>

                <ul>
                    {this.state.errorMessages}
                </ul>
            </div>
        );
    }
}


export default EmployeeForm; 