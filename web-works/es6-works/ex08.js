function sayHello(name1, name2, name3) {
    console.log("Hello", name1, name2, name3);
}

function sayHello1(...names) {
    console.log("Hello", names);
}

function sayHello2(name, ...names) {
    console.log("This needed data ", name);
    console.log("Hello", names);
}


sayHello("Uday", "Divyansh", "Dada")
sayHello("Uday", "Divyansh")

sayHello1("Uday", "Divyansh", "Dada")
sayHello1("Uday", "Divyansh")

sayHello2("Uday", "Divyansh", "Dada")
