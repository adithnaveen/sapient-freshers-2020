function fnArray() {
    arr = new Array(3); 
    arr[0] = 10; 
    arr[1] = 20; 
    arr[2] = 30; 
    arr[3] = 40; 
    arr[4] ="Sunday"

    console.log(arr);
    console.log(arr.length);

    // to add in the front 
    arr.unshift("First")
    console.log(arr);

    // add last 
    arr.push("I'm last")
    console.log(arr);

    // remove first 
    arr.shift(); 
    console.log(arr);

    // revmoe last 
    arr.pop(); 
    console.log(arr);

    arr.splice(1,1,"MONDAY", "TUESDAY"); 
    console.log(arr);

    for(temp in arr) {
        console.log(temp +", " + arr[temp]);    
    }
}