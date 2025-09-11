package object;
import java.util.*;

class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String n, int r, double m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class student_report {

		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter student name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter roll number: ");
		        int roll = sc.nextInt();

		        System.out.print("Enter marks: ");
		        double marks = sc.nextDouble();

		        Student s = new Student(name, roll, marks);

		        System.out.println("\n--- Student Report ---");
		        s.display();

	}

}
