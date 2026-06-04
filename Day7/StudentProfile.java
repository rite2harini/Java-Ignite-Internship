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
public class Student {
    private String name;
    private int age;
    private double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Marks: " + this.marks);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, 88.5);
        Student student2 = new Student("Bob", 21, 92.0);

        student1.displayDetails();
        student2.displayDetails();
    }
}
