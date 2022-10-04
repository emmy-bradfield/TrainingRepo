import Clock from './clock.jsx';

const Main = () => {
    return (
        <div className="App-main">
            <h1> 3. Lifecycle</h1>
            <h3>3.1 Lifecycle</h3>
            <h4>Using lifecycle management to create a simple clock which will print to the console and demonstrate
                the order in which various methods were called. </h4>
            <div className="output" height="10vh;">
                <Clock />
            </div>
        </div>
    );
}

export default Main; 