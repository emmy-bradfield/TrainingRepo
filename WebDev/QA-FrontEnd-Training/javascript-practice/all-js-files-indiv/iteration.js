'use strict'

function loopOne() {
    for (let a = 100; a <= 200; a++) {
        console.log(`a = ${a}`);
    }
}

function loopTwo() {
    for (let a = 100; a <= 200; a++) {
        if (a % 2 == 0) {
            console.log("-");
        } else {
            console.log("*");
        }
    }
}

function loopThree() {
    for (let i = 0; i < 10; i++) {
        for (let j = 1; j <= 10; j++) {
            console.log(j);
        }
    }
}

function loopFour() {
    let now = new Date();
    let day = now.getDay();
    switch (day) {
        case 0:
            console.log(`It's Sunday`);
            break;
        case 6:
            console.log(`It's Saturday`);
            break;
        case 1:
            console.log(`It's Monday`);
            break;
        case 2:
            console.log(`It's Tuesday`);
            break;
        case 3:
            console.log(`It's Wednesday`);
            break;
        case 4:
            console.log(`It's Thursday`);
            break;
        case 5:
            console.log(`It's Friday`);
            break;
        default:
            console.log(`Excuse me?`);
            break;
    }
}

loopOne();
loopTwo();
loopThree();
loopFour();
