const GameRoom = ({players}) => {

    const Display = ({ playerName }) => <li className="bigList">{playerName}</li>
    return ( 
        <ul className="stack drop">
            {players.map((players, i) => (
                <Display playerName={players} key={i} />
            ))}
        </ul>
     );
}

export default GameRoom;