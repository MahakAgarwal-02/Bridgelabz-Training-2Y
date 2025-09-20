package obj_oriented_design;

import java.util.ArrayList;

class Course {
 String courseName;
 ArrayList<Student> students; 

 Course(String courseName) {
     this.courseName = courseName;
     this.students = new ArrayList<>();
 }

 void enrollStudent(Student student) {
     students.add(student);
     if (!student.courses.contains(this)) {
         student.courses.add(this); 
     }
 }

 void showStudents() {
     System.out.println("Course: " + courseName + " has students:");
     for (Student s : students) {
         System.out.println(" - " + s.name);
     }
     System.out.println();
 }
}

class Student {
 String name;
 ArrayList<Course> courses; 
 Student(String name) {
     this.name = name;
     this.courses = new ArrayList<>();
 }

 void enrollInCourse(Course course) {
     courses.add(course);
     if (!course.students.contains(this)) {
         course.students.add(this); 
     }
 }

 void viewCourses() {
     System.out.println(name + " is enrolled in:");
     for (Course c : courses) {
         System.out.println(" - " + c.courseName);
     }
     System.out.println();
 }
}

class School {
 String schoolName;
 ArrayList<Student> students;  

 School(String schoolName) {
     this.schoolName = schoolName;
     this.students = new ArrayList<>();
 }

 void addStudent(Student student) {
     students.add(student);
 }

 void showStudents() {
     System.out.println("School: " + schoolName + " has students:");
     for (Student s : students) {
         System.out.println(" - " + s.name);
     }
     System.out.println();
 }
}

public class self_problem1 {

	public static void main(String[] args) {
		School school = new School("Greenwood High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);

        s2.enrollInCourse(c1);

        s3.enrollInCourse(c2);

        school.showStudents();

        s1.viewCourses();
        s2.viewCourses();
        s3.viewCourses();

        c1.showStudents();
        c2.showStudents();

	}

}
