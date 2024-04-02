/**
 * This program returns the largest run of zeroes of more adjacent characters
 * that are the same (ex. xxyyyz -> 3).
 *
 * author Flynn Rundquist
 * version 1.0
 * since 2024-04
 */

import * as readline from 'readline'

const reader = readline.createInterface({
  input: process.stdin,
  output: process.stdout
})

reader.question("Enter a string: ", (userInput) => {
  const userArray = userInput.split("")
  let maxRun = 0

  for(let counter = 0; counter < userArray.length; counter++) {
    let currentRun = 1
    while (userArray[counter] === userArray[counter + currentRun]) {
      currentRun++
    }
    if (currentRun > maxRun) {
      maxRun = currentRun
    }
  }

  console.log(`The largest run in the string is ${maxRun}.`)
  console.log(`\nDone.`)
  reader.close()
})

