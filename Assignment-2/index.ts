/**
 * This program returns the largest run of adjacent characters that are the same.
 * (ex. abbb has a run of 3).
 *
 * author Flynn Rundquist
 * version 1.0
 * since 2024-04
 */

import { createPrompt } from "bun-promptx"

function longestRun(inputString: string): number {
  let currentRun = 1 // Length of the current run
  let longestRun = 1 // Length of the longest run found so far
  let counter = 1 // Counter to iterate through the string

  while (counter < inputString.length) {
    if (inputString[counter] === inputString[counter - 1]) {
      // Increment the current run length if the current character matches the previous one
      currentRun++
    } else {
      // Reset the current run length if the current character doesn't match the previous one
      currentRun = 1
    }

    // Update the longest run if the current run is longer
    if (currentRun > longestRun) {
      longestRun = currentRun
    }

    counter++
  }

  return longestRun
}

// User input
const userInput = createPrompt("Enter a string: ")
const inputStr = userInput.value

if (inputStr !== null) {
  if (inputStr.length === 1) {
    console.log("Enter a string with more than one character.")
  } else {
    const output = longestRun(inputStr)
    console.log(`Longest run: ${output}`)
  }
} else {
  console.log("Invalid input.")
}

console.log("\nDone.")
