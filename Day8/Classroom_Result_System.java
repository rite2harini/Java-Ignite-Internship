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
import java.util.Scanner;
public class Classroom_Result_System 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];
        int passed = 0;
        int failed = 0;
        System.out.println("Enter marks of 10 students  (0-100) ");
        for(int i=0;i<10;i++)
        {
            System.out.print("Student "+(i+1)+" : ");
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(marks[i]>=35)
            {
                passed++;
            }
            else
            {
                failed++;
            }
            
        }
        System.out.println("Passed Students : "+passed);
        System.out.println("Failed Students : "+failed);
    }
}
