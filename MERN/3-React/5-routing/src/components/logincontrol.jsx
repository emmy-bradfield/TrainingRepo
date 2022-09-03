import { useState } from 'react';
import Login from './login.jsx';
import Logout from './logout';
import Display from './display.jsx';

const LoginControl = () => {
    const [isLoggedIn, setLoggedIn] = useState(true);
    let button = (isLoggedIn) ? <Logout onClick={() => setLoggedIn(false)}/> : <Login onClick={() => setLoggedIn(true)} />
    return(
        <div className="stack center">
            <Display isLoggedIn={isLoggedIn}/>
            <br />
            {button}
        </div>
    );    
}

export default LoginControl;