const Prop = props => {
    return (
        <>
            <h1> {props.header} </h1>
            <p> {props.content}</p>
            <p> {props.number} {props.text}</p>
            <p> {props.nonexistant}</p>
        </>
    );
}

const Bees = () => {
    return (
        <>
            <div className="bees">
                <div className="stack">
                    <Prop header="How Many Bees?!" content="It's important before entering into a new location to ensure 
                    the bee count is suitable. Let's have a look around and see..." number="397" text="is too many bees!" 
                    nonexistant="🏃 💨💨" />
                </div>
            </div>
        </>
    );
}

export default Bees; 