import { React, Component } from 'react';
import Default from '../assets/cow-default.webp';
import axios from 'axios';

export default class Cowbuilder extends Component {
    constructor(props) {
        super(props);

        this.state = {
            _id: '',
            name: '',
            age: '',
            pattern: '',
            adult: null,
            home: ''
        }

        this.onChangeName = this.onChangeName.bind(this);
        this.onChangeAge = this.onChangeAge.bind(this);
        this.onChangePattern = this.onChangePattern.bind(this);
        this.onChangeHome = this.onChangeHome.bind(this);
        this.onSubmit = this.onSubmit.bind(this);
    }

    onChangeName(e) {
        this.setState({
            name: e.target.value
        })
    }

    onChangeAge(e) {
        this.setState({
            age: e.target.value
        })
    }

    onChangePattern(e) {
        this.setState({
            pattern: e.target.value
        })
    }

    onChangeHome(e) {
        this.setState({
            home: e.target.value
        })
    }

    onChangeId(e){
        this.setState({
            _id: e.target.value
        })
    }

    onSubmit(e) {
        e.preventDefault();
        console.log(`Your Cow: ${JSON.stringify(this.state)}`);

        const newCow = {
            _id: this.state._id,
            name: this.state.name,
            age: this.state.age,
            pattern: this.state.pattern,
            adult: (this.state.age > 3 ? true : false),
            home: this.state.home
        }

        axios.post('http://localhost:4000/cows/newCow', newCow)
            .then(res => window.alert(`You created a ${res.data}`));

        this.setState({
            _id_: '',
            name: '',
            age: '',
            pattern: '',
            adult: '',
            home: ''
        })
        }


    render() {
        return (
            <main className="center stack">
                <h1> Cow Builder </h1>
                <hr />
                <br />
                <div className='slide'>

                    <div className="cow-in">
                        <form className="form-group cow-builder max-spread" onSubmit={this.onSubmit}>
                            <label>Your Cow's Name:</label>
                            <input required type="text" className="form-control" value={this.state.name} onChange={this.onChangeName} />
                            <br />
                            <label>Your Cow's Age:</label>
                            <input required type="number" className="form-control" value={this.state.age} onChange={this.onChangeAge} />
                            <br />
                            <label>Your Cow's Style:</label>
                            <select className="form-control" onChange={this.onChangePattern}>
                                <option selected disabled hidden>Choose a style</option>
                                <option value="Black and White Spots">Black and White</option>
                                <option value="Brown">Brown</option>
                                <option value="lock" disabled>Purple</option>
                                <option value="lock" disabled>Blue</option>
                                <option value="lock" disabled>Rainbow</option>
                            </select>
                            <br />
                            <label>Your Cows Home: </label>
                            <select className="form-control" onChange={this.onChangeHome}>
                                <option selected disabled hidden>Choose their home</option>
                                <option value="Main Barn">Main Barn</option>
                                <option value="lock" disabled>Skate Park</option>
                                <option value="lock" disabled>Rainbowland</option>
                                <option value="lock" disabled>Wastelands</option>
                                <option value="lock" disabled>Series of Tubes</option>
                            </select>
                            <br />
                            <input className="btn btn-light cow-btn" type="submit" value="Build Your Cow!"></input>
                        </form>
                    </div>


                    <div className="stack center cow-out">
                        <img className="cow-img" src={Default} alt="default cow"></img>
                        <hr className="hr-small" />
                        <input className="form-control cow-text" type="text" disabled placeholder='Choose their name' />
                        <input className="form-control cow-text" type="text" disabled placeholder='Choose an age' />
                        <input className="form-control cow-text" type="text" disabled placeholder='Choose their home!' />
                    </div>

                </div>
            </main>
        )
    }
}