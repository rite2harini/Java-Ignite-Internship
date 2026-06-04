1)Explain the difference between a Class and an Object in Java with a real-life example.
Also explain why we cannot directly execute a class without creating an object.



2)What are access modifiers in Java?
Explain the difference between public and private with examples.
Why is it not safe to make all variables public?



3)Explain how encapsulation is achieved using private variables and public methods.
Give a real-life example (bank, mobile, ATM, etc.).



4)What is a constructor in Java?
Explain how the this keyword is used inside a constructor.
Why do we use constructors to initialize object values?

1. Class vs. Object
A class in Java is a logical blueprint or template that defines the properties and behaviors that objects will have, while an object is a specific, tangible instance created from that blueprint. For example, a car's engineering blueprint is the class, but the physical Toyota Camry sitting in your driveway is the object. You cannot directly execute or use a class because it only exists as a design; it does not take up memory or hold actual data values until an object is brought into existence.

2. Access Modifiers (Public vs. Private)
Access modifiers are keywords used to set the visibility and accessibility of variables, methods, and classes. A public modifier means the data can be accessed and modified from anywhere in your entire program, whereas a private modifier strictly locks down access so the data can only be seen or changed from within its own specific class. It is highly unsafe to make all variables public because it removes all control, allowing any external part of the program to accidentally or maliciously overwrite sensitive data, leading to severe bugs.

3. Encapsulation
Encapsulation is the practice of wrapping data and the methods that operate on that data into a single, secure unit. This is achieved by declaring the class variables as private and providing public getter and setter methods to safely control how that data is viewed or modified. A real-life example is a bank account. Your actual bank balance is hidden (private), and you cannot just walk into the bank and change the number yourself; you must use the teller or ATM (public methods) to securely deposit or withdraw money based on strict rules.

4. Constructors and the "this" Keyword
A constructor is a special method-like block of code that automatically runs the moment a new object is created. The this keyword acts as a direct reference to the current object being built, and it is used inside the constructor to distinguish between the class's internal variables and the parameters being passed in when they happen to share the exact same names. We use constructors to guarantee that the second an object is born into the system, it already has all its necessary initial values and is immediately ready to be used.
