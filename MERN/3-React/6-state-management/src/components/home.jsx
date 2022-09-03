import { useParams } from 'react-router-dom';

const Home = () => {
    const {id} = useParams();

    return (
        <main>
            <h5>Imagine some content here</h5>
        </main>
    );
};

export default Home;