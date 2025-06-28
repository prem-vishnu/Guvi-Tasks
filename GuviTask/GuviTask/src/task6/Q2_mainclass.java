package task6;

public class Q2_mainclass {

	public static void main(String[] args) {
		Employee obj = new Employee(101, "Prem", "Vishnu", 10000);
        System.out.println(obj); 
        obj.raiseSalary(10); 
        System.out.println("New salary: " + obj.getSalary());
        System.out.println("Annual salary: " + obj.getAnnualSalary());

	}

}
