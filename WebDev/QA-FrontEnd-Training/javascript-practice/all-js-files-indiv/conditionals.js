'use strict'

if ("hello") {
    console.log("TRUE")
} else {
    console.warn("FALSE")
}

console.warn("IS 1 equal to '1'?")
console.error(1 == "1")
console.log(1 === "1")

let now = new Date();
let greeting = "Good" + (now.getHours() > 17 ? " evening." : " day.");
console.log(greeting);

console.log("======= EXERCISES START HERE ======")
console.log("1. What are the return values of the following code?\nlet strictA = true;\nlet strictB = 1;\nconsole.log(strictA == strictB);\nconsole.log(strictA === strictB);")
let strictA = true;
let strictB = 1;
console.log("console.log(strictA == strictB)\n>>", strictA == strictB)
console.log("console.log(strictA === strictB)\n>>", strictA === strictB)
console.log("2. Considering the following code, what will be the results be?\nconsole.log(strictA != strictB);\nconsole.log(strictA !== strictB);")
console.log("console.log(strictA != strictB)\n>>", strictA != strictB)
console.log("console.log(strictA !== strictB)\n>>", strictA !== strictB)
console.log("3. Create a IF statement that satifies the following:\nDeclare a variable age\nWrite a condition that checks if age is between 18 AND 65\nReturn a value in each case where the condition is satisfied and not satisfied.\nExtra: Consider the case where age is less than 18 - return 'underage'.")
console.log("let age = 23;\nif (18<= age <=65) {\nconsole.log('This person is aged 18 to 65')\n} else if (age <18) {\nconsole.log('This person is underage')\n} else {\nconsole.log('This person is over 65')\n};\n>>")
let age = 23;
if (18<= age <=65) {
    console.log("This person is aged 18 to 65")
} else if (age <18) {
    console.log("This person is underage")
} else {
    console.log("This person is over 65")
};
console.log("5. Using ternary-if syntax, write code that checks if age is above 50.")
let age2 = 23;
let string = 'This person is ' + (age < 50) ? 'under 50' : '50 plus';
console.log(string);
console.log("let age2 = 23;\nlet string = 'This person is ' + (age < 50) ? 'under 50' : '50 plus';\nconsole.log(string)\n>>", string)
console.log("======== EXERCISES END HERE =======")

