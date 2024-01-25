// pass by value / copy
var x = 10;
var y = x; // 10

x += 30; // 40
y += 10; // 20

// console.log(x); // 40
// console.log(y); // 70

// ==========
// pass by reference

var a = [1, 2, 3, 4];
var b = a;

a.push(10);
b.push(20);

console.log(a); // ?
console.log(b); // ?

// =======================================

// Object Literal
var person = {
  name: "Jonas",
  favFood: "🍕",
  age: 28,
};
