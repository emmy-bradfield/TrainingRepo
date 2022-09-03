import Nav from './nav.jsx';
import Home from './home.jsx';
import Users from './users.jsx';
import UserParam from './userParam.jsx';
import UsersRoute from './usersRoute.jsx';
import Contact from './contact.jsx';
import NotFound from './404.jsx';
import EmployeeInfo from './employeeinfo.jsx';
import LoginControl from './logincontrol.jsx';
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
            <p>Due to an inability to aquire the API key needed for the exercise set on community, instead 
                I will be completing the exercise in the tutorial:
            </p>
            <h4> Create a simple data request handler to import Employee Information from an external source
            </h4>
            <br></br>
            <div className="output" height="10vh;">
                <EmployeeInfo />
            </div>

            <hr/>

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
                <LoginControl />
            </div>
        </div>
    );
}

export default Main; 