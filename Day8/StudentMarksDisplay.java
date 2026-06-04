/*
Easy 1 – Student Marks Display

Create a program that:

Stores 5 student marks in a 1D array
Prints all marks using a loop
Sample Output
Student Marks:
78
65
90
82
55
  */
import java.util.Scanner;

public class StudentMarksDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        
        // Input marks for 5 students
        System.out.println("Enter marks for 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        
        // Print all marks
        System.out.println("\nStudent Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }
        
        sc.close();
    }
}
