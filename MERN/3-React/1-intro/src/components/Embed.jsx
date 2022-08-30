const Embed = () => {
    const address = {
        number: 12,
        street: "pseudo lane",
        city: "realton",
        postcode: "NE1 4PP",
    }
    return (
        <>
            <p>
                1. Create a constant object for address
                <div className="emcode">
                    <h5> /src/components/objects </h5>
                    <br></br>
                    {"const address = {"}
                    <br></br>
                    &nbsp; &nbsp; {"number: '12'"}
                    <br></br>
                    &nbsp; &nbsp; {"street: 'pseudo lane'"}
                    <br></br>
                    &nbsp; &nbsp; {"city: 'realton'"}
                    <br></br>
                    &nbsp; &nbsp; {"postcode: 'NE1 4PP'"}
                    <br></br>
                    {"}"}
                </div>
                which can be embeded within a component
                <div className="emcode">
                    <h5>src/components/AddressReader.jsx</h5>
                    <br></br>
                    {"const Address = () => {"}
                    <br></br>
                    <br></br>
                    {"const address = {"}
                    <br></br>
                    &nbsp; &nbsp; {"number: '12'"}
                    <br></br>
                    &nbsp; &nbsp; {"street: 'pseudo lane'"}
                    <br></br>
                    &nbsp; &nbsp; {"city: 'realton'"}
                    <br></br>
                    &nbsp; &nbsp; {"postcode: 'NE1 4PP'"}
                    <br></br>
                    {"}"}
                    <br></br>
                    <br></br>
                    &nbsp; &nbsp; {"return("}
                    <br></br>
                    &nbsp; &nbsp; &nbsp; &nbsp; {"<h2>Your address is:</h2>"}
                    <br></br>
                    &nbsp; &nbsp; &nbsp; &nbsp; {"<div>"}
                    <br></br>
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;{"<h4>{address.number} {address.street}</h4>"}
                    <br></br>
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;{"<h4>{address.city}</h4>"}
                    <br></br>
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;{"<h4>{address.postcode}</h4>"}
                    <br></br>
                    &nbsp; &nbsp;&nbsp; &nbsp;{"</div>"}
                    <br></br>
                    &nbsp; &nbsp; {");"}
                    <br></br>
                    {"}"}
                    <br></br>
                    <br></br>
                    {"export default Address;"}
                </div>
                and then imported and called into our App
                <div className="emcode">
                    <h5>src/App.js</h5>
                    <br></br>
                    {"import './app.css'"}
                    <br></br>
                    {"import Component from './components/component.jsx"}
                    <br></br>
                    {"import Address from './components/address.jsx"}
                    <br></br>
                    <br></br>
                    {"function App(){"}
                    <br></br>
                    &nbsp; &nbsp; {"return("}
                    <br></br>
                    &nbsp; &nbsp; &nbsp; &nbsp; {"<Component />"}
                    <br></br>
                    &nbsp; &nbsp; &nbsp; &nbsp; {"<Address />"}
                    <br></br>
                    &nbsp; &nbsp; {");"}
                    <br></br>
                    {"}"}
                    <br></br>
                    <br></br>
                    {"export default App;"}
                </div>
            </p>
            <h3> RESULT:</h3>
            <div className="output">
                <h1>This is a header</h1>
                <div className="div2">
                    <h2>Your address is:</h2>
                    <div className="div3">
                        <h4>{address.number} {address.street}</h4>
                        <h4>{address.city}</h4>
                        <h4>{address.postcode}</h4>
                    </div>
                </div>
            </div>
        </>
    );
}

export default Embed;