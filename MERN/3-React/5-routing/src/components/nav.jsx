import { Outlet, Link } from 'react-router-dom';


const Nav = () => {
    return(
    <div className="stack">
        <nav className="navbar navbar-expand-lg">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0 max-spread">
                <li className="nav-item">
                    <Link to='/'>Home</Link>
                </li>
                <li className="nav-item">
                    <Link to='/users'>Users</Link>
                </li>
                <li className="nav-item">
                    <Link to='/contact'>Contact</Link>
                </li>
            </ul>
        </nav>
        <Outlet />
    </div>
    );
}

export default Nav;