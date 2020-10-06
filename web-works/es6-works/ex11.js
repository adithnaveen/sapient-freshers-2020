// object de-structuring 
let p1 = {
    name:"suresh", 
    city:"Hyderabad", 
    email:"suresh@ps.com"
}

console.log(p1);
// let name = p1.name
// let city = p1.city
// let email = p1.email

let {name, city} = p1
console.log(name);
console.log(city);
// console.log(email);

function sayHello(name, city) {
    console.log(`Hello ${name} how is your city ${city}`);
}

function sayHello1({city, name}) {
    console.log(`Hello ${name} how is your city ${city}`);
}

sayHello(name, city)
// when you invoke it will look for the fieled name in p1 (p1.name) and 
// for city in p1 (p1.city)
sayHello1(p1)

