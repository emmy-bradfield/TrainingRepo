const Footer = () => {

    const AnotherComponent = () => {
        return (
            <>
                <p>This is a paragraph</p>
                <p>And so it this</p>
                <p>Such a fun footer!</p>
                <br></br>
            </>
        );
    }

    return (
        <>
            <div className="stack">
                <h1> This is a title </h1>
                <AnotherComponent />
            </div>
        </>
    );
}

export default Footer;