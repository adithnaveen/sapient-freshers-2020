
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


 // version 2 
 // mandate to send callback 
/* function divide (n1, n2, callback) {
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
result = divide(a, b, (err, res) =>  {
    if(err) {
        console.log("There is an ero ", err);
    }else {
        console.log("Result is ", res);
    }
}); 
console.log(result);
console.log("End of Code ");
 */


// version 3 
// with promises 


function divide(n1, n2) {
    return new Promise((resolve, reject) =>{
        if(typeof n1 != 'number') {
            reject("Please enter number")
            return; 
        }
        if(typeof n2 != 'number') {
            reject("Please enter number")
            return; 
        }

        if(n2 ===0){
            reject("Please dont divide by zero")
        }

        resolve(n1/n2)
    })
}


console.log("Start of Code - promise ");
let a = 10 , b = 5; 
// let result = divide(a, b)
// result.then(result => console.log("Result is " , result))
// result.catch(err => console.log("Error while executing ", err))


// let result = divide(a, b)
//     .then(result => console.log("Result is " , result))
//     .catch(err => console.log("Error while executing ", err))

// es7 async await 


setTimeout(() => {
    try {
        let result = await divide(a,b); 
        console.log("Result : " + result);
    }catch(err) {
        console.log("Error occured " + err);
    }
 
     
}, 0);  

console.log("End of Code - promise");








