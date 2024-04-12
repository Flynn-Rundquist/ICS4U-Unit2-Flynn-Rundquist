/**
 * This is the vehicle class.
 *
 * By:      Flynn Rundquist
 * Version: 1.0
 * Since:   2024-04-02
 */
class Vehicle {
  protected color: string
  protected speed: number
  protected maxSpeed: number

  constructor (speed = 0, maxSpeed = 0, color = 'unknown') {
    this.color = color
    this.speed = speed
    this.maxSpeed = maxSpeed
  }
  // acceleration method
  accelerate (accelerationPower: number, accelerationTime: number) {
    this.speed += (accelerationPower * accelerationTime)
    return this.speed
  }

  // brake method
  break (brakePower: number, brakeTime: number) {
    this.speed -= (brakePower * brakeTime)
    return this.speed
  }

  // status method
  status (): void {
    console.log(`-> Speed: ${this.speed}`)
    console.log(`-> Max Speed: ${this.maxSpeed}`)
    console.log(`-> Color: ${this.color}`)
  }
}
export default Vehicle
