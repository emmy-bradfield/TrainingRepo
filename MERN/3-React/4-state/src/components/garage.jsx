import { useState } from 'react';

const Garage = () => {
    const [brand, setBrand] = useState("");
    const [model, setModel] = useState("");
    const [colour, setColour] = useState("");
    const [year, setYear] = useState("");

    return (
        <div className="stack center">
            <h3> My Car! </h3>
            <form className="form-control slide margin-center">
                <div>
                    <input className='form-control fit' type="text" name="make" placeholder="Make" value={brand} onChange={e => setBrand(e.target.value)}></input>
                    <input className='form-control fit' type="text" name="model" placeholder="Model" value={model} onChange={e => setModel(e.target.value)}></input>
                </div>
                <div>
                    <input className='form-control fit' type="text" name="colour" placeholder="Colour" value={colour} onChange={e => setColour(e.target.value)}></input>
                    <input className='form-control fit' type="text" name="year" placeholder="Year" value={year} onChange={e => setYear(e.target.value)}></input>
                </div>
            </form>
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

export default Garage;