import React from 'react';
export default function Event({ eventtitle, information}){
    return(
        <section>
            <h2>{eventtitle}</h2>
            {information.map((s, i) => (
                <p key={i}>{s}</p>
            ))}
        </section>
    );
}