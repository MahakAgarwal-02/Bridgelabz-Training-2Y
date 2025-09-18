package constructors;

public class Course {

	String courseName;
    int duration; 
    double fee;

    static String instituteName = "ABC Institute";

    Course(String name, int d, double f) {
        courseName = name;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: ₹" + fee +
                ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

	public static void main(String[] args) {

		Course c1 = new Course("Java Programming", 3, 15000);
        Course c2 = new Course("Web Development", 6, 25000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Tech Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
	}

}
