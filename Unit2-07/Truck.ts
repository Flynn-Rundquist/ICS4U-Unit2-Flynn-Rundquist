/**
 * This is the truck class.
 *
 * By:      Flynn Rundquist
 * Version: 1.0
 * Since:   2022-04-10
 */

import Vehicle from './Vehicle'

class Truck extends Vehicle {
    private lisencePlate: string

    constructor (color = 'unknown', maxSpeed = 0, lisencePlate = 'unknown', speed = 0) {
        super(color, maxSpeed, speed)
        this.lisencePlate = lisencePlate
    }

    // air breaks
    applyAir (airPressure: number) {
        this.speed = this.speed - airPressure / 2
        return this.speed
    }
    // status
    status (): void {
        console.log(`-> Speed: ${this.speed}`)
        console.log(`-> Max Speed: ${this.maxSpeed}`)
        console.log(`-> Color: ${this.color}`)
        console.log(`-> Lisence Plate: ${this.lisencePlate}`)
    }
}

export default Truck

