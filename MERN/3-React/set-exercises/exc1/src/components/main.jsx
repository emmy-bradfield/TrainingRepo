import Cat from './cat.jsx';
import Poppy from '../assets/poppy.jpg';
import Display from './display.jsx';
import Pretty from './pretty.jsx';

const Main = () => {
    return (
        <div className="App-main">
            <h3>Exercise One</h3>
            <h5>In this Exercise, you should edit your App.js page, using the general layout from the example in the
                module, to render some HTML on the page with some CSS styling</h5>
            <br></br>
            <div className="output" height="10vh;">
                <Display />
            </div>

            <hr></hr>

            <h3> Exercise Two</h3>
            <h5>Inside the React application you made in the Introduction module, implement some JSX which renders
                a component on the screen</h5>
            <br></br>
            <div className="output">
                <img src={Poppy}></img>
                <Cat />
            </div>

            <hr></hr>

            <h3> Exercise Three</h3>
            <h5>Edit your App.js page, using the general layout from the example in the module, to render some HTML 
                on the page with some CSS styling</h5>
            <br></br>
            <div className="output">
                <Pretty />
            </div>
        </div>
    );
}

export default Main;