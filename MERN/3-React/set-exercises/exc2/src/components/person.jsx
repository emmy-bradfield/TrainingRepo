import React from 'react';
export default function Person({forename, surname}){
    return(
        <li>
            {forename} {surname}
        </li>
    );

}