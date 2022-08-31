import Calendar from './calendar.jsx';
import Data from '../data/events.json';

const Main = () => {
    return (
        <div className="App-main">
            <h3>Exercise One</h3>
            <h5>Create a simple display using props to read a JSON file and print out the contents</h5>
            <br></br>
            <div className="output" height="10vh;">
                <Calendar shindigs={Data} />
            </div>
        </div>
    );
}

export default Main;