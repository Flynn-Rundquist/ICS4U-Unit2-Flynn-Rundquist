/**
 * This is the airplane class.
 *
 * By: Flynn Rundquist
 * Version: 1.0
 * Since: 2024-04-09
 */

class Airplane{
  public speed: number

constructor(speed: number = 0) {
  this.speed = speed
}

  // set speed
  public setSpeed(speed: number): number {
    this.speed = speed
    return this.speed
  }
}

export default Airplane

