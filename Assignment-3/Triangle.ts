/**
 * This is the Triangle() class.
 * 
 * By:      Flynn Rundquist
 * Version: 1.0
 * Since:   2024-04-23
 */

class Triangle {
    private side1: number
    private side2: number
    private side3: number
    
    constructor (side1: number, side2: number, side3: number) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    // is valid method
public isValid(): boolean {
    if (this.side1 + this.side2 > this.side3 && 
        this.side2 + this.side3 > this.side1 && 
        this.side3 + this.side1 > this.side2) {
        return true;
    } else {
        return false;
    }
}

// semiPerimeter method
public semiPerimeter(): number {
    if (!this.isValid()) {
        return -1;
    }
    
    let semiPerimeter = (this.side1 + this.side2 + this.side3) / 2;
    return semiPerimeter;
}

  // area method
public area(): number {
    if (!this.isValid()) {
        return -1;
    }
    
    let semiPerimeter = this.semiPerimeter();
    let area = Math.sqrt(semiPerimeter * (semiPerimeter - this.side1) * (semiPerimeter - this.side2) * (semiPerimeter - this.side3));
    return area;
}

// get type method
public getType(): string {
    if (!this.isValid()) {
        return '-1';
    }
    
    if (this.side1 === this.side2 && this.side2 === this.side3) {
        return 'Equilateral';
    } else if (this.side1 === this.side2 || this.side2 === this.side3 || this.side3 === this.side1) {
        return 'Isosceles';
    } else if (Math.sqrt(this.side1) + Math.sqrt(this.side2) === Math.sqrt(this.side3) || 
        Math.sqrt(this.side2) + Math.sqrt(this.side3) === Math.sqrt(this.side1) || 
        Math.sqrt(this.side3) + Math.sqrt(this.side1) === Math.sqrt(this.side2)) {
        return 'Right Angle';
    } else {
        return 'Scalene';
    }
}

// angle method in rads
public angle(angleNumber: number): number {
    if (!this.isValid()) {
        return -1;
    }
    
    if (angleNumber == 1) {
        let angle = Math.acos((Math.pow(this.side2, 2) + Math.pow(this.side3, 2) - Math.pow(this.side1, 2)) / (2 * this.side2 * this.side3));
        return angle;
    } else if (angleNumber == 2) {
        let angle = Math.acos((Math.pow(this.side1, 2) + Math.pow(this.side3, 2) - Math.pow(this.side2, 2)) / (2 * this.side1 * this.side3));
        return angle;
    } else if (angleNumber == 3) {
        let angle = Math.acos((Math.pow(this.side1, 2) + Math.pow(this.side2, 2) - Math.pow(this.side3, 2)) / (2 * this.side1 * this.side2));
        return angle;
    }
}

// height method
public height(sideNumber: number): number {
    if (!this.isValid()) {
        return -1;
    }
    
    if (sideNumber == 1) {
        let height = (2 * this.area()) / this.side1;
        return height;
    } else if (sideNumber == 2) {
        let height = (2 * this.area()) / this.side2;
        return height;
    } else if (sideNumber == 3) {
        let height = (2 * this.area()) / this.side3;
        return height;
    }
}

// inner circle radius method
public innerCircleRadius(): number {
    if (!this.isValid()) {
        return -1;
    }
    
    let area = this.area();
    let semiPerimeter = this.semiPerimeter();
    let innerCircleRadius = area / semiPerimeter;
    return innerCircleRadius;
}

// circumsCircleRadius method
public circumsCircleRadius(): number {
    if (!this.isValid()) {
        return -1;
    }
    
    let circumsCircleRadius = (this.side1 * this.side2 * this.side3) / (4 * this.area());
    return circumsCircleRadius;
}
}

export default Triangle
