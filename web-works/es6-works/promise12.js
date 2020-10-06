
//sync program 
/* function divide (n1, n2) {
    if(typeof n1 != 'number') {
        throw ("1st argument to be number")
    }
    if(typeof n2 != 'number') {
        throw ("2nd argument to be number")
    }
    if(n2===0) {
        throw ("Number cannot be divided by zero")
    }
    return n1/ n2; 
}

console.log("Start of Code ");
let a = "10a", b = 20; 
result = divide(a, b); 
console.log("Result", result);
console.log("End of Code ");

 */


 // mandate to send callback 
function divide (n1, n2, callback) {
    if(typeof callback != 'function') {
        throw "Callback should be a function"
    }
  
    // this is called a error first approach 
    setTimeout(()=> {
        if(typeof n1 != 'number') {
            callback ("1st argument to be number")
            return 
        }
        if(typeof n2 != 'number') {
            callback ("2nd argument to be number")
            return
        }
        if(n2===0) {
            callback("Number cannot be divided by zero")
            return
        }
       callback(null, n1/n2); 
    }, 0); 
}
console.log("Start of Code ");
let a = 10 , b = 20; 
result = divide(a, b, (err, result) =>  {
    if(err) {
        console.log("There is an ero ", err);
    }else {
        console.log("Result is ", result);
    }
}); 
console.log("End of Code ");

















