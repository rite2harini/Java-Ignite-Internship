import java.util.Scanner;
public class ClassroomResultSystem {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] marks = new int[10];
	        int passed = 0;
	        int failed = 0;

	        System.out.println("Enter marks of 10 students:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Student " + (i + 1) + ": ");
	            marks[i] = sc.nextInt();

	            if (marks[i] >= 35) {
	                passed++;
	            } else {
	                failed++;
	            }
	        }

	        System.out.println("Passed Students: " + passed);
	        System.out.println("Failed Students: " + failed);

	        sc.close();
	    }
	}
