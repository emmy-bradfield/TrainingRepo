import Shop from './shop.jsx'
import Article from './article.jsx';
import Name from './name.jsx';
import { useState } from 'react';

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
            <h2>Exercise One</h2>
            <h3>Create a simple shopping cart function which uses state lifting to allow a users to add items to cart,
                as well as removing them or clearing the list
            </h3>
            <div className="output" height="10vh;">
                <Shop />
            </div>

            <hr></hr>

            <h2>Exercise Two</h2>
            <h3>Incorporate the useState hook and create a component that displays some text with a 'read more' link
                at the end, and will expand to show the rest of the text when the link is clicked.
            </h3>
            <div className="output" height="10vh;">
                <Article />
            </div>

            <h2> Exercise Three</h2>
            <h3>Create a component which has a name passed in as property then displays the name in the return of the
                component, incorporate a useEffect hook so that the document title updates only when the prop name changes
            </h3>
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