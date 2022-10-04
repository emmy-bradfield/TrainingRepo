import {useState} from 'react';

const Login = () =>{
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");

    const LogDetails = e =>{
        e.preventDefault();
        console.log(username, password);
    };

    const addUsername = ({target}) => {
        setUsername(target.value);
    };

    const addPassword = ({target}) =>{
        setPassword(target.value);
    };

    return(
        <form className="stack center">
            Username: <input className="form-control" type="text" onChange={addUsername}></input>
            Password: <input className="form-control" type="password" onChange={addPassword}></input>
            <br></br>
            <button className="btn btn-primary btn-small" onClick={LogDetails}>SAVE</button>
        </form>
    );

}

export default Login;