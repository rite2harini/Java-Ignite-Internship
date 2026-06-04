/*
Medium – Classroom Result System

Create a program that:

Stores marks of 10 students in an array
Count:
Number of students who passed (marks >= 35)
Number of students who failed (marks < 35)
Output Example
Passed Students: 7
Failed Students: 3
*/
package java_intership_day8;
import java.util.Scanner;
public class Class_mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks[]=new int [10];
		int i,pass=0,fail=0;
		System.out.println("Enter the marks for the 10 students :");
		for(i=0;i<10;i++) {
			marks[i] = sc.nextInt();
		}
		for(i=0;i<10;i++) {
			if(marks[i] >= 35)
				pass++;
			else
				fail++;
		}
		System.out.printf("Passed Students : %d\nFailed Student : %d\n",pass,fail);
		sc.close();
  }
}
