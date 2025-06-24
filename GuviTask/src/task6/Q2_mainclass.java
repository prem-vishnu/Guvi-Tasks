package task6;

public class Q2_mainclass {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "Prem", "Vishnu", 10000);
        System.out.println(emp); 
        emp.raiseSalary(10); 
        System.out.println("New salary: " + emp.getSalary());
        System.out.println("Annual salary: " + emp.getAnnualSalary());

	}

}
