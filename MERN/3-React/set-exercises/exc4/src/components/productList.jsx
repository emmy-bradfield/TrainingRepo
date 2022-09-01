const ProductList = ({ submitForm, addProduct}) => {

    return (
        <form onSubmit={submitForm}>
            <ul className="stack">
                <h4> Products </h4>
                <li>
                    <input type="text" value="Product One" disabled />
                    <button className="btn btn-primary" value="Product One" onClick={addProduct}>Add to cart</button>
                </li>
                <li>
                <input type="text" value="Product Two" disabled />
                    <button className="btn btn-primary" value="Product Two" onClick={addProduct}>Add to cart</button>
                </li>
            </ul>
        </form>
    );
}

export default ProductList;