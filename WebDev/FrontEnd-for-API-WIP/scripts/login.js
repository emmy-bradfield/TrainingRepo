'use strict'

// forgot-password.html back button
let backBtn = document.querySelector("#back");

// login fields 
let email = document.querySelector("#email");
let password = document.querySelector("#password");
let loginBtn = document.querySelector("#loginBtn");
let incorrectDiv = document.querySelector("#incorrect");

// reset fields
let emailReset = document.querySelector("#email-reset");
let resetBtn = document.querySelector("#resetBtn");

let goBack = () => { // forgot-password.html back function
    window.location.replace("../index.html");
}

let validateCred = () => { // login validate credentials function
    axios.get(`http://localhost:8080/guest/login?email=${email.value}`)
        .then(res => {
            let result = res.data;
            if (result.password == null) {
                incorrectDiv.innerHTML = "";
                let alertH = document.createElement("h4");
                alertH.setAttribute("class", "login-error");
                alertH.textContent = "Email address not recognised";

                incorrectDiv.appendChild(alertH);
            }
            else if (result.password != password.value) {
                incorrectDiv.innerHTML = "";
                let alertH = document.createElement("h4");
                alertH.setAttribute("class", "login-error");
                alertH.textContent = "The password you have entered is incorrect";

                incorrectDiv.appendChild(alertH);
            } else {
                loginUser(result);
            }
        }).catch(err => { console.log(err) })
};

let loginUser = (result) => { // login direct to right page function
    if (result.host == true) {
        window.location.replace("../host.html");
    } else {
        window.location.replace("../guest.html")
    }
}



backBtn.addEventListener("click", goBack);
loginBtn.addEventListener("click", validateCred);