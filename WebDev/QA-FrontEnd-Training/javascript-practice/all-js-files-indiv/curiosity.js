'use strict'

let emily = {
    forename: "Emily",
    surname: "Bradfield",
    birthday: "17-02-1999",
    gender: "non-binary"
}

let james = {
    forename: "James",
    surname: "Bradfield",
    birthday: "27-09-2001",
    gender: "male"
}

let siblings = {
    first: emily,
    second: james
}

console.log(siblings);

let makeCookie = (cookieN, userName, userEmail, exdays) => {
    let date = new Date();
    date.setTime(date.getTime() + (exdays*24*60*60*1000));
    let expires = "expires="+date.toUTCString();
    document.cookie = cookieN + " = " + "user:" + userName + " & " + "email:" + userEmail + ";" + expires + ";path=/";
}

makeCookie(1, "emily-bradfield", "emily-bradfield@outlook.com", 2);