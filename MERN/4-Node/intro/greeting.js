const greeting = "Howdy";
const printGreeting = () => {
    console.log(`Look at me Ive been imported`);
}
module.exports.greetingString = greeting;
module.exports.printGreeting = printGreeting;