// to work with arrays 

let names =['Dada', 'Namit', 'Ashutosh', 'Harsh']


let chars = names.map((value) => {
    return value.charAt(0)
})

console.log(chars);

let chars1 = names.map((value) =>  value.charAt(0)); 
console.log(chars1);

// if the name exists 
let indexPos = names.findIndex((value) => value ==='Namit')
console.log(indexPos>=0?"Found":"Not Found");