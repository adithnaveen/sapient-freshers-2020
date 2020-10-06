class Person {
    constructor(name) {
        this.name = name
    }
}

class Employee extends Person {
    constructor(name, role) {
        // super should be first statement 
        super(name)
        this.role = role; 
    }
}


let e1 = new Employee("Prannavika", "SE"); 
console.log(typeof(e1));
console.log(e1);