// global, 
var num = 10; 

function myfunction() {
    var num = 10; 
    // it is only doing computation 
    function increment() {
        num +=1; 
    }
    increment() 

    return num; 
}
 
// console.log(myfunction()) ; 
// console.log(myfunction()) ; 
// console.log(myfunction()) ; 

var myfunction1 = (function(){
    var val = 100; 
    return function() { 
        val +=1
        return val; 
    }

})(); 

console.log(myfunction1()); 
console.log(myfunction1()); 