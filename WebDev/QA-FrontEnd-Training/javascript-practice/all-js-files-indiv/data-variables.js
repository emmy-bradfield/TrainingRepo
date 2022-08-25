'use strict'

let make = "Volvo";
let model = "XC90";
let a;
let b = "12345";
let c = 12344;
let d = true;
let e = {a:"JavaScript"};
let totalMoney = 4000;
let moneyPaidSoFar = 2348;
let totalLeftToPay;


function taskOne(){
    console.log("Emily");
    console.log("Bradfield");
    console.log("Southampton");
    console.log("Aquarius")
}

function taskTwo(){
    console.log(`My favourite car is ${make} and the model is ${model}`);
}

function taskThree(){
    console.log("%c This is my colourful message", "color:orange;font-family:fantasy;font-style:bold;background-color:black;padding:10px;")
}

function taskFour(){
    console.log(typeof(a));
    console.log(typeof(b));
    console.log(typeof(c));
    console.log(typeof(d));
    console.log(typeof(e));
}

function taskFive(){
    let totalLeftToPay = totalMoney - moneyPaidSoFar
    console.log(`The total bill is £${totalMoney} the remaining amount of money to be paid is £${totalLeftToPay}`)
}

taskOne();
taskTwo();
taskThree();
taskFour();
taskFive();
