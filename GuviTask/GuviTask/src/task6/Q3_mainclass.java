package task6;

public class Q3_mainclass {

	public static void main(String[] args) {
		Circle c1 = new Circle();  
        System.out.println("Default Circle Circumference: " + c1.getCircumference());

        Circle c2 = new Circle(5, 3.14);  
        System.out.println("Custom Circle Circumference: " + c2.getCircumference());
	}

}
