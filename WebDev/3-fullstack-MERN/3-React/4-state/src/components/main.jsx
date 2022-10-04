import {useState} from 'react';
import Login from './login.jsx';
import Car from './car.jsx';
import Garage from './garage.jsx';
import Products from './products.jsx';
import Shopping from './shopping.jsx';
import Article from './article.jsx';
import Name from './name.jsx';

const Main = () => {

    const [name, setName] = useState("Emily");

    const pageName = () => {
        setName(document.querySelector("#input").value);
    }
    const submitForm = (event) => {
        event.preventDefault();
    };

    return (
        <div className="App-main">
            <h1> 4. State, Lifting State, and Hooks</h1>
            <br></br>
            <h3>4.1.1 State</h3>
            <h4>Create a component that saves customer's username and password from the input of a form -
                use hooks for this exercise. </h4>
            <br></br>
            <div className="output" height="10vh;">
                <Login />
            </div>

            <hr></hr>

            <h3>4.1.2 State</h3>
            <h4>Create a car component which stores the below properties in the state - render a page which
                retrieves the values from the state and prints them to the screen.
                {"(Brand, Model, Colour, and Year) "}
            </h4>
            <br></br>
            <div className="output" height="10vh;">
                <Car />
            </div>

            <hr></hr>

            <h3>4.1.3 State</h3>
            <h4>Write code so that the state of each of the properties can be modified by user input.
            </h4>
            <br></br>
            <div className="output" height="10vh;">
                <Garage />
            </div>

            <hr></hr>

            <h3>4.1.4 State</h3>
            <h4>Create a ProductTable component that filters information based on the vaule of a Search field.
            </h4>
            <br></br>
            <div className="output" height="10vh;">
                <Products />
            </div>

            <hr></hr>

            <h3>4.2</h3>
            <h4>Create a simple product manager application which meets the following requirements:</h4>
            <h5><ul>
                <li>
                    - A user should be able to add an item to their basket
                </li>
                <li>
                    - At a later stage, the user should be able to amend the items in their basket, including
                    removing or updating the quantity of an item.
                </li>
            </ul></h5>

            <br></br>
            <div className="output" height="10vh;">
                <Shopping />
            </div>

            <hr></hr>

            <h2>4.3.1</h2>
            <h4>Incorporate the useState hook and create a component that displays some text with a 
                'read more' link at the end, and will expand to show the rest of the text when the link is 
                clicked.
            </h4>
            <br></br>
            <div className="output" height="10vh;">
                <Article />
            </div>
            <hr></hr>

            <h2>4.3.2</h2>
            <h4>Create a component which has a name passed in as property then displays the name in the return 
                of the component, incorporate a useEffect hook so that the document title updates only when the 
                prop name changes
            </h4>
            <br></br>
            <div className="output" height="10vh;">
                <form onSubmit={submitForm}>
                    <input id="input" type="text" className="form-control"/>
                    <button className="btn btn-dark" onClick={pageName}>UPDATE</button>
                </form>
                <Name name={name} />
            </div>
        </div>
    );
}

export default Main; 