'use strict'

//I want us to create a method that will take the current amount of cookies, 
// save it to a list and then reset the counter to zero

let cookie = document.querySelector("#cookie");
let counter = 0;
let count = document.querySelector("#count");
let div = document.querySelector("#div");
let save = document.querySelector("#reset")

let moreCookies = () =>{
    counter++
    count.innerHTML = "";
    let text = document.createElement("h2");
    text.textContent = `You have ${counter} cookies!`;
    count.appendChild(text);
}

let restart = () =>{
    let user = prompt("What is your name?");
    let score = document.createElement("h2");
    score.textContent = `${user} - ${counter}`;
    div.appendChild(score);
    counter = 0;
    count.innerHTML="";
}

cookie.addEventListener("click", moreCookies)
reset.addEventListener("click", restart);