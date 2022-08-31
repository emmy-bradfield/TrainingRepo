import React from 'react';
import Event from './event.jsx';
import People from './people.jsx';

export default function Schindig({eventtitle, information, people}){
    return(
        <section>
            <h1> {eventtitle}</h1>
            <Event eventtitle={eventtitle} information={information} />
            <People list={people} />
        </section>
    );
}