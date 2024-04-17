/**
 * This program returns the largest run of zeroes of more adjacent characters
 * that are the same (ex. xxyyyz -> 3).
 *
 * author Flynn Rundquist
 * version 1.0
 * since 2024-04
 */

import { createPrompt } from "bun-promptx"

function blowup(inputString: string): string {
  let result = ''
  let index = 0
  while (index < inputString.length) {
    if (/\d/.test(inputString[index])) {
      if (index + 1 < inputString.length && /[a-zA-Z]/.test(inputString[index + 1])) {
        const num = Number(inputString[index])
        const charToRepeat = inputString[index + 1]
        result += charToRepeat.repeat(num)
        index++
      }
    } else {
      result += inputString[index]
    }
    index++
  }
  return result
}

// user input
const userInput = createPrompt("Enter a string: ")
const inputStr = userInput.value
if (inputStr !== null) {
  if (inputStr.length === 1 && /[a-zA-Z]/.test(inputStr)) {
    console.log("Enter a string with more than one character.")
  } else if (inputStr.length === 1 && /\d/.test(inputStr)) {
    console.log("Enter a string with more than one character.")
  } else {
    const output = blowup(inputStr)
    console.log(`Result: ${output}`)
  }
} else {
  console.log("Invalid input.");
}
console.log("\nDone.")
