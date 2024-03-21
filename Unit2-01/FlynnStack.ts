/**
 * This is the FlynnStack class.
 *
 * author Flynn Rundquist
 * version 1.0
 * since 2024-03-19
 */

class FlynnStack {
    strStack: string[]
    
    constructor() {
    private strStack: string[] = []
    constructor() {
    }

    pop(): string {
        return this.strStack.pop()
    }
    push(input: string): void {
        this.strStack.push(input)
    }

    show(): string {
        let values = ""
        for (let counter = 0; counter < this.strStack.length; counter++) {
                values += this.strStack[counter] + ", "
        }
        values = values.substring(0, values.length - 2)
        return values
    }
}

export default = FlynnStack

