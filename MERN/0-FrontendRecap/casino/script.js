'use strict'

let user = document.querySelector("#name");
let start = document.querySelector("#start");
let main = document.querySelector("#main");
let intro = document.querySelector("#intro");
let welcome = document.querySelector("#welcome");
let playerCounter = 0;
let computerCounter = 0;
let msg;
let score;
let scoreboard = document.createElement("h6");

let begin = () => {
    setTimeout(out(), 1000);
    setTimeout(next(), 1000);
    setTimeout(openHand(), 1500);
}

let out = () => {
    intro.className = 'fadeout', 1000;
}

let next = () => {
    let temp = document.createElement("div");
    let load = document.createElement("h5");
    load.textContent = `Welcome, ${user.value}`;
    temp.appendChild(load);
    welcome.appendChild(temp);
    temp.className = 'fadein', 1500;
}

let openHand = () => {
    main.innerHTML = "";
    let table = document.createElement("div");
    table.setAttribute("class", "container");
    table.setAttribute("id", "table");
    let opening = document.createElement("div");
    opening.setAttribute("class", "card");

    let cardOne = (Math.floor(Math.random() * (1 - 12)) + 1) * -1;
    let cardTwo = (Math.floor(Math.random() * (1 - 12)) + 1) * -1;

    opening.textContent = `Opening Hand: ${cardOne} and ${cardTwo}`;
    score = cardOne + cardTwo;

    scoreboard.textContent = `Current Hand: ${score}`;

    table.appendChild(scoreboard);
    table.appendChild(opening);
    main.appendChild(table);
    table.className = 'fadein container chunk';

    playerCounter = score;

    computerCounter = ((Math.floor(Math.random() * (1 - 12)) + 1) * -1) + ((Math.floor(Math.random() * (1 - 12)) + 1) * -1);

    playerTurn();
}

let computerTurn = () => {
    computerCounter = ((Math.floor(Math.random() * (1 - 12)) + 1) * -1) + ((Math.floor(Math.random() * (1 - 12)) + 1) * -1)
    console.log(computerCounter);
    do {
        let compNext = (Math.floor(Math.random() * (1 - 12)) + 1) * -1;
        let nextComp = document.createElement("div");
        nextComp.textContent = `Computer draws`;
        table.appendChild(nextComp);
        computerCounter = computerCounter + compNext;
        console.log(computerCounter);
        if (computerCounter > 21) {
            gameover();
        }
        else if (computerCounter > 16) {
            let nextComp = document.createElement("div");
            nextComp.textContent = `Computer stands`;
            table.appendChild(nextComp);
            gameover(); }
    } while (computerCounter < 17);
}

let playerTurn = () => {
    let draw = document.createElement("button");
    let stand = document.createElement("button");
    draw.setAttribute("class", "btn btn-dark");
    stand.setAttribute("class", "btn btn-dark");
    draw.textContent = "DRAW";
    stand.textContent = "STAND";

    draw.addEventListener("click", function () {
        let nextCard = (Math.floor(Math.random() * (1 - 12)) + 1) * -1;
        let nextDrawn = document.createElement("div");
        nextDrawn.textContent = `You drew a ${nextCard}`;
        score = score + nextCard;
        playerCounter = score;
        table.appendChild(nextDrawn);
        scoreboard.textContent = `Current Hand: ${score}`;
        if (playerCounter > 21) {
            gameover();
        }
    })

    stand.addEventListener("click", function () {
        let nextDrawn = document.createElement("div");
        nextDrawn.textContent = `You stand`;
        draw.disabled = true;
        stand.disabled = true;
        computerTurn();
    })

    let table = document.querySelector("#table");
    table.appendChild(draw);
    table.appendChild(stand);

}

let gameover = () => {
    if (playerCounter > 21) {
        msg = "You drew over 21 - computer wins!"
    } else if (playerCounter < 22 && computerCounter > 21) {
        msg = `Computer drew over 21 - ${user.value} wins!`
    } else if (playerCounter > computerCounter) {
        msg = `${user.value} scored ${playerCounter} and computer scored ${computerCounter} - ${user.value} wins!`
    } else if (playerCounter < computerCounter) {
        msg = `${user.value} scored ${playerCounter} and computer scored ${computerCounter} - computer wins!`
    } else {
        msg = `${user.value} and computer draw!`
    }

    let results = document.createElement("h5");
    results.textContent = msg;
    results.setAttribute("class", "end");
    let restart = document.createElement("button");
    restart.setAttribute("class", "btn btn-dark");
    restart.textContent = "Play Again!"
    restart.addEventListener("click", function () {
        welcome.innerHTML = "";
        playerCounter = 0;
        score = 0;
        computerCounter = 0;
        openHand();
    })
    welcome.appendChild(results);
    welcome.appendChild(restart);
}


start.addEventListener("click", begin);

// Draw cards
