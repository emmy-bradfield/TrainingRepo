import Cat from './cat.jsx';
import Poppy from '../assets/poppy.jpg';
import Display from './display.jsx';
import Footer from './footer.jsx';

const Main = () => {
    return (
        <div className="App-main">
            <h1>1. Intro and Component Hierarchy</h1>
            <h3>1.1 - Introduction</h3>
            <h4>In this Exercise, you should edit your App.js page, using the general layout from the example in the
                module, to render some HTML on the page with some CSS styling</h4>
            <br></br>
            <div className="output" height="10vh;">
                <Display />
            </div>

            <hr></hr>

            <h3> 1.2 JSX</h3>
            <h4>Inside the React application you made in the Introduction module, implement some JSX which renders
                a component on the screen</h4>
            <br></br>
            <div className="output">
                <img src={Poppy}></img>
                <Cat />
            </div>

            <hr></hr>

            <h3> 1.3 Component Hierarchy</h3>
            <h4>Create another component, this time for the footer of the page. This should have a constant
                called AnotherComponent that takes no arguments, and returns 3-4 {"<p>"} elements with the
                use of React Fragments. Ensure to export MyComponent as a default and add the component to
                your MyComponent file. Wrap your h1 tag and your AnotherComponent tag in a React Fragment
                {"(ensuring AnotherComponent is imported)"}. Save and run to see the result.</h4>
            <div className="output">
                <em> See website footer for result </em>
            </div>
        </div>
    );
}

export default Main;