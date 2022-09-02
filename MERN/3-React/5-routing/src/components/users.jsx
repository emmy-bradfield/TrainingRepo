import { useState, useEffect } from 'react';

const Users = () => {
    const [name, setUsername] = useState("");
    const [pass, setPassword] = useState("");
    const [id, setId] = useState("");
    const [Users, setUsers] = useState([]);
    const [cow, setCow] = useState("");

    let count = 1;

    function getRandomInt(min, max) {
        min = Math.ceil(min);
        max = Math.floor(max);
        return Math.floor(Math.random() * (max - min + 1) + min);
    };

    const handleName = e => {
        setUsername(e.target.value);
    };

    const handlePassword = e => {
        setPassword(e.target.value);
    };

    const signup = (e) => {
        e.preventDefault();
        setId(count);
        setCow(getRandomInt(1, 3));
        let newUser = {"id": id, "username": name, "password": pass, "cow": cow};
        setUsers(Users => [...Users, newUser]);
        count++;
    }

    useEffect(() => {
        localStorage.setItem("id",id);
        localStorage.setItem("username", name);
        localStorage.setItem("password", pass);
        localStorage.setItem("cow", cow);
        localStorage.setItem("Users", JSON.stringify(Users))
    }, [id, name, pass, cow, Users])

    return (
        <div className="stack center">
            <h3> Create your a-COW-nt below! </h3>
            <form className="stack center">
                <div className="slide">
                    <input className="form-control" id="user" type="text" placeholder="create a username" onChange={handleName}/>
                    <input className="form-control" id="pass" type="password" placeholder="set a password" onChange={handlePassword}/>
                </div>
                <br></br>
                <button className="btn btn-dark btn-xs" onClick={signup}>Sign Up</button>
            </form>
            <br></br>
        </div>
    );
}

export default Users;