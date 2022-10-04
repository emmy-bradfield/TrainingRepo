import { Link, Outlet } from 'react-router-dom';

const Nav = () => {
    return (
        <div className="navbar">
            <nav className="navbar">
                <ul className="navbar-nav me-auto mb-2 mb-lg-0 max-spread slide">
                    <li>
                        <Link to="/">Barn</Link>
                    </li>
                    <li>
                        <Link to="/cowbuilder">Cow Builder</Link>
                    </li>
                </ul>
            </nav>
            <Outlet />
        </div>
    );
}

export default Nav;