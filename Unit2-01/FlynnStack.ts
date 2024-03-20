/**
 * This is the FlynnStack class.
 *
 * author Flynn Rundquist
 * version 1.0
 * since 2024-03-19
 */

class FlynnStack {
    // strstack: string[]
    
    constructor() {
        self.strstack = []
    }

    push(input) {
        self.strstack.push(input)
    }

    show() {
        let values = ""
        for (let counter = 0; counter < self.strstack.length; counter++) {
                values = values + self.strstack[counter] + ""
        }
        values = values.substring(0, values.length-2)
        return values
    }
}
export = FlynnStack

