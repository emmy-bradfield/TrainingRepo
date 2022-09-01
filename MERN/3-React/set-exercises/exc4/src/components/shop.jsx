import { useState } from 'react';
import Cart from './cart.jsx';
import ProductList from './productList.jsx';

const Shop = () => {
    const [products, setProducts] = useState([]);
    const [productName, setProductName] = useState("");

    const submitForm = (event) => {
        event.preventDefault();
    };

    const addProduct = ({ target }) => {
        setProductName(target.value)
        setProducts(products => [...products, productName])
    }

    const clearCart = () =>{
        setProducts([]);
    }

    return (
        <div className="slide">
            <ProductList submitForm={submitForm} addProduct={addProduct} />
            <Cart products={products} clearCart={clearCart}/>
        </div>
    );
};

export default Shop;