import { useState } from 'react';

const Shopping = () => {
    const [items, setItems] = useState([]);
    const [itemName, setItemName] = useState("");
    const [itemCost, setItemCost] = useState("");

    const addItem = event => {
        event.preventDefault();
        setItems([...items, { id: items.length, name: itemName, cost: itemCost }]);
        setItemName("");
        setItemCost("");
    }

    const clear = () =>{
        setItemName("");
        setItemCost("");
        setItems([]);
    }

    return (
        <div className="stack">
            <form className="slide" onSubmit={addItem}>
                <input className="form-control" type="text" name="Item" placeholder="Enter an item" value={itemName} onChange={(e) => setItemName(e.target.value)} />
                &nbsp; &nbsp; <h3 className="prefix">£</h3>
                <input className="form-control small" type="number" name="Item" prefix="£" placeholder='GBP' fixedDecimalLength={2} value={itemCost} onChange={(e) => setItemCost(e.target.value)} />
                <button className="btn btn-dark" type="submit">Add</button>
                <button className="btn btn-dark" type="submit" onClick={clear}>Clear</button>
            </form>
            <br></br>
            <ul>
                {items.map(item => (
                    <li className="slide spread" key={item.id}><div>{item.name}</div><em>{item.cost}</em></li>
                ))}
            </ul>
        </div>
    );
};

export default Shopping;