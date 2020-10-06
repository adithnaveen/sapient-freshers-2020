// ... spread operator / rest operator 

let nums = [12, 23, 345, 6, 78, 100] 
console.log(nums);
let nums1 = [10, 20, ...nums]
console.log(nums1);

console.log("-----------------------------");
let nums2 = nums; 
nums2.push(1000); 
console.log(nums)
console.log(nums2);
let nums3 = [...nums]; 
console.log(nums3);
nums.push(2000); 
console.log(nums3);
console.log(nums2);

////////////////////////// 
let p2 = {city:"Bengaluru",   country:"india"}
let p1 = {name:"Gaurav", ... p2 ,   email:"gaurav@ps.com"}; 
console.log(p1);
console.log(p2);

// this will not refer to p1 
let p3 = {...p1}

console.log(p3);
console.log(p1 === p3);