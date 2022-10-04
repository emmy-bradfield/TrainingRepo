'use strict'

// CamelCase Task

//Make a function that takes in a String
// helloWorld, Hello_world, Hello-World

//Take the String and then convert it into camelCase -- There will never be any Spaces,
// but words will potentially be seperated by either a - or _

// Sentences 2 -> infinity

//Extension
// If the sentence is already camelCase -> Revserse CamelCase

let strBtn = document.querySelector("#strBtn");
let strIn = document.querySelector("#strIn");
let strOut = document.querySelector("#strOut");
let newStr = document.createElement("h6");

let camelCaseConverter = () => {
    let startStr = strIn.value.toLowerCase();
    const strArray = startStr.split(/[ _ -]/);
    let content = strArray[0];
    for (let i = 1; i < strArray.length; i++) {
        let letter = strArray[i].charAt(0).toUpperCase();
        let nextWord = strArray[i].replace(strArray[i].charAt(0), letter);
        content = content + nextWord;
    }
    newStr.textContent = content;
    strOut.innerHTML = "";
    strOut.appendChild(newStr);
}

strBtn.addEventListener("click", camelCaseConverter);