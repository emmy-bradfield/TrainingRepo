import { useState } from 'react';

const Counter = () => {
        const [count, setCount] = useState(0);
        return (
            <>
                <div className="stack">
                    <h4> Current Count: {count} </h4>
                    <div>
                        <button className="btn btn-dark" onClick={() => setCount(count + 1)}>ADD</button>
                        <button className="btn btn-dark" onClick={() => setCount(count - 1)}>SUB</button>
                        <button className="btn btn-dark" onClick={() => setCount(0)}>RESET</button>
                    </div>
                </div>
            </>
        );
    };

export default Counter;