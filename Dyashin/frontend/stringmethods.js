//length
let str = "apple";
console.log(str.length);

//touppercase=>converts all the letters to uppsercase
//tolowercase=>converts all the letters to lowercase
let str1 = "APPLE";
console.log("lowercase", str1.toLowerCase());
let str2 = "mango";
console.log("uppercase", str2.toUpperCase());

//charAt=>character at a given pos
console.log("charat", str2.charAt(3));
//charcodeAt()=>returns the ascii values
console.log("charcodeAT", str2.charCodeAt(0));

//indexof() and lastIndexof()
let str3 = "javascript";
console.log("indexof", str3.indexOf("s"));
console.log("lastindexof ", str3.lastIndexOf(a));

//includes=>checks if the string contains the given text

let str4 = "hello world";
console.log("includes", str4.includes("llo"));

//startswith and endswith

console.log("startswith", str3.startsWith(s)); //false
console.log("startswith", str3.startsWith(j)); //true

console.log("endswith", str3.endsWith(s)); //false
console.log("endswith", str3.endsWith(t)); //true

//extracting the string parts
//slice,substring

let string = "hello apple";
console.log("slice", string.slice(0, 5));

console.log("substring", string.substring(6));

//split=>converts string array
let fruits = "apple,banana,cherry";
console.log("split", fruits.split(","));

//concat
let s1 = "hello";
let s2 = "world";
console.log("concat", s1.concat(s2));
//trim=>remove the whitespace
//trimend=>remove the whitespaces from the end
//trimstrart=>remove the spaces from the start

//repeat=>repeat the strig
//replace=> replace the strng
//replaceall=> this will repace all the string char
