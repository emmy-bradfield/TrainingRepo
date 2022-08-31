import Bees from './bees.jsx';
import Menu from './menu.jsx';

const Main = () => {
    return (
        <div className="App-main">
            <h3>Exercise One</h3>
            <h5>Create a new .jsx file called with a defined Function component. It should have props
                as an argument, and a return that has: </h5>
                <ul className="tasks">
                    <li>
                        A wrapping React Fragment
                    </li>
                    <li>
                        A {"<h1>"} that uses header from props as its content
                    </li>
                    <li>
                        A {"<p>"} that uses content from props as its content
                    </li>
                    <li>
                        A {"<p>"} that uses number from props as its content along with some text
                    </li>
                    <li>
                        A {"<p>"} that uses nonexistent from props as its content along with some text
                    </li>
                </ul>
                <h5>Following this, make sure to do the following:</h5>
                <ul className="tasks">
                    <li>
                        Export the component as default
                    </li>
                    <li>
                        Import the new component into another .jsx file
                    </li>
                    <li>
                        Ensure that you wrap the return of your component in a React Fragment
                    </li>
                    <li>
                        Save and run the file to see the results
                    </li>
                </ul>
            <br></br>
            <div className="output" height="10vh;">
                <Bees />
            </div>

            <hr></hr>

            <h3>Exercise Two</h3>
            <h5>Use props to create a recipe and menu template </h5>
            <br></br>
            <div className="output">
                <Menu />
            </div>
        </div>
    );
}

export default Main;