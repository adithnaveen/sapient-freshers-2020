// create a json object 
var MODULE ={}; 


MODULE = (function(my){
    my.anotherFunction = function () {
        console.log("Hello From Another Function ");
    }; 

    my.newFunction = function() {
        console.log("Hi i'm from New Function");
    }

    return my; 
    // loads the MODULE to VM 
}(MODULE)); 

MODULE.anotherFunction(); 
MODULE.newFunction(); 