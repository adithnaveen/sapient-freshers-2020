import React, { Component } from 'react'

class ProductForm extends Component {
    state = {}

    addNewProduct = (event) => {
        console.log("Adding New Product");
        const name = this.refs.name.value;
        const price = this.refs.price.value
        const desc = this.refs.desc.value

        const p1 = { name, price, desc }
        console.log(p1);

        this.refs.name.value = '';
        this.refs.price.value = ''
        this.refs.desc.value = ''
        event.preventDefault();
    }

    render() {
        return (
            <div className="container">
                <form className='form' onSubmit={this.addNewProduct} >

                    <div className="form-group row">
                        <label htmlFor="" className="control-label col-md-4">Product Name</label>
                        <div className="col-md-8">
                            <input ref="name" type="text" className="form-control" />
                        </div>
                    </div>
                    <div className="form-group row">
                        <label htmlFor="" className="control-label col-md-4">Product Price</label>
                        <div className="col-md-8">
                            <input ref="price" type="text" className="form-control" />
                        </div>
                    </div>
                    <div className="form-group row">
                        <label htmlFor="" className="control-label col-md-4">Product Description</label>
                        <div className="col-md-8">
                            <input ref="desc" type="text" className="form-control" />
                        </div>
                    </div>
                    <button className="btn btn-primary">Save Product</button>
                </form>
            </div>
        );
    }
}

export default ProductForm;