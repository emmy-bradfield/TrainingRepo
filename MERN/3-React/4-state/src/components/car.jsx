import { useState } from 'react';

const Car = () => {
    const [brand, setBrand] = useState("____");
    const [model, setModel] = useState("____");
    const [colour, setColour] = useState("____");
    const [year, setYear] = useState("____");

    const reveal = () => {
        setBrand("Ford");
        setModel("Focus");
        setColour("Silver");
        setYear("2009");
    }

    const hide = () => {
        setBrand("____");
        setModel("____");
        setColour("____");
        setYear("____");
    }

    return (
        <div className="stack center">
            <h3> My Car! </h3>
            <div className="spread margin-center">
                <button className="btn btn-secondary btn-small" onClick={reveal}>Reveal!</button>
                <button className="btn btn-secondary btn-small" onClick={hide}>Hide!</button>
            </div>
            <br></br>
            <ul>
                <li>
                    My car is made by {brand}. &nbsp;
                </li>
                <li>
                    It is a {brand} {model}. &nbsp;
                </li>
                <li>
                    I love my {colour} {brand} {model}. &nbsp;
                </li>
                <li>
                    My wonderful {colour} {brand} {model} was built in {year}. &nbsp;
                </li>
            </ul>
        </div>
    );
}

export default Car