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
package JavaIgniteDay8;
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

			double count1=0,count2=0;
			double present=0,absent=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==1)
				{
					count1++;
					present++;
				}
				else
				{
					count2++;
					absent++;
				}
			}
			double percentage1 = ((count1/10)*100);
			double percentage = ((present/10)*100);

			System.out.println("Total present students: "+count1);
			System.out.println("Total absent students: "+count2);
			System.out.println("Total present students: "+present);
			System.out.println("Total absent students: "+absent);
			System.out.println("Attendance percentage: "+percentage+"%");
			sc.close()
        }
}
