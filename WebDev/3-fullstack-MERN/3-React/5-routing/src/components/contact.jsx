import emo from '../assets/1.jpg';
import boy from '../assets/2.jpg';
import hip from '../assets/3.jpg';

const Contact = () => {
    return (
        <>
            <h3>to contact the following cows please use the corresponding cow type when on the user page:</h3>
            <br />
            <ul className="stack center">
                <li className="stack">
                    <div className="card">
                        <div className="card-body stack center">
                            <h5>Cow Type: 1</h5>
                            <img src={emo}></img>
                            <br />
                            <p className="card-text">
                                Name: Johnny
                                <br />
                                Age: 12
                                <br />
                                Fun Fact: Can drink twenty Monster Energy<br /> Drinks in under 30 minutes!
                            </p>
                        </div>
                    </div>
                </li>
                <hr className="skinny"></hr>
                <li className="stack">
                    <div className="card">
                        <div className="card-body stack center">
                            <h5>Cow Type: 2</h5>
                            <img src={boy}></img>
                            <br />
                            <p className="card-text">
                                Name: Rootin' Tootin' Dave
                                <br />
                                Age: 62
                                <br />
                                Fun Fact: Has killed two children over corn
                            </p>
                        </div>
                    </div>
                </li>
                <hr className="skinny"></hr>
                <li className="stack">
                    <div className="card">
                        <div className="card-body stack center">
                            <h5>Cow Type: 3</h5>
                            <img src={hip}></img>
                            <br />
                            <p className="card-text">
                                Name: Reighleigh
                                <br />
                                Age: 31
                                <br />
                                Fun Fact: Liked oxygen before it was cool...
                            </p>
                        </div>
                    </div>
                </li>
            </ul>

        </>
    );
}
export default Contact;