// template string 

let s1 = "Naveen"
let s2 = "Bengaluru"
// dont have you code in multi line as a string 
let s3 = 'This is some string in training'

// this is called template string, you can have it in multi line 
let s4 = `this is new
 feature in 
 es6 `; 

console.log(s1)
console.log(s2)
console.log(s3)
console.log(s4);

let s5 = `Name of ${s1} lives in ${s2}`
console.log(s5);

let age = 6; 
let s6 = `${s1} is ${age<18 ?"Minor":"Major"} `
console.log(s6);