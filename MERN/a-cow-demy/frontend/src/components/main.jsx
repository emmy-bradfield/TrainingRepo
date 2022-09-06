import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Nav from './nav.jsx';
import Cowlist from './cowlist.jsx';
import Cowbuilder from './cowbuilder.jsx';

const Main = () =>{
return(
    <BrowserRouter>
        <Routes>
            <Route exact path="/" element={<Nav />}>
                <Route index element={<Cowlist/>}/>
                <Route path="/cowbuilder" element={<Cowbuilder />}/>
            </Route>
        </Routes>
    </BrowserRouter>
)
};

export default Main;