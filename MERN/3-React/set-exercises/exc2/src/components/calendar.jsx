import React from 'react';
import Shindig from './shindigs.jsx';

export default function Calendar({shindigs}){
    return(
    <article>
        <header>
            <h1> Your Social Calendar </h1>
            <hr></hr>
        </header>
        <div>
            {shindigs.map((shindig, i) =>(
            <Shindig key={i} {...shindig}/>
            ))}
        </div>
    </article>
    );
}