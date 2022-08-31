import React from 'react';
export default function Event({ title, information}){
    return(
        <section>
            <h2>{title}</h2>
            {information.map((s, i) => (
                <p key={i}>{s}</p>
            ))}
        </section>
    );
}