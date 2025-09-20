package obj_oriented_design;
import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void showEmployee() {
        System.out.println("   Employee: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void showDepartment() {
        System.out.println(" Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }

    void closeCompany() {
        System.out.println("\nClosing company: " + companyName);
        departments.clear(); 
    }
}

public class problem3 {

	public static void main(String[] args) {
		Company company = new Company("TechSoft Inc.");

        Department d1 = new Department("HR");
        d1.addEmployee("Alice");
        d1.addEmployee("Bob");

        Department d2 = new Department("IT");
        d2.addEmployee("Charlie");
        d2.addEmployee("David");

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompany();

        company.closeCompany();

        company.showCompany();
	}

}
