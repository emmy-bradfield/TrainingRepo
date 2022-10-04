import { useState } from 'react';
import Welcome from './welcome.jsx';

const LoginController = () => {
    const [isLoggedIn, setLoggedIn] = useState(false);
    return (
        <div className="stack center max-spread">
            <h2> Welcome to the A-cow-demy of Moo-sic</h2>
            <hr/>
            <Welcome isLoggedIn={isLoggedIn} setLoggedIn={setLoggedIn}/>
        </div>
    );

};

export default LoginController;