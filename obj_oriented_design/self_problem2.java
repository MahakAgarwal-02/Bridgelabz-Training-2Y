package obj_oriented_design;
import java.util.ArrayList;

class Faculty {
 String name;
 String subject;

 Faculty(String name, String subject) {
     this.name = name;
     this.subject = subject;
 }

 void showFaculty() {
     System.out.println(" Faculty: " + name + " teaches " + subject);
 }
}

class Department {
 String deptName;

 Department(String deptName) {
     this.deptName = deptName;
 }

 void showDepartment() {
     System.out.println(" Department: " + deptName);
 }
}

class University {
 String universityName;
 ArrayList<Department> departments; 
 ArrayList<Faculty> faculties;      

 University(String universityName) {
     this.universityName = universityName;
     this.departments = new ArrayList<>();
     this.faculties = new ArrayList<>();
 }

 void addDepartment(String deptName) {
     departments.add(new Department(deptName));
 }

 void addFaculty(Faculty faculty) {
     faculties.add(faculty);
 }

 void showUniversity() {
     System.out.println("University: " + universityName);

     System.out.println(" Departments:");
     for (Department d : departments) {
         d.showDepartment();
     }

     System.out.println(" Faculties:");
     for (Faculty f : faculties) {
         f.showFaculty();
     }
     System.out.println();
 }

 void closeUniversity() {
     System.out.println("\nClosing University: " + universityName);
     departments.clear(); 
     faculties.clear();   
 }
}


public class self_problem2 {

	public static void main(String[] args) {
		University uni = new University("Oxford University");

    
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mathematics");

       
        Faculty f1 = new Faculty("Dr. Alice", "AI");
        Faculty f2 = new Faculty("Dr. Bob", "Algebra");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        
        uni.showUniversity();

      
        uni.closeUniversity();

        System.out.println("\nFaculty members still exist independently:");
        f1.showFaculty();
        f2.showFaculty();
	}

}
