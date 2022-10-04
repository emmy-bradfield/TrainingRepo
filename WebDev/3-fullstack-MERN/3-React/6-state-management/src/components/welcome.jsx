import Home from './home.jsx';
import Portfolio from './portfolio.jsx';
import FAQ from './faq.jsx';
import LoginBtn from './loginbtn';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Nav from './nav.jsx';
import { useState, Component } from 'react';
import api from '../api';

const Welcome = props => {
    const isLoggedIn = props.isLoggedIn;
    const setLoggedIn = props.setLoggedIn;

    const [email, setEmail] = useState("")
    const [password, setPassword] = useState("")
    const [_id, setID] = useState("")

    if (isLoggedIn) {
        return (
            <div className="stack center max-spread">
                <BrowserRouter>
                    <Routes>
                        <Route exact path="/" element={<Nav setLoggedIn={setLoggedIn} />}>
                            <Route index element={<Home />} />
                            <Route path="portfolio" element={<Portfolio />} />
                            <Route path="faq" element={<FAQ />} />
                        </Route>
                    </Routes>
                </BrowserRouter>
            </div>
        );
    } else {
        return (
            <div className="stack center">
                <h3> Please sign in </h3>
                <h4> You cannot access our resources without an a-cow-nt</h4>
                <div className="slide max-spread">

                    <div className="card text-bg-secondary mb-3">
                        <div className="card-body">
                            <form className="stack form-control center">
                                <h5>Login</h5>
                                <input className="form-control fit" type="text" placeholder="email" />
                                <br />
                                <input className="form-control fit" type="password" placeholder="password" />
                                <br />
                                <LoginBtn onClick={() => setLoggedIn(true)} />
                            </form>
                        </div>
                    </div>
                    <div className="card text-bg-secondary mb-3">
                        <div className="card-body">
                            <form className="stack form-control center">
                                <h5>Sign up</h5>
                                <input className="form-control fit" type="text" placeholder="email" onChange={setEmail} />
                                <br />
                                <input className="form-control fit" type="password" placeholder="choose password" onChange={setPassword} />
                                <br />
                                <button className="btn btn-dark btn-xs" onClick={() => setLoggedIn(true)}>Sign Up</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Welcome;