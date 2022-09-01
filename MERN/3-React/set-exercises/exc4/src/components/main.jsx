import Shop from './shop.jsx'
import Article from './article.jsx';

const Main = () => {
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
        </div>
    );
}

export default Main; 