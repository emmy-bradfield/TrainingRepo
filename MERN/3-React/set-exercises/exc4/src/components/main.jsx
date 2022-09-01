import Shop from './shop.jsx'

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
        </div>
    );
}

export default Main; 