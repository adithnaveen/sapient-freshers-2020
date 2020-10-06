// when you refer a variable with function name then the entire file will scan 
// and load the function in VM 
let output = hello(); 
console.log(output);


function hello() {
    return "Hello World"; 
} 


////////////////////////////////////////////////
// this is called as anonymous function assigned to variable 
let greet = function() {
    return "Greet World"
}

let output2 = greet(); 
console.log(output2);




setInterval( () => console.log("Welcome to JS Programming") , 1000); 
