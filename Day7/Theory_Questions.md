1)Explain the difference between a Class and an Object in Java with a real-life example.
Also explain why we cannot directly execute a class without creating an object.

ANSWER:-
-> A Class is a blueprint or template used to create objects. It defines the properties and behaviors of an object.
-> An Object is a real instance of a class. It contains actual values and can perform actions.
-> Real-Life Example: A class is like a house plan, and an object is the actual house built from that plan.
-> We cannot directly execute a class because a class only contains definitions. To use those definitions, we must create an object. The object holds the actual    data and allows us to access methods and variables.



2)What are access modifiers in Java?
Explain the difference between public and private with examples.
Why is it not safe to make all variables public?

ANSWER:-
-> Access modifiers control the visibility of variables, methods, and classes.
Public:
     -> Can be accessed from anywhere in the program.
Example:
       public String name;
Private:
        -> Can be accessed only inside the same class.
Example:
       private int salary;
-> It is not safe to make all variables public because anyone can change their values directly. This can cause incorrect data and reduce security.

3)Explain how encapsulation is achieved using private variables and public methods.
Give a real-life example (bank, mobile, ATM, etc.).

ANSWER:-
-> Encapsulation means hiding data and allowing access through methods.
-> Making variables private
-> Using public getter and setter methods
Real-Life Example: Bank Account
In a bank account, the balance is private. A customer cannot change the balance directly. The balance can only be accessed or updated through methods like deposit() and withdraw().
Example:
       private double balance;
       public void deposit(double amount) 
       {
                  balance = balance + amount;
       }
-> Encapsulation helps protect data and keeps the program secure.

4)What is a constructor in Java?
Explain how the this keyword is used inside a constructor.
Why do we use constructors to initialize object values?

ANSWER:-
-> A constructor is a special method that is called automatically when an object is created.
->It is used to initialize object values.
Example:
Student(String name, int age) {
    this.name = name;
    this.age = age;
}
Use of this Keyword:
-> The this keyword refers to the current object's variables.
Example:
this.name = name;

Why do we use constructors?
-> To initialize values when an object is created.
-> To reduce repeated code.
-> To make object creation easier and more organized.
