/*
* This program is a vehicle class.
*
* @author  Flynn Rundquist
* @version 1.0
* @since   2022-04-10
*/

import Truck from "./Truck.ts"
import Bike from "./Bike.ts"

const bmx = new Bike('Red', 40, 0, 0)

console.log('Created Bmx bike.\nStatus:\n')
bmx.status()
bmx.cadencestatus()

console.log('Set the cadense to 10\n')
bmx.setCadence(10)
bmx.status()
bmx.cadencestatus()

console.log('\nAccelerate by 15:')
bmx.accelerate(15)
bmx.status()
bmx.cadencestatus()

console.log('\nRing bell.')
bmx.ringBell()

const bigTruck = new Truck('Grey', 0, 200, 'HGC-3456F')

console.log('\nCreated a Truck.\nStatus:\n')
bigTruck.setTires(6)
bigTruck.status()
bigTruck.plateStatus()
console.log('\nAccelerating, 10 of power for ten seconds:')
bigTruck.accelerate(10, 10)

console.log('\nBreaking, 10 of power and 10 air pressure for 10 sec.')
bigTruck.break(10, 10, 10)

console.log('\nDone.')
