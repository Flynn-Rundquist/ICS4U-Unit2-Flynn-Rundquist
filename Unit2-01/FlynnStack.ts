/**
 * This is the FlynnStack class.
 *
 * author Flynn Rundquist
 * version 1.0
 * since 2024-03-19
 */

class FlynnStack {
    strstack: string[]
    
    constructor() {
        this.strstack = []
    }

    push(input: string): void {
        this.strstack.push(input)
    }

    show(): string {
        let values = ""
        for (let counter = 0; counter < this.strstack.length; counter++) {
                values += this.strstack[counter] + ", "
        }
        values = values.substring(0, values.length - 2)
        return values
    }
}

export = FlynnStack

