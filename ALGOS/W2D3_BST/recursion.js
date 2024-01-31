// function greet() {
//   console.log("good morning !");
//   greet();
// }

// greet();

// iterative
// function incrementTo10() {
//   for (var i = 0; i < 11; i++) {
//     console.log(i);
//   }
// }

// incrementTo10();

// recursive

// function incrementTo10Recur(num) {
//   // create default
//   if (num === undefined) {
//     num = 0;
//   }

//   //1. base case
//   if (num >= 10) {
//     return;
//   }
//   //2. Logic
//   num++;
//   console.log(num);
//   //3. recall the funtion again!
//   incrementTo10Recur(num);
// }

// incrementTo10Recur(0);

//* recursive
// 3! = 3 * 2 * 1
// 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1
function factorial(num) {
  // make defaults (if applies)
  if (num === undefined) {
    num = 4;
  }
  // BASE CASE - BREAK POINT !
  if (num === 1) {
    return 1;
  }
  // LOGIC
  // RECURSE
  return num * factorial(num - 1);
}
