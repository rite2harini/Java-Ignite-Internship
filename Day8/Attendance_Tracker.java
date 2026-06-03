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
import java.util.Scanner;
public class Attendance_Tracker 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int attendance[] = new int[10];
        int present=0;
        int absent=0;
        double present_percentage;
        System.out.println("Enter attendance for 10 students (1 for Present and 0 forAbsent)" );
        for(int i=0;i<10;i++)
        {System.out.print("Student "+(i+1)+" : ");
            attendance[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(attendance[i]==1)
            {
                present++;
            }
            else if(attendance[i]==0)
            {
                absent++;
            }

        }
        present_percentage = (present/10.0)*100;
        System.out.println("Total Present Students : "+present);
        System.out.println("Total Absent Students : "+absent);
        System.out.println("Attendance Percentage : "+present_percentage+"%");


    }

    
}

