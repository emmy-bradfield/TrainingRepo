const Cart = ({ products, clearCart }) => {
    const ListItem = ({ productName }) => <li className="center">{productName}</li>

    return (
        <ul className="stack center">
            <div className="slide spread"><h4> Your Cart </h4> <button className="btn btn-dark" onClick={clearCart}> C </button></div>
            {products.map((productName, i) => (
                <ListItem productName={productName} key={i} />
            ))}
        </ul>
    );
}

export default Cart;