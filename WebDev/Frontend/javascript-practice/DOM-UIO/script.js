'use strict'

let char;
let stringgy;

let display = document.querySelector("#top");
let output = document.querySelector("#main");
let b0 = document.querySelector("#o")
let b1 = document.querySelector("#a")
let b2 = document.querySelector("#b")
let b3 = document.querySelector("#c")
let b4 = document.querySelector("#d")
let b5 = document.querySelector("#e")
let b6 = document.querySelector("#f")
let b7 = document.querySelector("#g")
let b8 = document.querySelector("#h")
let b9 = document.querySelector("#i")
let ba = document.querySelector("#j")
let bs = document.querySelector("#k")
let bm = document.querySelector("#l")
let bd = document.querySelector("#m")
let bp = document.querySelector("#n")
let calc = document.querySelector("#p")
let cA = document.querySelector("#cA")
let del = document.querySelector("#del")

//functions
function clear_all(){
    output.innerHTML = "";
    display.innerHTML = "";
    stringgy = "";
    char = "";
};

function delete_(){
    display.innerHTML = "";
    stringgy = "";
};

function zero(){
    let next = document.createTextNode("0");
    stringgy = stringgy + "0"
    display.appendChild(next)
}

function one(){
    let next = document.createTextNode("1");
    stringgy = stringgy + "1"
    display.appendChild(next)
}
function two(){
    let next = document.createTextNode("2");
    stringgy = stringgy + "2"
    display.appendChild(next)
}

function three(){
    let next = document.createTextNode("3");
    stringgy = stringgy + "3"
    display.appendChild(next)
}
function four(){
    let next = document.createTextNode("4");
    stringgy = stringgy + "4"
    display.appendChild(next)
}

function five(){
    let next = document.createTextNode("5");
    stringgy = stringgy + "5"
    display.appendChild(next)
}
function six(){
    let next = document.createTextNode("6");
    stringgy = stringgy + "6"
    display.appendChild(next)
}

function seven(){
    let next = document.createTextNode("7");
    stringgy = stringgy + "7"
    display.appendChild(next)
}
function eight(){
    let next = document.createTextNode("8");
    stringgy = stringgy + "8"
    display.appendChild(next)
}

function nine(){
    let next = document.createTextNode("9");
    stringgy = stringgy + "9"
    display.appendChild(next)
}
function add(){
    let next = document.createTextNode("+");
    stringgy = stringgy + "+"
    display.appendChild(next)
}
function sub(){
    let next = document.createTextNode("-");
    stringgy = stringgy + "-"
    display.appendChild(next)
}

function mul(){
    let next = document.createTextNode("*");
    stringgy = stringgy + "*"
    display.appendChild(next)
}
function div(){
    let next = document.createTextNode("/");
    stringgy = stringgy + "/"
    display.appendChild(next)
}

function dot(){
    let next = document.createTextNode(".");
    stringgy = stringgy + "."
    display.appendChild(next)
}

function calculate(){
    let answer = eval(stringgy);
    let calcOut = document.createTextNode(`${stringgy} = ${answer}`);
    output.appendChild(calcOut)
    output.appendChild(document.createElement("br"))
    delete_()
}

//listeners
cA.addEventListener("click", clear_all)
del.addEventListener("click", delete_)
b1.addEventListener("click", one)
b2.addEventListener("click", two)
b3.addEventListener("click", three)
b4.addEventListener("click", four)
b5.addEventListener("click", five)
b6.addEventListener("click", six)
b7.addEventListener("click", seven)
b8.addEventListener("click", eight)
b9.addEventListener("click", nine)
b0.addEventListener("click", zero)
ba.addEventListener("click", add)
bs.addEventListener("click", sub)
bm.addEventListener("click", mul)
bd.addEventListener("click", div)
bp.addEventListener("click", dot)
calc.addEventListener("click", calculate)

delete_()