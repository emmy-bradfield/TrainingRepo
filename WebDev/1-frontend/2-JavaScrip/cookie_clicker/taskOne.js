'use strict'

// Fibonnaci Sequence -- I want you to create for me a basic function that produces n numbers in this sequence - Store it in an arrat
// 0,1,1,2,3,5,8,13

// I want this to be stored in an array -- Give the user a choice 
// Retrieve the sum of all even numbers in your given n array

// Multiply the odd numbers and then divide by the last number in the array

let nth = document.querySelector("#nth");
let sqnOut = document.querySelector("#sqnOut");
let sqnBtn = document.querySelector("#sqnBtn");
const sequence = [];
let previous = 1;
let current = 1;
let n = parseInt(nth.value);

let onLoad = () => {
    sequence.push(1);
}

let Fibonnaci = () => {
    nth.value++;

    if (nth.value == 1) {
        printSqn(sequence);
    } else {
        sequence.push(current);
        current = current + previous;
        previous = current - previous;
        printSqn(sequence);
    }
}

let printSqn = (sequence) => {
    let sqn = document.createElement("div"); 
    sqn.textContent = `${sequence},${sequence.slice(0, -1).reverse()}`;
    sqnOut.appendChild(sqn);
}

sqnBtn.addEventListener("click", Fibonnaci);