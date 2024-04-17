/**
 * This program returns the largest run of adjacent characters that are the same.
 * (ex. abbb has a run of 3).
 *
 * author Flynn Rundquist
 * version 1.0
 * since 2024-04
 */

import { createPrompt } from "bun-promptx"

function longestRun() {
  let currentRun = 1
  let longestRun = 1
  let counter = 1

  while (counter < inputString.length) {
    if (inputString[counter] === inputString[counter - 1]) {
      currentRun++
    } else {
      currentRun = 1
    }

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
