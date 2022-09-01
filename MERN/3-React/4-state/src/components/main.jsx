import Counter from './counter.jsx';
import Game from './game.jsx';
import Shopping from './shopping.jsx';

const Main = () => {
    return (
        <div className="App-main">
            <h2>Exercise One</h2>
            <h4>To declare state, two components are needed: an array with the name, and a function which updates it with
                 a call to useState. Using these two simple components, create a counter which starts at 0 and increases 
                 by one every time a button is pressed. </h4>
                 <br></br>
            <div className="output" height="10vh;">
                <Counter />
            </div>

            <hr></hr>

            <h2>Exercise Two</h2>
            <h4>As multiple elements may need to reflect the same changing data, lifting state is important. Use lifting 
                state to create a playerList for a gameRoom which players can be added to. </h4>
                <br></br>
            <div className="output" height="10vh;">
                <Game />
            </div>

            <hr></hr>

            <h2>Exercise Three</h2>
            <h4>Create a simple shopping cart which items can be easily added to using hooks
            </h4>
                <br></br>
            <div className="output" height="10vh;">
                <Shopping />
            </div>
        </div>
    );
}

export default Main; 