/**
 * This is the bike class.
 *
 * By: Flynn Rundquist
 * Version: 1.0
 * Since: 2022-04-10
 */

import Vehicle from './Vehicle'

class Bike extends Vehicle {
    public cadense: number
    constructor(colour = 'unknown', maxSpeed = 0, cadense = 0, speed = 0) {
        super()
        this.cadense = cadense
        this.color = colour
        this.maxSpeed = maxSpeed
        this.speed = speed
    }
    // accelerate
    accelerate(appliedPower: number) {
        this.cadense += appliedPower
        return this.cadense
    }

    // ring bell
    ringBell() {
        console.log('Ring ring!')
    }

    // status
    status() {
        this.speed = this.cadense * 2
        console.log(`-> Speed: ${this.speed}`)
        console.log(`-> Max Speed: ${this.maxSpeed}`)
        console.log(`-> Color: ${this.color}`)
        console.log(`-> Cadence: ${this.cadense}`)
    }
}

export default Bike

