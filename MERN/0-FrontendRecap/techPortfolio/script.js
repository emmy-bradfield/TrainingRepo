'use strict'

let expandBtn = document.querySelector("#expand");
let expand2Btn = document.querySelector("#expand2");

let open = () => {
    if (expandBtn.className == "fa-solid fa-chevron-right expand") {
        expandBtn.setAttribute("class", "fa-solid fa-chevron-down expand collapsed")
    } else if (expandBtn.className == "fa-solid fa-chevron-down expand collapsed") {
        expandBtn.setAttribute("class", "fa-solid fa-chevron-right expand");
    }
}

let open2 = () => {
    if (expand2Btn.className == "fa-solid fa-chevron-right expand") {
        expand2Btn.setAttribute("class", "fa-solid fa-chevron-down expand collapsed")
    } else if (expand2Btn.className == "fa-solid fa-chevron-down expand collapsed") {
        expand2Btn.setAttribute("class", "fa-solid fa-chevron-right expand");
    }
}

expandBtn.addEventListener("click", open);
expand2Btn.addEventListener("click", open2);

const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]')
const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl))