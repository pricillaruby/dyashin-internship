// A Promise in JavaScript represents the result of an asynchronous operation (something that takes time, like fetching data from an API).
// It has 3 states:

// Pending → Initial state, waiting for result.

// Fulfilled → Operation succeeded (resolve).

// Rejected → Operation failed (reject).
//method in promise
//1 promise.all=>Runs multiple promises in parallel, waits until all are done.
//2 promise.race=>Returns the first promise that finishes (success or failure).
//3 fetch =>fetch the data from the api
let mypromise = new Promise((resolve, reject) => {
  let success = true;
  if (success) {
    resolve("sucessful");
  } else {
    reject("failed");
  }
});
mypromise
  .then((result) => console.log(result))
  .catch((error) => console.log(error));

//fetch

fetch("https://jsonplaceholder.typicode.com/posts/1")
  .then((response) => response.json()) // convert response to JSON
  .then((data) => console.log(data)) // handle data
  .catch((error) => console.error("Error:", error));

//async and await function
async function getPost() {
  try {
    let response = await fetch("https://jsonplaceholder.typicode.com/posts/1");
    let data = await response.json();
    console.log(data);
  } catch (error) {
    console.error("Error:", error);
  }
}

getPost();
