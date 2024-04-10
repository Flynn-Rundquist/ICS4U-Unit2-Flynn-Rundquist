/**
 * This is the main code for Airplane class.
 *
 * By: Flynn Rundquist
 * Version: 1.0
 * Since: 2024-04-09
 */

import Airplane from './Airplane'
import Jet from './Jet'

const biplane = new Airplane()
const planeSpeed = biplane.setSpeed(212)
console.log(`${planeSpeed}`)

const boeing = new Jet()
let jetSpeed = boeing.setSpeed(422)

for (let counter = 0; counter < 4; counter++) {
  jetSpeed = boeing.accelerate(jetSpeed)
  console.log(`${jetSpeed}`)
  if (jetSpeed < 5000) {
    jetSpeed = boeing.accelerate(jetSpeed)
    console.log(`${jetSpeed}`)
  }
}
let planeSpeed2 = biplane.setSpeed(planeSpeed * 8)
console.log(`${planeSpeed2}`)



console.log("\nDone.")

