/*
* This program is a vehicle class.
*
* @author  Flynn Rundquist
* @version 1.0
* @since   2022-04-10
*/

import Vehicle from "./Vehicle.ts"
import Truck from "./Truck.ts"
import Bike from "./Bike.ts"

const bmx = new Bike('Red', 40, 0, 0)

console.log('Created Bmx bike.\nStatus:\n')
bmx.status()
bmx.cadencestatus()

const bigTruck = new Truck('Grey', 0, 200, 'HGC-3456F')

console.log('\nCreated a Truck.\nStatus:\n')
bigTruck.setTires(6)
bigTruck.status()
bigTruck.plateStatus()

// will not work
const vehicle = new Vehicle(0, 0, 'Blue', 4)

console.log("\nDone.")
