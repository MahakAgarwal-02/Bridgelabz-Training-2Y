package generics;

import java.util.*;

abstract class CourseType {
 abstract String getTypeName();
}

class ExamCourse extends CourseType {
 public String getTypeName() {
     return "Exam-Based Course";
 }
}

class AssignmentCourse extends CourseType {
 public String getTypeName() {
     return "Assignment-Based Course";
 }
}

class ResearchCourse extends CourseType {
 public String getTypeName() {
     return "Research-Based Course";
 }
}

class Course<T extends CourseType> {

 private String courseName;
 private T courseType;

 public Course(String courseName, T courseType) {
     this.courseName = courseName;
     this.courseType = courseType;
 }

 public void showDetails() {
     System.out.println(courseName + " (" + courseType.getTypeName() + ")");
 }

 public T getCourseType() {
     return courseType;
 }
}

class CourseManager {

 public static void printAllCourses(List<? extends CourseType> courseTypes) {
     System.out.println("\n--- All Course Types ---");
     for (CourseType c : courseTypes) {
         System.out.println(c.getTypeName());
     }
 }
}

public class universityCourse {

 public static void main(String[] args) {

     ExamCourse exam = new ExamCourse();
     AssignmentCourse assign = new AssignmentCourse();
     ResearchCourse research = new ResearchCourse();

     Course<ExamCourse> math = new Course<>("Mathematics", exam);
     Course<AssignmentCourse> programming = new Course<>("Programming 101", assign);
     Course<ResearchCourse> thesis = new Course<>("Final Year Thesis", research);

     System.out.println("=== Course Details ===");
     math.showDetails();
     programming.showDetails();
     thesis.showDetails();

     List<CourseType> allCourseTypes = Arrays.asList(exam, assign, research);

     CourseManager.printAllCourses(allCourseTypes);
 }
}

