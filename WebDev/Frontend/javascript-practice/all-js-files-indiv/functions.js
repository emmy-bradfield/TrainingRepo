'use strict'

let num1;
let num2;

function minus(num1, num2){
    let num3 = num1-num2;
    return num3
};

console.log(minus(10,4));

let name;
let years;
let gender;

function welcome(name, age, gender){
    let string = `My name is ${name}, I am ${years} years old and of gender ${gender}`;
    console.log(string);
}

welcome("Emily", 23, "no");

powerUp = (n1, n2) => {
    return Math.pow(n1, n2);
};
console.log(powerUp(3, 3));