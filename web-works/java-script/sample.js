function myfunction() {

    console.log('====================================');
    console.log("hi i'm from external File");
    console.log('====================================');
}


// declaring and using variable 
function varEx() {
    var strvar = "Hello"
    var intvar = 123 
    var boolvar = true 

    console.log(strvar + intvar);
    console.log(boolvar + intvar);
    console.log(strvar + boolvar);

    console.log(100 == "100");
    // ===, !==, 
    console.log(100 === "100");
    console.log(10 * "20");
    // you cannot check with ===/== with NaN for this 
    // use isNaN Function 
    console.log(10/"hello"===NaN);

}

// variables & loops 

function fnCheckVote() {
    var name = prompt("Enter Youar Name") 
    var age = parseInt(prompt("Enter Your age ", "18"))

    if(age > 18 ) {
        console.log("you are eligible to vote Mr/Ms/Mrs : " + name);
    }else {
        console.log("Please wait for " + (18 - age) +" to vote, " + name);
    }

}
function fnAddNumbers() {
    var result = 0; 
    var number = 0; 
    do{
        result = result +  number; 
    }while((number=parseInt(prompt("enter a number", "0")))!==0); 

    console.log("Result is " + result);
}


function display() {
    console.log("Display with out any args ");
    for(i=0; i<display.arguments.length; i++) {
        console.log("argument passed : " + display.arguments[i]);
    }
}


// function display(x) {
//     console.log("Display with 1 arg " + x);
// }


// function display(x,y) {
//     console.log("Display with 2 arg " + x +", " + y);
// }

