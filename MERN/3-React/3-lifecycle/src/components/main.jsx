import Clock from './clock.jsx';

const Main = () => {
    return (
        <div className="App-main">
            <h2>Exercise One</h2>
            <h3>Using lifecycle management to create a simple clock which will print to the console and demonstrate
                the order in which various methods were called. </h3>
            <div className="output" height="10vh;">
                <Clock />
            </div>
        </div>
    );
}

export default Main; 