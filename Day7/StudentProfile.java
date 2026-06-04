/*
(EASY)
Create a class Student:

Requirements:
name
age
marks
Tasks:
Initialize using constructor
Create 2 student objects
Display student details using method
Twist:

Marks should not be accessed directly.

Write your code below
----------------------------------------
*/
package java_internship_day7;
import java.util.Scanner;
class StudentData{
	String name;
	int age;
	double marks;
	
	StudentData(String n,int a,double m) {
		name = n;
		age = a;
		marks = m;
	}
	
	void display() {
		System.out.println("*Student Details are :**");
		System.out.println("Name :"+ name);
		System.out.println("Age :"+ age);
		System.out.println("Marks :"+ marks);
	}
}
public class Student_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double marks;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student details are :");
		name = sc.nextLine();
		age = sc.nextInt();
		marks = sc.nextDouble();
		
		StudentData s1 = new StudentData(name,age,marks);
		
		s1.display();
		sc.close();
  }
}
		

	}

