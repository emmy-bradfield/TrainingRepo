'use strict'

const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]')
const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl))

// Variables
let counter = 1;
let saves = 1;

// Selectors
let addBtn = document.querySelector("#addBtn");
let saveBtn = document.querySelector("#saveBtn");
let mainDiv = document.querySelector("#main");
let othDiv = document.querySelector("#other");
let score = document.querySelector("#score");


// Functions
let setCookie = (cookieName, cookieValue, exdays) => {
    let date = new Date();
    date.setTime(date.getTime() + (exdays*24*60*60*1000));
    let expires = "expires="+date.toUTCString();
    document.cookie = cookieName+"="+"name:"+cookieValue+";"+expires+";path=/";
}

let countPage = () => {
    counter ++;
    mainDiv.innerHTML="";
    let countDiv = document.createElement("div");
    let newH4 = document.createElement("h4");
    let counting = document.createTextNode(`There are currently ${counter} Jameses`);
    newH4.appendChild(counting);
    countDiv.appendChild(newH4);
    mainDiv.appendChild(countDiv);
}

let imgPage = () => {
    let image = document.createElement("main");
    othDiv.appendChild(image);

}

let addToPage = () => {
    countPage();
    imgPage();
};

let saveScore = () => {
    let scoreText = document.createElement("h5");
    let newScore = document.createTextNode(`Nice! You've saved ${counter} Jameses!`);
    score.innerHTML = "";
    scoreText.appendChild(newScore);
    score.appendChild(scoreText);
    let cName = `Save #${saves}`;
    setCookie(cName, counter, 5);
    saves ++;
    download();
}


// Event Listeners
addBtn.addEventListener("click", addToPage);
saveBtn.addEventListener("click", saveScore)