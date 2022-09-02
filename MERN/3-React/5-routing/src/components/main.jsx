import Nav from './nav.jsx';
import Home from './home.jsx';
import Users from './users.jsx';
import UserParam from './userParam.jsx';
import UsersRoute from './usersRoute.jsx';
import Contact from './contact.jsx';
import NotFound from './404.jsx';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

const Main = () => {

    return (
        <div className="App-main">
            <h1> 5. React Routing and HTTP Requests</h1>
            <br></br>
            <h2>5.1.1 React Routing </h2>
            <h4>Create a page which contains:</h4>
            <ul className="stack">
                <li> 1. Home page </li>
                <li> 2. Users Page </li>
                <li> 3 .Contact Page </li>
                <li> 4. 404 page </li>
            </ul>
            <br></br>
            <div className="output" height="10vh;">
                <div className="stack center">
                    <Home />
                    <hr/>
                    <Users />
                    <hr/>
                    <Contact />
                    <hr/>
                    <NotFound />
                </div>
            </div>

            <hr></hr>

            <h2>5.1.2 React Routing </h2>
            <h4>Create a switch and route for each of the pages in App.js
            </h4>
            <br></br>
            <div className="output" height="10vh;">
                <BrowserRouter>
                    <Routes>
                        <Route path='/' element={<Nav />}>
                            <Route index element={<Home />} />
                            <Route path='/users' element={<Users />} />
                            <Route path='/contact' element={<Contact />} />
                            <Route path="*" element={<NotFound />} />
                        </Route>
                    </Routes>
                </BrowserRouter>
            </div>

            <hr></hr>

            <h2>5.1.3 React Routing </h2>
            <h4>Create a URL parameter for users/:id - Render their id on the page
            </h4>
            <br></br>
            <div className="output" height="10vh;">
            <BrowserRouter>
                    <Routes>
                        <Route path='/' element={<Nav />}>
                            <Route index element={<Home />} />
                            <Route exact path='/users' element={<UserParam />} />
                            <Route exact path='/contact' element={<Contact />} />
                            <Route path="*" element={<NotFound />} />
                        </Route>
                    </Routes>
                </BrowserRouter>
            </div>

            <hr></hr>

            <h2>5.1.4 React Routing </h2>
            <h4> Implement nested routing within the User's component
            </h4>
            <br></br>
            <div className="output" height="10vh;">
            <BrowserRouter>
                    <Routes>
                        <Route path='/' element={<Nav />}>
                            <Route index element={<Home />} />
                            <Route exact path='/users' element={<UsersRoute />} />
                            <Route exact path='/users/:cowID' element={<UsersRoute />} />
                            <Route exact path='/contact' element={<Contact />} />
                            <Route path="*" element={<NotFound />} />
                        </Route>
                    </Routes>
                </BrowserRouter>
            </div>
            <hr></hr>

            <h2>5.2 Data Requests </h2>
            <h4> In this exercise, you are tasked with creating a movie search application.
            </h4>
            <ul className="stack">
                <li>
                    1. Navigate to OMDBAPI
                </li>
                <li>
                    2. Get a free API key from the API Key tab
                </li>
                <li>
                    3. Create a FilmRequest Component that lets <br />the user enter a Movie title and axios
                    fetches the <br /> correct movie from OMDBAPI.
                </li>
                <em> Try and use Parent/Child Components to present your data </em>
            </ul>
            <br></br>
            <div className="output" height="10vh;">

            </div>

            <h2>5.3 Static Data </h2>
            <h4> Create a component LoginControl which displays:
            </h4>
            <ul className="stack">
                <li>
                    1. Header with "Please sign up" as text and a Login Button
                </li>
                <li>
                    2. Header with "Welcome Back!" as text and a Logout Button
                </li>
                <li>
                    3. Onclick on each of the buttons should take the user between the two displays above.
                </li>
            </ul>
            <br></br>
            <div className="output" height="10vh;">

            </div>
        </div>
    );
}

export default Main; 