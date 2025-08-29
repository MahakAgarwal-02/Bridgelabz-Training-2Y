package arrays;
import java.util.*;
public class level2_ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];   
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print((j==0?"Physics":j==1?"Chemistry":"Maths") + ": ");
                int m = sc.nextInt();
                if (m < 0) { 
                    System.out.println("Marks cannot be negative! Enter again.");
                    j--; 
                    continue;
                }
                marks[i][j] = m;
            }
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = total / 3.0;

            if (percent[i] >= 80) grade[i] = 'A';
            else if (percent[i] >= 70) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else if (percent[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        System.out.println("\n--- Result ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + 
                " | Phy=" + marks[i][0] + ", Chem=" + marks[i][1] + ", Math=" + marks[i][2] +
                " | %=" + String.format("%.2f", percent[i]) + 
                " | Grade=" + grade[i]);
        }
	}

}
