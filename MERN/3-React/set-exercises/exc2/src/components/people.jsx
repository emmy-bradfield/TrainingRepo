import React from 'react';
import Person from './person.jsx';

export default function People({ list }){
    return(
        <ul>
            {list.map((person, i) => (
                <Person key={i} {...person} />
            ))}
        </ul>
    );
}