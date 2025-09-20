package obj_oriented_design;

import java.util.ArrayList;

class Student {
 String name;
 ArrayList<Course> courses;

 Student(String name) {
     this.name = name;
     this.courses = new ArrayList<>();
 }

 void enrollCourse(Course course) {
     if (!courses.contains(course)) {
         courses.add(course);
         course.addStudent(this); 
         System.out.println(name + " enrolled in " + course.courseName);
     }
 }

 void viewCourses() {
     System.out.println("Student " + name + " is enrolled in:");
     for (Course c : courses) {
         System.out.println(" - " + c.courseName);
     }
     System.out.println();
 }
}

class Professor {
 String name;
 ArrayList<Course> courses;

 Professor(String name) {
     this.name = name;
     this.courses = new ArrayList<>();
 }

 void assignCourse(Course course) {
     if (!courses.contains(course)) {
         courses.add(course);
         course.addProfessor(this); 
         System.out.println("Professor " + name + " assigned to " + course.courseName);
     }
 }

 void viewCourses() {
     System.out.println("Professor " + name + " teaches:");
     for (Course c : courses) {
         System.out.println(" - " + c.courseName);
     }
     System.out.println();
 }
}

class Course {
 String courseName;
 ArrayList<Student> students;
 ArrayList<Professor> professors;

 Course(String courseName) {
     this.courseName = courseName;
     this.students = new ArrayList<>();
     this.professors = new ArrayList<>();
 }

 void addStudent(Student student) {
     if (!students.contains(student)) {
         students.add(student);
     }
 }

 void addProfessor(Professor professor) {
     if (!professors.contains(professor)) {
         professors.add(professor);
     }
 }

 void showCourseDetails() {
     System.out.println("\nCourse: " + courseName);

     System.out.println(" Professors:");
     for (Professor p : professors) {
         System.out.println(" - " + p.name);
     }

     System.out.println(" Students:");
     for (Student s : students) {
         System.out.println(" - " + s.name);
     }
 }
}

class University {
 String name;
 ArrayList<Student> students;
 ArrayList<Professor> professors;
 ArrayList<Course> courses;

 University(String name) {
     this.name = name;
     this.students = new ArrayList<>();
     this.professors = new ArrayList<>();
     this.courses = new ArrayList<>();
 }

 void addStudent(Student student) {
     students.add(student);
 }

 void addProfessor(Professor professor) {
     professors.add(professor);
 }

 void addCourse(Course course) {
     courses.add(course);
 }

 void showUniversity() {
     System.out.println("\nUniversity: " + name);
     System.out.println(" Students:");
     for (Student s : students) {
         System.out.println(" - " + s.name);
     }
     System.out.println(" Professors:");
     for (Professor p : professors) {
         System.out.println(" - " + p.name);
     }
     System.out.println(" Courses:");
     for (Course c : courses) {
         System.out.println(" - " + c.courseName);
     }
 }
}

public class self_problem5 {

	public static void main(String[] args) {
		University uni = new University("Global Tech University");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        Course c1 = new Course("Computer Science");
        Course c2 = new Course("Mathematics");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addProfessor(p2);
        uni.addCourse(c1);
        uni.addCourse(c2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        uni.showUniversity();
        s1.viewCourses();
        s2.viewCourses();
        p1.viewCourses();
        p2.viewCourses();
        c1.showCourseDetails();
        c2.showCourseDetails();
	}

}
