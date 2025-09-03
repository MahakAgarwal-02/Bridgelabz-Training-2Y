package string;
import java.util.Random;
import java.util.Scanner;
public class VotingElligibility {
	    public static int[] generateRandomAges(int n) {
	        Random rand = new Random();
	        int[] ages = new int[n];
	        for (int i = 0; i < n; i++) {
	            ages[i] = rand.nextInt(100);
	        }
	        return ages;
	    }

	    public static String[][] checkVotingEligibility(int[] ages) {
	        String[][] result = new String[ages.length][2];
	        for (int i = 0; i < ages.length; i++) {
	            result[i][0] = String.valueOf(ages[i]);
	            if (ages[i] < 0) {
	                result[i][1] = "false";
	            } else {
	                result[i][1] = (ages[i] >= 18) ? "true" : "false";
	            }
	        }
	        return result;
	    }

	    public static void displayResults(String[][] data) {
	        System.out.println("Age\tCan Vote?");
	        System.out.println("-----------------");
	        for (String[] row : data) {
	            System.out.println(row[0] + "\t" + row[1]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number of students: ");
	        int n = scanner.nextInt();

	        int[] ages = generateRandomAges(n);

	        String[][] eligibility = checkVotingEligibility(ages);

	        System.out.println("Generated student ages and voting eligibility:");
	        displayResults(eligibility);
	}

}
