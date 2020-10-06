// behind the screen it function 
// for developers classes and objects 
class Person {
    constructor(name, city="Chennai") {
        this.name = name 
        this.city = city 
    }
   printPerson() {
       console.log("Name :" , this.name);
       console.log("City :" , this.city);
   }
}

// let p1 = new Person(); 
// let p1 = new Person("Ishika", "Chennai")
let p1 = new Person("Ishika", "Delhi")

console.log(typeof(p1));
console.log(p1);
p1.printPerson(); 