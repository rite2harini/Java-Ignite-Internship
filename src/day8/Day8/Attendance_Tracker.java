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
package day8.Day8;

import java.util.Scanner;

public class Attendance_Tracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter the attendance of 10 student:\n(1)-Present\t(0)-Absent");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}

		double c1=0,c2=0;
		double pt=0,abt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				c1++;
				pt++;
			}
			else
			{
				c2++;
				abt++;
			}
		}
		double percent = ((c1/10)*100);
		double p = ((percent/10)*100);

		System.out.println("Total present students: "+c1);
		System.out.println("Total absent students: "+c2);
		System.out.println("Total present students: "+pt);
		System.out.println("Total absent students: "+abt);
		System.out.println("Attendance percentage: "+p+"%");
		sc.close();
	
	}

}

