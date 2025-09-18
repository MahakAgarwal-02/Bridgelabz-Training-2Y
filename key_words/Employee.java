package key_words;

class Employees {

    static String companyName = "Tech Solutions Pvt. Ltd.";

    private static int totalEmployees = 0;

    private String name;
    private String designation;
    private final int id;   

    Employees(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        }
        
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employees) {   
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Not a valid Employee object.");
        }
    }
}
public class Employee {

	public static void main(String[] args) {	
		Employees e1 = new Employees("Alice", 101, "Software Engineer");
        Employees e2 = new Employees("Bob", 102, "Data Analyst");

        e1.displayDetails();
        e2.displayDetails();

        Employees.displayTotalEmployees();
	}

}
