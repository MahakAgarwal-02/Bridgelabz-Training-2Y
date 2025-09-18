package constructors;


class Student {
    public int rollNumber;      
    protected String name;      
    private double CGPA;        

    Student(int roll, String n, double c) {
        rollNumber = roll;
        name = n;
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double newCGPA) {
        CGPA = newCGPA;
    }

    public void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int roll, String n, double c, String spec) {
        super(roll, n, c); 
        specialization = spec;
    }

    public void displayPGDetails() {
        System.out.println("Postgraduate Student: " + name + ", Specialization: " + specialization);
    }
}
public class UniversityManagementSystem {

	public static void main(String[] args) {
		 Student s1 = new Student(101, "Alice", 8.5);
	        s1.display();

	        
	        System.out.println("Current CGPA: " + s1.getCGPA());
	        s1.setCGPA(9.0);
	        System.out.println("Updated CGPA: " + s1.getCGPA());

	        
	        PostgraduateStudent pg = new PostgraduateStudent(201, "Bob", 8.7, "Computer Science");
	        pg.displayPGDetails();
	}

}
