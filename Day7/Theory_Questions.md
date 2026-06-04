1)Explain the difference between a Class and an Object in Java with a real-life example.
Also explain why we cannot directly execute a class without creating an object.
ANS:
A class is a blueprint or template that defines the properties (attributes) and behaviors (methods) that objects of that type will have. It is a logical construct that describes the structure and capabilities of objects.
An object is an instance of a class. It is a concrete entity that occupies memory and has actual values for the attributes defined by the class.
Real-Life Example
 A Car:
Class = The car design blueprint created by an engineer. It specifies that every car will have a color, engine type, speed, and methods like start(), accelerate(), and stop(). But the blueprint itself cannot be driven.

Object = An actual car manufactured using that blueprint. For example, a red Toyota Camry parked in your garage. It has specific values (color = red, speed = 0) and can actually perform actions like starting and accelerating.
Reason:
A class merely defines what an object should look like, not which specific data to operate on. Instance variables (non-static fields) have no values until an object is created. Without an object, there is no data to process.



2)What are access modifiers in Java?
Explain the difference between public and private with examples.
Why is it not safe to make all variables public?
ANS:
Access modifiers are keywords in Java that set the visibility or accessibility of classes, methods, constructors, and variables. They determine which parts of the program can access a particular member.

When a member is declared private, it can be accessed only within the same class. It is hidden from all other classes.

When a member is declared public, it can be accessed from anywhere - from any class, any package, and any context.
Loss of data validation.
When variables are public, external code can assign any value, including invalid ones.


3)Explain how encapsulation is achieved using private variables and public methods.
Give a real-life example (bank, mobile, ATM, etc.).
ANS:
Encapsulation is a fundamental Object-Oriented Programming (OOP) principle that bundles data (variables) and methods that operate on that data into a single unit (class), while hiding the internal details from outside access. It is often described as "data hiding" .

Encapsulation is achieved in Java through this two-step approach:

Step 1: Declare variables as private
Variables cannot be accessed directly from outside the class

This hides the internal data representation

Step 2: Provide public methods (getters/setters)
These methods act as controlled gateways to access and modify the private data

Business logic, validation, and security checks are placed inside these methods



4)What is a constructor in Java?
Explain how the this keyword is used inside a constructor.
Why do we use constructors to initialize object values?
ANS:
A constructor is a special method that is automatically called when an object of a class is created. It has the same name as the class and does not have a return type (not even void). Its primary purpose is to initialize the newly created object's state (instance variables).

The this keyword is a reference variable that refers to the current object (the object whose constructor is being executed). It is used to differentiate between instance variables and parameters when they have the same name.

Without constructors, objects could be created in an invalid or inconsistent state.

Without constructors, we would  need multiple lines to initialize each object.
