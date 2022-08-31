import React from 'react';
import Event from './event.jsx';
import People from './people.jsx';

export default function Schindig({eventtitle, information, people}){
    return(
        <section>
            <h4> {eventtitle}</h4>
            <Event information={information} />
            <br></br>
            <h5>Guests:</h5> 
            <People list={people} />
            <hr></hr>
        </section>
    );
}