1)Explain the difference between a Class and an Object in Java with a real-life example.
Also explain why we cannot directly execute a class without creating an object.
ANS-

Class is a blueprint or template for creating objects.
Object is an instance of a class.
A class defines properties (variables) and behaviors (methods).
An object uses those properties and behaviors.
Real-life Example:
Class = Car
Object = Honda City, Hyundai i20, Swift

Non-static variables and methods belong to objects, not the class itself.
To access them, memory must be allocated through an object.
Therefore, an object is required to use the class members.

2)What are access modifiers in Java?
Explain the difference between public and private with examples.
Why is it not safe to make all variables public?
ANS-

Access modifiers control the visibility of variables, methods, and classes.
Public:
Can be accessed from anywhere in the program.
Example:
Java
public String name;
Private:
Can be accessed only inside the same class.
Example:
Java
private int salary;
It is not safe to make all variables public because anyone can change their values directly. This can cause incorrect data and reduce security.

3)Explain how encapsulation is achieved using private variables and public methods.
Give a real-life example (bank, mobile, ATM, etc.).
ANS-

Encapsulation means wrapping data and methods into a single unit (class).
It is achieved using:
Private variables
Public getter and setter methods
Example (Bank Account):
Java
private double balance;

public void setBalance(double balance) {
    this.balance = balance;
}

public double getBalance() {
    return balance;
}
Real-life Example: ATM
ATM users cannot directly access bank account data.
They use options like withdraw, deposit, and balance check.
Internal data remains protected.
This is called encapsulation.
Advantages:
Data security
Data hiding
Better control over data

4)What is a constructor in Java?
Explain how the this keyword is used inside a constructor.
Why do we use constructors to initialize object values?
ANS-

A constructor is a special method used to initialize objects.
It has the same name as the class.
It is automatically called when an object is created.
Example:
Java
Student s = new Student();
Use of this keyword inside constructor:
Java
Student(String name) {
    this.name = name;
}
this refers to the current object.
It distinguishes instance variables from local variables.
Why do we use constructors to initialize object values?
Objects get initial values at creation time.
Reduces extra coding.
Ensures every object starts with valid data.
Makes programs easier to manage and understand
