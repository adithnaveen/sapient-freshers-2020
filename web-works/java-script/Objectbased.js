// this will be our class 
function Person(name, pid) {
    this.name = name; 
    this.pid = pid; 

    // all private method goes here and prefixed by var 

    var fnPrivate = function() {
        console.log('=============From Private=======================');
        console.log("Name :" + name);
        console.log("ID :" + pid);
        console.log('=============End Private=======================');
    }

    // previlleged function 
    this.fnAccessPrivate = function() {
        fnPrivate(); 
        console.log('=============From Privelleged =======================');
        console.log("Name :" + this.name);
        console.log("ID :" + this.pid);
        console.log('=============End Privelleged =======================');
    }

}

// public function  
Person.prototype.display = function() {
    // you cannot access private function from prototype function 
    // fnPrivate(); 
    console.log('====================================');
    console.log("Name :" + this.name);
    console.log("ID :" + this.pid);
    console.log('====================================');
}