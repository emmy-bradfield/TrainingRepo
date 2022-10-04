import HappyCow from '../assets/happycow.jpg';
import SadCow from '../assets/sadcow.jpg';

const Display = props => {
    const isLoggedIn = props.isLoggedIn;
    if (isLoggedIn) {
        return (
            <div className="stack center">
                <h3> Welcome Back! </h3>
                <h4> QA A-cow-demy: Where dreams come moo</h4>
                <img src={HappyCow}></img>
            </div>
        );
    } else {
        return(
            <div className="stack center">
                <h3> Please sign in </h3>
                <h4> You cannot access our resources without an a-cow-nt</h4>
                <img src={SadCow}></img>
            </div>
        );
    }
};

export default Display;