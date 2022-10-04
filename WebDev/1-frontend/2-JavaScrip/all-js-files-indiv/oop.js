'use strict'
// Objects can be created as they are declared with values
let person = {
    forename: "Emily",
    surname: "Bradfield",
    age: 23,
    pets: {
        type: "cat",
        amount: 1,
        name: "Poppy"
    }
}

// or declared and then values assigned
let person2 = new Object();
person2["forename"] = "James";
person2["surname"] = "Bradfield";
person2.age = 20;

console.log(person);
console.log(person2);

// For-in loops can be used to access the keys within an object
for (let key in person) {
    console.log(`${key}: ${person[key]}`);
};

for (let key in person) {
    if (key === "pets") {
        for (let petKey in person[key]) {
            console.log(`${petKey}: ${person[key][petKey]}`);
        }
    } else {
        console.log(`${key}: ${person[key]}`);
    }
};

// For-of loops can be used to access the values within an object
for (let value of Object.values(person)){
    console.log(value);
};

// Arrays in JavaScript don't have a static datatype, so multiple types of data can be in the same array
let people = ["Emily", "James", "Poppy"];
let cat = ["Poppy", 13, "tortoiseshell"];

// These can also use for-in and for-of loops to iterate
for (let i = 0; i < people.length; i++) {
    console.log(people[i]);
};

for (let detail of cat) {
    console.log(detail);
};

// JSON stands for JavaScript Object Notation and is not disimilar to JS object literals, although they must 
// use double quotes and cannot contain functions, dates, or undefined
let myJSON = {
    "PropOne" : "ValueOne",
    "PropTwo" : "ValueTwo"
};

// Strings can be created containing the code structure for an object
let objString = '{"name" : "Emily"}';
console.log(objString);

// JSON.parse can then be used to turn this string into an object
let myObject  = JSON.parse(objString);
console.log(myObject);

// and JSON.stringify can be used to turn an object into a string containing it's code structure
let myString = JSON.stringify(myObject);
console.log(myString);