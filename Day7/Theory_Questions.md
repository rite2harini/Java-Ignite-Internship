1)Explain the difference between a Class and an Object in Java with a real-life example.
Also explain why we cannot directly execute a class without creating an object.

Class is a blueprint,template or prototype that defines the attributes(data) and behavior(methods) that objects of that type will have.It does not occupy memory space when defined whereas an object is a specific instance of a class.It is a real world entity created based on the class blueprint and occupies physical memory space.
ex- a car's blueprint vs an actual car

2)What are access modifiers in Java?
Explain the difference between public and private with examples.
Why is it not safe to make all variables public?

Access modifiers are keywords in Java used to set the visibility or accessibility level of classes, constructors, variables, and methods. They control which other parts of your program can access or modify specific code.
Difference between public and private with examples:-
 ⁠public⁠: The code is accessible from any other class in any package across the entire application.
 ⁠private⁠: The code is strictly accessible only within the same class where it is declared
 
Making all variables ⁠public⁠ breaks the core OOP concept of Data Hiding and security.
1 Unauthorized Modifications: Any external class can change critical data to invalid or malicious values without restrictions (e.g., setting a ⁠bankBalance⁠ directly to negative numbers or millions).
2 Tight Coupling: It exposes the internal working structure of your class. If you change a variable name or type later, every single external file referencing it will break

3)Explain how encapsulation is achieved using private variables and public methods.
Give a real-life example (bank, mobile, ATM, etc.).

Encapsulation is achieved by hiding the data (declaring class variables as ⁠private⁠) and providing controlled access to it through public methods, commonly known as Getters and Setters
Real-Life Example: An ATM Machine
Consider an ATM Machine:
 The actual cash vault and account balance data inside the ATM system are ⁠private⁠. Customers cannot just open the machine casing and manually move the cash count numbers around.
4)What is a constructor in Java?
Explain how the this keyword is used inside a constructor.
Why do we use constructors to initialize object values?

A constructor is a special block of code that is automatically invoked when an object of a class is created.It has the same name as the class and no return type.
The this keyword in Java refers to the current object instance. Inside a constructor, it is primarily used to resolve ambiguity when the constructor's parameters have the exact same names as the class's instance variables.
