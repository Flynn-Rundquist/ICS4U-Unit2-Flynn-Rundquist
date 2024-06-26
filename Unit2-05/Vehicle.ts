/**
 * This is the vehicle class.
 *
 * By:      Flynn Rundquist
 * Version: 1.0
 * Since:   2024-04-02
 */
class Vehicle {
    private color: string
    private liscensePlate: string
    private numberOfDoors: number
    private speed: number
    private maxSpeed: number

    constructor (color = 'unknown', liscensePlate = 'unknown', numberOfDoors = 4, maxSpeed = 0, speed = 0) {
        this.color = color
        this.liscensePlate = liscensePlate
        this.numberOfDoors = numberOfDoors
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
        console.log(`-> Number of doors: ${this.numberOfDoors}`)
        console.log(`-> Liscence plate: ${this.liscensePlate}`)
        console.log(`-> Color: ${this.color}`)
    }
}
export default Vehicle

