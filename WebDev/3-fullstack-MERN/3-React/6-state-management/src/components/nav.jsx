import { Outlet, Link } from 'react-router-dom';
import { useState } from 'react';
import LogoutBtn from './logoutbtn.jsx';

const Nav = props => {
    const setLoggedIn = props.setLoggedIn;

    return (
        <div className="stack max-spread">
            <nav className="navbar navbar-expand-lg max-spread">
                <div className="container-fluid">
                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0 max-spread">
                            <li className="nav-item nav-link">
                                <Link to='/'><h3 className="nav-text">Home</h3></Link>
                            </li>
                            <li className="nav-item nav-link">
                                <Link to='/portfolio'><h3 className="nav-text">Portfolio</h3></Link>
                            </li>
                            <li className="nav-item nav-link">
                                <Link to='/faq'><h3 className="nav-text">FAQ</h3></Link>
                            </li>
                            <li className="nav-item nav-link nav-btn">
                                <LogoutBtn onClick={() => setLoggedIn(false)} />
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <Outlet />
        </div>
    );
}

export default Nav;