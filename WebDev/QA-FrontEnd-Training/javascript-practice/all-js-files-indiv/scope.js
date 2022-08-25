'use strict'

let x = "foo";

function taskOne(){
    let count;
    for (count = 0; count <10; count++){
    if (x === "foo") {
        console.log(`${x} = boo!`);
        x = "far";
    } else {
        console.log(`${x} = bar!`)
        x = "foo";
    }
}
};

// console.log(`count is ${count}`); -----> Script produces error, intended as part of exercise, commented out to allow
//                                          rest of the script to run
console.log(`starting x is ${x}`);
taskOne();

function doSomething() {
    console.log(a);
    console.log(foo());
    let a = 1;
    function foo() {
      return 2;
    }
  }
//   doSomething(); ------> Script produces error (a has not been initialized), intended as part of exercise,
//                          commented out to allow rest of the script to run