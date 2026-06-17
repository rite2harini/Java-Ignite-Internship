1)Explain the difference between a Class and an Object in Java with a real-life example.
Also explain why we cannot directly execute a class without creating an object.
Ans-A class in Java is a blueprint or template used to define the properties and behaviors of objects, whereas an object is an instance of a class that occupies memory and can use those properties and behaviors. For example if Student is a class, then Sumi and Rahul are objects of that class. A class only defines what an object should contain, but the object represents a real entity. We cannot directly execute a class without creating an object because non-static variables and methods belong to the object and require memory allocation.
class Student {
    String name;
    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sumi";
        s1.display();
    }
}



2)What are access modifiers in Java?
Explain the difference between public and private with examples.
Why is it not safe to make all variables public?
Ans-Access modifiers are keywords used to control the accessibility of variables, methods, and classes in Java. The two common access modifiers are public and private. A public member can be accessed from anywhere in the program, while a private member can only be accessed within the same class. For example, a student's name can be public, but marks can be private to prevent unauthorized changes. It is not safe to make all variables public because anyone can directly modify them, leading to incorrect or invalid data.
class Student {
    public String name = "Sumi";
    private int marks = 90;

    public void showMarks() {
        System.out.println("Marks: " + marks);
    }
}



3)Explain how encapsulation is achieved using private variables and public methods.
Give a real-life example (bank, mobile, ATM, etc.).
Ans-Encapsulation is the process of hiding data and providing controlled access through methods. It is achieved by declaring variables as private and using public getter and setter methods to access them. This protects the data from unauthorized modification and improves security. A real-life example is a bank account, where the account balance is hidden and can only be accessed through specific operations like deposit and withdrawal.
class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}



4)What is a constructor in Java?
Explain how the this keyword is used inside a constructor.
Why do we use constructors to initialize object values?
Ans-A constructor is a special method that is automatically called when an object is created. Its main purpose is to initialize object values. The this keyword refers to the current object and is used to distinguish instance variables from constructor parameters when they have the same name. Constructors make object initialization easier and ensure that every object starts with proper values.
