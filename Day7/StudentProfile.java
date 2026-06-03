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
import java.util.Scanner;

class Student {
    String name;
    int age;
    private double marks;  // PRIVATE - cannot be accessed directly
    
    // Constructor
    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    
    // Display student details (marks shown only through this method)
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks + "%");
        System.out.println("-----------------------");
    }
    
    // Getter for marks (optional but follows encapsulation)
    public double getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== STUDENT DETAILS SYSTEM ===\n");
        
        // Creating 2 student objects with user input
        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Age: ");
        int age1 = sc.nextInt();
        System.out.print("Marks (%): ");
        double marks1 = sc.nextDouble();
        sc.nextLine(); // Consume newline
        
        Student student1 = new Student(name1, age1, marks1);
        
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Age: ");
        int age2 = sc.nextInt();
        System.out.print("Marks (%): ");
        double marks2 = sc.nextDouble();
        
        Student student2 = new Student(name2, age2, marks2);
        
        // Display details
        System.out.println("\n=== STUDENT DETAILS ===");
        student1.displayDetails();
        student2.displayDetails();
        
        sc.close();
    }
}
