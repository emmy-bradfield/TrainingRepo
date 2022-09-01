import { useState, useEffect } from 'react';

const Name = ({name}) => {
    useEffect(() => {
        document.title = `${name}'s website!`
    }, [name]);

    return (
        <form>
            <h4> Welcome to {name}'s website!</h4>
        </form>
    );

}

export default Name;