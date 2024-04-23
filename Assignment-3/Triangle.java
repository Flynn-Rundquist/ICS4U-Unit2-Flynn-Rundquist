/**
 * The triangle class.
 *
 * @author Flynn Rundquist
 * @version 1.0
 * @since 2024-04-22
 */


public class Triangle {
    private int side1;
    private int side2;
    private int side3;
    
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String isValid() {
        if (side1 + side2 > side3 || side2 + side3 > side1 || side3 + side1 > side1) {
            return "true";
        } else {
            return "false";
        }
    }

    public double semiPerimeter() {
        int semiPerimeter = (side1 + side2 + side3) / 2;
        return semiPerimeter;
    }

    public double area() {
        double area = Math.sqrt(semiPerimeter() * (semiPerimeter() - side1) * (semiPerimeter() - side2) * (semiPerimeter() - side3));
        return area;
    }

    public String getType() {
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public double angle(double angleNumber) {
        if (angleNumber == 1) {
            double angle = Math.acos((Math.pow(side2, 2) + Math.pow(side3, 2) - Math.pow(side1, 2)) / (2 * side2 * side3));
            return angle;
        } else if (angleNumber == 2) {
            double angle = Math.acos((Math.pow(side3, 2) + Math.pow(side1, 2) - Math.pow(side2, 2)) / (2 * side3 * side1));
            return angle;
        } else if (angleNumber == 3) {
            double angle = Math.acos((Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2)) / (2 * side1 * side2));
            return angle;
        }
    }

    public double height(double sideNumber) {
        if (sideNumber == 1) {
            double height = (2 * area() / side1);
            return height;
        } else if (sideNumber == 2) {
            double height = (2 * area() / side2);
            return height;
        } else if (sideNumber == 3) {
            double height = (2 * area() / side3);
            return height;
        }
        }

    public double innerCircleRadius() {
        double radius = area() / semiPerimeter();
        return radius;
    }

    public double circumsCircleRadius() {
        double radius = (side1 * side2 * side3) / (4 * area());
        return radius;
        }
    }