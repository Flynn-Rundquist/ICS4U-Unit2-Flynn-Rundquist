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
const fruitsisempty = fruits.isEmpty()
console.log("Is the stack empty? " + fruitsisempty)
const fruitSize = fruits.size()
console.log("The size of the stack is: " + fruitSize)
console.log("popped fruit: " + top_fruit)
console.log("fruits: " + fruits.show())
const fruitsisempty2 = fruits.isEmpty()
console.log("Is the stack empty? " + fruitsisempty2)
const top_fruit2 = fruits.peek()
console.log("top fruit: " + top_fruit2)
const fruitsSize2 = fruits.size()
console.log("The size of the stack is: " + fruitsSize2)
fruits.clearStack()
console.log("Emptying stack...")
console.log("fruits: " + fruits.show())
const fruitIsempty1 = fruits.isEmpty()
console.log("Is the stack empty? " + fruitIsempty1)
console.log("\n")

let colours = new FlynnStack()
colours.push("red")
colours.push("blue")
colours.push("green")
console.log("colours: " + colours.show())
const top_colour = colours.pop()
const colourSize = colours.size()
console.log("The size of the stack is: " + colourSize)
console.log("popped colour: " + top_colour)
console.log("colours: " + colours.show())
const colourIsempty = colours.isEmpty()
console.log("Is the stack empty? " + colourIsempty)
const top_colour2 = colours.peek()
console.log("top colour: " + top_colour2)
const colourSize2 = colours.size()
console.log("The size of the stack is: " + colourSize2)
colours.clearStack()
console.log("Emptying stack...")
console.log("colours: " + colours.show())
const colourIsempty1 = colours.isEmpty()
console.log("Is the stack empty? " + colourIsempty1)
console.log("\n")


let animals = new FlynnStack()
animals.push("dog")
console.log("animals: " + animals.show())
const top_animal = animals.pop()
const animalSize = animals.size()
console.log("The size of the stack is: " + animalSize)
console.log("popped animal: " + top_animal)
console.log("animals: " + animals.show())
const animalIsempty = animals.isEmpty()
console.log("Is the stack empty? " + animalIsempty)
const top_animal2 = animals.peek()
console.log("top animal: " + top_animal2)
const animalSize2 = animals.size()
console.log("The size of the stack is: " + animalSize2)
animals.clearStack()
console.log("Emptying stack...")
console.log("animals: " + animals.show())
const animalIsempty1 = animals.isEmpty()
console.log("Is the stack empty? " + animalIsempty1)
console.log("\n")

console.log("\nDone.")
