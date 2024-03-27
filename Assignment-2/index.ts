/**
 * This program returns the largest run of zeroes of more adjacent characters
 * that are the same (ex. xxyyyz -> 3).
 *
 * author Flynn Rundquist
 * version 1.0
 * since 2024-04-03
 */

import { createPrompt } from "bun-promptx"

    let maxRun = 0
    let currentRun = 0
    let previousChar = ""
    let char = ""

    // Get input
    const strInput = createPrompt("Enter a string: ")

    // Split string into array
    const arrInput = strInput[0] = strInput.split("")

for (let counter = 0; counter < arrInput.length; counter++) {
    char = arrInput[counter]
    if (char === previousChar) {
        currentRun += 1
        if (currentRun > maxRun) {
            maxRun = currentRun
        }
    } else {
        currentRun = 0
    }
    previousChar = char
}

console.log(`The largest run of zeroes is ${maxRun}.`)
console.log("\nDone.")

