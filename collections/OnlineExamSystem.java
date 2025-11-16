package collections;

import java.util.*;

class Question {
 int id;
 String text;

 public Question(int id, String text) {
     this.id = id;
     this.text = text;
 }

 @Override
 public String toString() {
     return "Q" + id + ": " + text;
 }
}

class Student {
 String studentId;
 String name;

 public Student(String studentId, String name) {
     this.studentId = studentId;
     this.name = name;
 }

 @Override
 public String toString() {
     return studentId + " - " + name;
 }
}

public class OnlineExamSystem {

 public static void main(String[] args) {

     Set<String> uniqueStudents = new HashSet<>();

     List<Question> questionBank = new ArrayList<>();

     Queue<Student> studentQueue = new LinkedList<>();

     Stack<Question> questionStack = new Stack<>();

     enrollStudent(uniqueStudents, studentQueue, "S101", "Alice");
     enrollStudent(uniqueStudents, studentQueue, "S102", "Bob");
     enrollStudent(uniqueStudents, studentQueue, "S103", "Charlie");
     enrollStudent(uniqueStudents, studentQueue, "S101", "Alice Again (Duplicate)");

     System.out.println("\nStudents in Queue:");
     studentQueue.forEach(System.out::println);

     questionBank.add(new Question(1, "What is Java?"));
     questionBank.add(new Question(2, "What is polymorphism?"));
     questionBank.add(new Question(3, "Explain inheritance."));
     questionBank.add(new Question(4, "What is JVM?"));

     Collections.shuffle(questionBank);

     System.out.println("\nRandomized Question Set:");
     questionBank.forEach(System.out::println);

     System.out.println("\nServing Students for Exam:");
     while (!studentQueue.isEmpty()) {
         Student stu = studentQueue.poll();
         System.out.println("\nStudent Taking Exam: " + stu);

         questionStack.clear();
         for (Question q : questionBank)
             questionStack.push(q);

         System.out.println("Navigating Questions:");

         while (!questionStack.isEmpty()) {
             Question current = questionStack.pop();
             System.out.println("Viewing: " + current);
         }

         System.out.println("Exam Finished for " + stu.name);
     }
 }

 public static void enrollStudent(Set<String> uniqueSet, Queue<Student> queue,
                                  String id, String name) {

     if (uniqueSet.contains(id)) {
         System.out.println("\nDuplicate Student Login Blocked: " + id);
     } else {
         uniqueSet.add(id);
         queue.add(new Student(id, name));
         System.out.println("\nStudent Enrolled: " + id + " - " + name);
     }
 }
}
