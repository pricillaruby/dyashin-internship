//object

let person = {
  name: "apple",
  age: 23,
  email: "apple.com",
};
console.log("object", person);

//array

let fruits = ["apple", "banana", "cherry"];
console.log("array", fruits);

//functions

//named function=>function that has a name
/*synatx  function fun_name(){
code
}
//anonymous function=>without name,assigned to variable 
synatx => variable var_name=function(){
//CODE
}
//iife funtion=>runs immediately after it is defined
synatx:(function (){
//code})
//arrrow function=> variable var_name=()=>{
    //code 
}
// */

//named function
function greet() {
  return "hello ";
}
console.log("named function", greet());

//anonymous function

let greet = function () {
  return "hello";
};
console.log("anonymous function", greet());

//iife
(function () {
  console.log("iife ");
})();

//arrow
let greet = () => {
  return "hello ";
};
console.log("arrow function ", greet());
