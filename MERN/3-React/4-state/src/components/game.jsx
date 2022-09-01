import { useState } from 'react';
import AddGamers from './addGamer.jsx';
import GameRoom from './gameroom.jsx';

const Game = () => {

    const [playerName, setPlayerName] = useState("");
    const [players, setPlayers] = useState([]);

    const newPlayer = ({ target }) => {
        setPlayerName(target.value)
    }

    const submitForm = (event) => {
        event.preventDefault();
    }

    const handleAdd = () => {
        setPlayers(players => [...players, playerName]);
    }

    const clearAll =() =>{
        setPlayers([]);
    }

    return (
        <div className="stack">
            <AddGamers submitHandler={submitForm} newPlayer={newPlayer} handleAdd={handleAdd} handleClear={clearAll}  />
            <GameRoom players={players} />
        </div>
    )
}
export default Game;