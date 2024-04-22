/**
 * This is the code that runs with the Triangle class.
 * 
 * By:      Flynn Rundquist
 * Version: 1.0
 * Since:   2024-04-23
 */

import Triangle from './Triangle'

const triangle1 = new Triangle(3, 3, 3)
console.log('Created a 3 mm by 3 mm by 3 mm triangle.')
console.log('Is it valid? ' + triangle1.isValid())
console.log(`Semiperimeter: ${triangle1.semiPerimeter().toFixed(4)} mm`)
console.log(`Area: ${triangle1.area().toFixed(4)} mm^2`)
console.log(`Type: ${triangle1.getType()} triangle`)
console.log(`Angle 1: ${triangle1.angle(1).toFixed(4)} radians`)
console.log(`Angle 2: ${triangle1.angle(2).toFixed(4)} radians`)
console.log(`Angle 3: ${triangle1.angle(3).toFixed(4)} radians`)
console.log(`Height 1: ${triangle1.height(1).toFixed(4)} mm`)
console.log(`Height 2: ${triangle1.height(2).toFixed(4)} mm`)
console.log(`Height 3: ${triangle1.height(3).toFixed(4)} mm`)
console.log(`Inner circle radius: ${triangle1.innerCircleRadius().toFixed(4)} mm`)
console.log(`Circumcircle radius: ${triangle1.circumsicleRadius().toFixed(4)} mm`)
console.log("\n")

const triangle2 = new Triangle(3, 4, 5)
console.log('Created a 3 mm by 4 mm by 5 mm triangle.')
console.log('Is it valid? ' + triangle2.isValid())
console.log(`Semiperimeter: ${triangle2.semiPerimeter().toFixed(4)} mm`)
console.log(`Area: ${triangle2.area().toFixed(4)} mm^2`)
console.log(`Type: ${triangle2.getType()} triangle`)
console.log(`Angle 1: ${triangle2.angle(1).toFixed(4)} radians`)
console.log(`Angle 2: ${triangle2.angle(2).toFixed(4)} radians`)
console.log(`Angle 3: ${triangle2.angle(3).toFixed(4)} radians`)
console.log(`Height 1: ${triangle2.height(1).toFixed(4)} mm`)
console.log(`Height 2: ${triangle2.height(2).toFixed(4)} mm`)
console.log(`Height 3: ${triangle2.height(3).toFixed(4)} mm`)
console.log(`Inner circle radius: ${triangle2.innerCircleRadius().toFixed(4)} mm`)
console.log(`Circumcircle radius: ${triangle2.circumsicleRadius().toFixed(4)} mm`)
console.log("\n")

const triangle3 = new Triangle(3, 4, 4)
console.log('Created a 3 mm by 4 mm by 4 mm triangle.')
console.log('Is it valid? ' + triangle3.isValid())
console.log(`Semiperimeter: ${triangle3.semiPerimeter().toFixed(4)} mm`)
console.log(`Area: ${triangle3.area().toFixed(4)} mm^2`)
console.log(`Type: ${triangle3.getType()} triangle`)
console.log(`Angle 1: ${triangle3.angle(1).toFixed(4)} radians`)
console.log(`Angle 2: ${triangle3.angle(2).toFixed(4)} radians`)
console.log(`Angle 3: ${triangle3.angle(3).toFixed(4)} radians`)
console.log(`Height 1: ${triangle3.height(1).toFixed(4)} mm`)
console.log(`Height 2: ${triangle3.height(2).toFixed(4)} mm`)
console.log(`Height 3: ${triangle3.height(3).toFixed(4)} mm`)
console.log(`Inner circle radius: ${triangle3.innerCircleRadius().toFixed(4)} mm`)
console.log(`Circumcircle radius: ${triangle3.circumsicleRadius().toFixed(4)} mm`)

console.log("\nDone.")
