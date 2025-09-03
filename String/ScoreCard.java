package string;
import java.util.Random;
public class ScoreCard {
	    public static int[][] generateScores(int numStudents) {
	        Random rand = new Random();
	        int[][] scores = new int[numStudents][3];
	        for (int i = 0; i < numStudents; i++) {
	            scores[i][0] = 40 + rand.nextInt(61); // Physics 40-100
	            scores[i][1] = 40 + rand.nextInt(61); // Chemistry 40-100
	            scores[i][2] = 40 + rand.nextInt(61); // Math 40-100
	        }
	        return scores;
	    }

	    public static double[][] calculateTotalsAveragesPercentages(int[][] scores) {
	        int numStudents = scores.length;
	        double[][] results = new double[numStudents][4]; 

	        for (int i = 0; i < numStudents; i++) {
	            int total = scores[i][0] + scores[i][1] + scores[i][2];
	            double average = total / 3.0;
	            double percentage = (total / 300.0) * 100;
	            results[i][0] = Math.round(total * 100.0) / 100.0;
	            results[i][1] = Math.round(average * 100.0) / 100.0;
	            results[i][2] = Math.round(percentage * 100.0) / 100.0;
	        }
	        return results;
	    }

	    public static String[] calculateGrades(double[][] percentages) {
	        int numStudents = percentages.length;
	        String[] grades = new String[numStudents];

	        for (int i = 0; i < numStudents; i++) {
	            double p = percentages[i][2];
	            if (p >= 80) grades[i] = "A";
	            else if (p >= 70) grades[i] = "B";
	            else if (p >= 60) grades[i] = "C";
	            else if (p >= 50) grades[i] = "D";
	            else if (p >= 40) grades[i] = "E";
	            else grades[i] = "R";
	        }
	        return grades;
	    }

	    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
	        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
	            "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
	        System.out.println("----------------------------------------------------------------------------------------");

	        for (int i = 0; i < scores.length; i++) {
	            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n", 
	                (i+1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
	        }
	    }

	    public static void main(String[] args) {
	        int numStudents = 10;

	        int[][] scores = generateScores(numStudents);
	        double[][] results = calculateTotalsAveragesPercentages(scores);
	        String[] grades = calculateGrades(results);

	        displayScorecard(scores, results, grades);
	    }
	}