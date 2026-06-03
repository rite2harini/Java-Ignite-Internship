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
package java_intership_day8;
import java.util.Scanner;
public class Attendance_tracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] att = new int [10];
		int i,pt=0,abs=0,pt_percent;
		System.out.println("Enter 1 for present and 0 for abesnt");
		for(i=0;i<10;i++)
			att[i]=sc.nextInt();
		for(i=0;i<10;i++) {
			if(att[i]  == 1) {
				pt++;
			}
			if(att[i] == 0) {
				abs++;
			}
		}
		System.out.printf("Total no of students is 10\n");
		System.out.printf("%d are present\n%d are absent\n",pt,abs);
		pt_percent = (pt*100)/10;
		System.out.println("Present percentage is "+ pt_percent);
		
		sc.close();
	}

}
