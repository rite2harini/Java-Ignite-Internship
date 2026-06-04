/*
1. Attendance Tracker (Medium)

A class has attendance records for 10 students.

Store attendance as:

1 = Present
0 = Absent

Calculate:

Total Present Students
Total Absent Students
Attendance Percentage
*/
package java_internship_assignment;

import java.util.Scanner;

public class attendancetracker {
	public static double presentpercentage(int p,int a)
	{	
		return (p*100)/(p+a);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i,present=0,absent=0;
		int[]students=new int[10];
		for(i=0;i<10;i++)
		{	
			System.out.printf("Enter the attendance of the %d student\n ",i+1);

			System.out.printf("1-present\n0-absent\n");
			students[i]=sc.nextInt();
		}
		
		for(i=0;i<10;i++)
		{	
			if(students[i]==0)
			{	
				absent++;
				
			}
			else if(students[i]==1)
			{	
				present++;
			}	
		}
		double percent=presentpercentage(present,absent);
		
		System.out.printf("Present:"+present);
		System.out.printf("Absent:"+absent);
		System.out.printf("Present Percentage:"+(percent));


	}

}

