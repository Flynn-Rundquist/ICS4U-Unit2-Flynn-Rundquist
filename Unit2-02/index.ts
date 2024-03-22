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
top_fruit = fruits.pop()
console.log("popped fruit: " + top_fruit)
console.log("fruits: " + fruits.show())

let colours = new FlynnStack()
colours.push("red")
colours.push("blue")
colours.push("purple")
console.log("colours: " + colours.show())

let animals = new FlynnStack()
animals.push("dog")
animals.push("bird")
animals.push("cat")
console.log("animals: " + animals.show())

console.log("\nDone.")
