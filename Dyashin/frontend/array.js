let array = [1, 2, 3, 4, 5, 6, 7];
//push=>add the ele to the end
array.push(8);
console.log(array);
//pop=>remove the ele at the end
array.pop();
console.log(array);
//unshift=>add the ele at the beginning
array.unshift(0);
console.log(array);
//shift=>remove the ele from beginning
array.shift();
console.log(array);
//searching and checking
//indexof()=>finds index of an ele
let arr = ["a", "b", "c", "d", "a"];
console.log("indexof", arr.indexOf("b"));
//lastindexof=>finds the index of last match
console.log(arr.lastIndexOf("a"));
//includes=>check if the value exists
console.log(arr.includes("c"));
//find=>returns the first matching ele
let arr1 = [34, 67, 2, 1, 45, 78];
console.log(arr1.find((n) => n > 50));
//findindex
console.log(arr1.findIndex((n) => n > 50));
//trasfroming arrays
//map=>transforms each ele
let num = [1, 2, 3, 4, 5, 6, 7, 8];
console.log(num.map((n) => n * 2));

//filter=keeps only matching values
console.log(num.filter(n > 20));
//reduce=>reduces the array into single value
console.log(num.reduce((acc, val) => acc + val, 0));
//forEach=>loops
num.forEach((n) => console.log(n));
//modifying
//slice=>copy part of an array
//concat=>combining
//sort
//reverse
