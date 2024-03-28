/**
 * This is the standard index.ts starting point.
 *
 * author Flynn Rundquist
 * version 1.0
 * since 2024-03-19
 */

import FlynnStack from "./FlynnStack"

let fruits = new FlynnStack()
fruits.push("apple")
fruits.push("banana")
fruits.push("cherry")
console.log("fruits: " + fruits.show())
const top_fruit = fruits.pop()
const isempty = fruits.isEmpty()
console.log("Is the stack empty? " + isempty)
const size = fruits.size()
console.log("The size of the stack is: " + size)
console.log("popped fruit: " + top_fruit)
console.log("fruits: " + fruits.show())
const isempty2 = fruits.isEmpty()
console.log("Is the stack empty? " + isempty2)
const top_fruit2 = fruits.peek()
console.log("top fruit: " + top_fruit2)
const size2 = fruits.size()
console.log("The size of the stack is: " + size2)
fruits.clearStack()
console.log("Emptying stack...")
console.log("fruits: " + fruits.show())
const isempty1 = fruits.isEmpty()
console.log("Is the stack empty? " + isempty1)
console.log("\n")

let colours = new FlynnStack()
colours.push("red")
colours.push("blue")

let animals = new FlynnStack()

console.log("\nDone.")
