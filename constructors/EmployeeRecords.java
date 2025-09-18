package constructors;

class Employee {
    public int employeeID;        
    protected String department; 
    private double salary;        
    
    Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    private String teamName;

    Manager(int id, String dept, double sal, String team) {
        super(id, dept, sal);
        teamName = team;
    }

    public void displayManagerDetails() {

    	System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Team: " + teamName);
    }
}
public class EmployeeRecords {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "IT", 40000);
        emp1.displayEmployee();

        emp1.setSalary(45000);
        System.out.println("Current Salary: " + emp1.getSalary());

        Manager mgr = new Manager(201, "HR", 60000, "Recruitment");
        mgr.displayManagerDetails();
	}

}
