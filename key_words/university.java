package key_words;

class Student {
    static String universityName = "Global University";

    private static int totalStudents = 0;

    private String name;
    private String grade;
    private final int rollNumber; 

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; 
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Not a valid Student object.");
        }
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " to " + grade);
        } else {
            System.out.println("Invalid Student object. Cannot update grade.");
        }
    }
}

public class university {

	public static void main(String[] args) {
		 Student s1 = new Student("Alice", 1, "A");
	        Student s2 = new Student("Bob", 2, "B");

	        s1.displayDetails();
	        s2.displayDetails();

	        s2.updateGrade("A+");

	        s2.displayDetails();

	        Student.displayTotalStudents();
	}
}