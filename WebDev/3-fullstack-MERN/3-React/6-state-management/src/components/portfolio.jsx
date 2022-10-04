import { useParams } from 'react-router-dom';

const Portfolio = () => {
    const { id } = useParams();

    return (
        <main>
            <h5>Whoa sick portfolio dude!</h5>
        </main>
    );
};

export default Portfolio;