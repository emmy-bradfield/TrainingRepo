const Basics = () => {
    return (
        <>
            <p>
                1. Create a basic React App using
                <div className="emcode">$ npx create-react-app app-name</div>
                and start it with
                <div className="emcode">
                    $ cd path/to/app
                    <br></br>
                    $ npm start
                </div>
            </p>
            <p>
                2. Use jsx to create a component and export it
                <div className="emcode">
                    <h5>src/components/Component.jsx</h5>
                    <br></br>
                    {"const Component = () => {"}
                    <br></br>
                    &nbsp; &nbsp; {"return("}
                    <br></br>
                    &nbsp; &nbsp; &nbsp; &nbsp; {"<h1>This is a header</h1>"}
                    <br></br>
                    &nbsp; &nbsp; {");"}
                    <br></br>
                    {"}"}
                    <br></br>
                    <br></br>
                    {"export default Component;"}
                </div>
                then import and call it in the App.js file
                <div className="emcode">
                    <h5>src/App.js</h5>
                    <br></br>
                    {"import './app.css'"}
                    <br></br>
                    {"import Component from './components/component.jsx"}
                    <br></br>
                    <br></br>
                    {"function App(){"}
                    <br></br>
                    &nbsp; &nbsp; {"return("}
                    <br></br>
                    &nbsp; &nbsp; &nbsp; &nbsp; {"<Component />"}
                    <br></br>
                    &nbsp; &nbsp; {");"}
                    <br></br>
                    {"}"}
                    <br></br>
                    <br></br>
                    {"export default App;"}
                </div>
            </p>
        </>
    );
}

export default Basics;