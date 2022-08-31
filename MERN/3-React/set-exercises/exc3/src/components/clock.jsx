import { Component } from 'react';

export default class Clock extends Component {
    constructor(props) {
        super(props);
        this.state = {
            date: new Date(),
            text: "",
            boolForShould: true
        };
        console.log("Constructor set the time as : " + this.state.date);
    };

    componentWillMount() {
        console.log("ComponentWillMount set the time as : " + this.state.date);
    };

    componentDidMount() {
        console.log("componentDidMount sets the time as :" + this.state.date);
        this.timerID = setInterval(() => this.tick(), 1000);
    };

    componentWillUpdate() {
        console.log("componentWillUpdate sets the time as :" + this.state.date);
    };

    componentWillUnmount() {
        console.log("componentWillUnmount sets the time as :" + this.state.date);
        clearInterval(this.timerID);
    };

    shouldComponentUpdate() {
        console.log("shouldComponentUpdate sets the time as :" + this.state.date);
        return this.state.boolForShould;
    };

    componentDidUpdate() {
        console.log("componentDidUpdate sets the time as :" + this.state.date);
    };

    tick() {
        this.setState({ date: new Date() });
    };

    stateHandle = () => {
        console.log("stateHandle sets the time as :" + this.state.date);
        this.setState({
            text: "Updated"
        });
    };

    stateHandle2 = () => {
        console.log("stateHandle2 sets the time as :" + this.state.date);
        clearInterval(this.timerID);
        this.setState({
            text: "Updated and timer has stopped"
        });
    };

    stateHandle3 = () => {
        console.log("stateHandle3 set the time as : " + this.state.date);
        this.timerID = setInterval(() => this.tick(), 1000);
        this.setState({
            text: "Updated and timer has started again"
        });
    }

    shouldHandle = () => {
        console.log("shouldHandle sets the time as :" + this.state.date);
        this.setState({
            boolForShould: !this.state.boolForShould
        });
    };

    render() {
        return (
            <div className="output2">
                <h1>{this.state.text}</h1>
                <h2>It is </h2>
                <div className="clock">
                    <h2>{this.state.date.toLocaleTimeString()}</h2>
                </div>
                <div className="margintop">
                    <button className="btn btn-light" onClick={this.stateHandle2}> STOP</button>
                    <button className="btn btn-light" onClick={this.stateHandle3}> RESTART</button>
                    <button className="btn btn-light" onClick={this.stateHandle}>CHANGE STATE</button>
                    <button className="btn btn-light" onClick={this.shouldHandle}> CHANGE UPDATE </button>
                </div>
            </div>
        );
    }

}