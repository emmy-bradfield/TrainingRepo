import { useState, useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';

const UsersRoute = () => {
    const { cowID } = useParams();

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
        let newUser = { "id": id, "username": name, "password": pass, "cow": cow };
        setUsers(Users => [...Users, newUser]);
        count++;
    }

    useEffect(() => {
        localStorage.setItem("id", id);
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
                    <input className="form-control" id="user" type="text" placeholder="create a username" onChange={handleName} />
                    <input className="form-control" id="pass" type="password" placeholder="set a password" onChange={handlePassword} />
                </div>
                <br></br>
                <button className="btn btn-dark btn-xs" onClick={signup}>Sign Up</button>
            </form>
            <br></br>

            <div className="stack center max-spread">
                <h3>View a-COW-nt types!!</h3>
                <form className="stack center max-spread">
                    <div className="slide max-spread">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0 max-spread slide">
                            <li className="nav-item">
                                <Link to='/users/1'>Type One</Link>
                            </li>
                            <li className="nav-item">
                                <Link to='/users/2'>Type Two</Link>
                            </li>
                            <li className="nav-item">
                                <Link to='/users/3'>Type Three</Link>
                            </li>
                        </ul>
                    </div>
                    <br></br>
                </form>
                <h3>You've selected cow type {cowID} </h3>
            </div>

        </div>
    );
}

export default UsersRoute;