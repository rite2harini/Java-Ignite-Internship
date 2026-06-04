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
package java_intership_day8;
import java.util.Scanner;
public class Student_Mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks[]=new int [10];
		int i;
		System.out.println("Enter the marks for the 10 students :");
		for(i=0;i<10;i++) {
			marks[i] = sc.nextInt();
		}
		System.out.println("Detailed marks :");
		for(i=0;i<10;i++) {
			System.out.printf("%d\n",marks[i]);
		}
		sc.close();
	}
}
