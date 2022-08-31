import './App.css';
import Calendar from './components/calendar';
import data from './data/events.json';

function App() {
    return (<Calendar shindigs={data}/>);
}

export default App;
