package collections;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " | Marks: " + marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.marks, this.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.name.equals(s.name);
    }
}

public class CollegeAdmissionSystem {

    public static void main(String[] args) {

        List<Student> applicants = new ArrayList<>();

        applicants.add(new Student("Aman", 92));
        applicants.add(new Student("Riya", 85));
        applicants.add(new Student("Karan", 76));
        applicants.add(new Student("Priya", 89));
        applicants.add(new Student("Riya", 85));  // Duplicate – handled later

        Set<Student> shortlist = new HashSet<>();

        for (Student s : applicants) {
            if (s.marks >= 80) {
                shortlist.add(s);
            }
        }

        System.out.println("\nShortlisted Candidates:");
        shortlist.forEach(System.out::println);

        Queue<Student> interviewQueue = new LinkedList<>(shortlist);

        System.out.println("\nInterview Queue:");
        interviewQueue.forEach(System.out::println);

        TreeSet<Student> meritList = new TreeSet<>();

        System.out.println("\nProcessing Interviews...");
        while (!interviewQueue.isEmpty()) {
            Student s = interviewQueue.poll();
            meritList.add(s);
            System.out.println("Interview done: " + s.name);
        }
        System.out.println("\nFinal Merit List (Sorted):");
        meritList.forEach(System.out::println);
    }
}
