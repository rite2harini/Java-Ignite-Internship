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
package java_internship_assignment;
import java.util.Scanner;

public class Studentsmarksdisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		int[]arr=new int[5];
		for(i=0;i<5;i++)
		{	
			System.out.println("Enter the marks of 5 student ");
			arr[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{	

			System.out.println("Students marks:");
			System.out.println(arr[i]);
		}
				

	}

}

