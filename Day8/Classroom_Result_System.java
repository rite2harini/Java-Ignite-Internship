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
package java_internship_assignment;
import java.util.Scanner;

public class classroomresultsystem {
	public static void main(String[] args) {
								
		Scanner sc=new Scanner(System.in);
				int i,p=0,f=0;
				int[]students=new int[10];
				for(i=0;i<10;i++)
				{	
					System.out.printf("Enter the mark of the %d student ",i+1);
					students[i]=sc.nextInt();
				}
				
				for(i=0;i<10;i++)
				{	
					if(students[i]>=35)
					{	
						p++;
						
					}
					else if(students[i]<35)
					{	
						f++;
					}	
				}
				
					
					System.out.println("Pass Students:"+p);
					System.out.println("Fail Students:"+f);

				}

}
