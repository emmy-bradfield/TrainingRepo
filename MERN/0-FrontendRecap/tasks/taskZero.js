'use strict'

// Const means the object is immutable
const myArray = [1, 3, 4, 6, 6, 3];
console.log(myArray);

// Although changes can be made to the array...
myArray.push(10);
console.log(myArray);

// ...it cannot be overwritten
function demo() {
    try {
        myArray = 3;
        console.log(myArray);
    } catch (err) {
        console.log("CustomerImmutableObjectException:'myArray' (at jsRecap:17; jsRecap.js:14; jsRecap.js:4) is immutable and cannot be changed")
    }
}
demo();
console.log("");

// Types do not need to be declared as JavaScript will infer it
function add(numberOne, numberTwo) {
    return numberOne + numberTwo;
}
console.log(add(2, 5));
console.log(add("2", "5"));

// and TypeScript can be used to check types and interact with them
function addV2(numberOne, numberTwo) {
    if (typeof numberOne === "number" && typeof numberTwo === "number") {
        return numberOne + numberTwo;
    } else {
        return ("You may only add integers")
    }
}
console.log(addV2(2, 5));
console.log(addV2("2", "5"));
console.log("");

// and this can even be compiled neatly into ternary
function addTern(numberOne, numberTwo) {
    return (typeof numberOne === "number" && typeof numberTwo === "number") ? numberOne + numberTwo : "You may only add integers"
}
console.log(addTern(2, 5));
console.log(addTern("2", "5"));
console.log("");

// Backticks are used to allow objects to be called into a string
let greeting = () =>{
    let input = prompt("What is your name?");
    let msg = `Hello, ${input} and welcome`;
    console.log(msg);
}
greeting();