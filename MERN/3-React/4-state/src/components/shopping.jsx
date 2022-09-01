import { useState } from 'react';

const Items = [
    { id: 1, name: "Mice", cost: 2.50, count: 0 },
    { id: 2, name: "Dice", cost: 0.50, count: 0 },
    { id: 3, name: "Spice", cost: 3.50, count: 0 },
    { id: 4, name: "Rice", cost: 1.50, count: 0 }
]

const Shopping = () => {

    return (
        <div className="slide">
            <div>
                <h4> NICEstore </h4>
                <form>
                    <ul className="stack">
                        {Items.map((product) => (
                            <li className="spread" key={product.id}>
                                <div>{product.name}</div>
                                <em>£{product.cost}0</em>
                                <div>
                                    <input className="form-control small" type="number" min="0"/>
                                </div>
                                <div>

                                </div>
                            </li>
                        ))}
                    </ul>
                </form>
            </div>
        </div>
    );
};

export default Shopping;