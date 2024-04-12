/**
 * This is the bike class.
 *
 * By: Flynn Rundquist
 * Version: 1.0
 * Since: 2022-04-10
 */

import Vehicle from './Vehicle.ts'

class Bike extends Vehicle {
  private cadence: number

  constructor(color = 'unknown', maxSpeed = 0, speed = 0, cadence = 0) {
    super(maxSpeed, speed)
    this.cadence = cadence
    this.color = color
    this.tireNum = tireNum
  }

  // accelerate
  accelerate(appliedPower: number) {
    this.cadence += appliedPower
    return this.cadence
  }

  // set cadense
  setCadence(cadence: number) {
    this.cadence = cadence
    this.speed = cadence * 2
  }

  // ring bell
  ringBell() {
    console.log('Ding ding!')
  }

  cadencestatus (): void {
    console.log(`-> Cadence: ${this.cadence}`)
  }
}

export default Bike
