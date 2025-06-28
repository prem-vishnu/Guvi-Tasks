//Question3

package task6;

public class Circle {
	private double radius;
	private double pi;

    
    public Circle() {
        this.radius = 1.0;
        this.pi = Math.PI;
    }


    public Circle(double radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * pi * radius;
    }
}