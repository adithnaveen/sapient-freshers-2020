function myFunc(strings, p1, p2) {
    console.log("Strings", strings);
    console.log(p1, p2);
    return p1 +", " + p2; 
}
function myfunc1 (somevar) {
    console.log(somevar);
}

function myFunct2(strings, ...values) {
    console.log(strings);
    console.log(values);
    console.log("Output from myFunc2");
}

myfunc1("hello how are you doing")


let name ="Naveen"
let age = 35; 
let call = myFunc `${name} is ${age} year old` ; 
console.log(call);
myFunct2 `${name} is ${age} year old` 

