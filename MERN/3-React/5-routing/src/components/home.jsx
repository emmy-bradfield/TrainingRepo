import Cow from '../assets/happycow.jpg';

const Home = () =>{
    return(
        <div className="stack center">
            <h2> Welcome to my website! </h2>
            <p> It is super cool and very fun look at this fun picture of a happy cow </p>
            <img src={Cow}></img>
        </div>
    );
}

export default Home;