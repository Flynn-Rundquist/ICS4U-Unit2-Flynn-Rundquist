/**
 * This is the bike class.
 *
 * By: Flynn Rundquist
 * Version: 1.0
 * Since: 2022-04-10
 */

import Vehicle from './Vehicle'

class Bike extends Vehicle {
    private cadence: number

    constructor(cadence = 0) {
        super()
        this.cadence = cadence
    }

    // accelerate
    accelerate(appliedPower: number) {
        this.cadence += appliedPower
        return this.cadence
    }

    // ring bell
    Ring_Bell() {
        console.log('Ring ring!')
    }
}

export default Bike

