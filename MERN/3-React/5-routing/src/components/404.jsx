import Cow from '../assets/sadcow.jpg'

const NotFound = () => {
    return (
        <div className="stack center">
            <h1>404 ERROR: Page not found</h1>
            <img src={Cow}/>
            <p>this makes the cow sad</p>
        </div>
    );
}

export default NotFound;