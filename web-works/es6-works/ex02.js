// in es6 standard a new key word is introduced called let 
function test() {
    for( let i=1; i<=5;i++) {
        console.log("Inside Look Value is ", i);
    }
    console.log("Value of i outside " + i);
}

test() 