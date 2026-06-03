1)Explain the difference between a Class and an Object in Java with a real-life example.
Also explain why we cannot directly execute a class without creating an object.

ANS:- In Java, a class is like a whole picture, the main blueprint or template within which the changes or other things like objects are added, whereas an object in the class is the concrete instance of the class in real time.
For example: The blueprint of a car which includes attributes like brand, color, price, etc. which is a class, whereas, a car is an object which is made on the basis of those attributes and characters in the blueprint of class.
Since, class is onle a blueprint, a blueprint is useless if there is no object upon which it can be applied on, hence a class cannot be directly executed without a given object;


2)What are access modifiers in Java?
Explain the difference between public and private with examples.
Why is it not safe to make all variables public?

ANS:- In Java, access modifiers are the keywords that are used in to access and change or modify certain characters or attributes, accessibility, visibility, and other parameters are accessed through these modifiers.
'public' means things or the given object or class is accessible to everyone, rather to every class in the given compiler whereas 'private' restricts access to everyone and only particular individuals can access the details in it.
Example: As Customer services are public to everybody but the then the inner workings like details or each customer and other private matters are kept private.
It is not safe to make all variables public because some variables keep sensible information about a given item, object or individual hence their access should be restricted to only some for better handling and management.


3)Explain how encapsulation is achieved using private variables and public methods.
Give a real-life example (bank, mobile, ATM, etc.).

ANS:-Encapsulation is achieved using private variables and public methods through getters and setters, where a private variable's value is acquired using setter while it can be used to display in main class through the getter which are public methods to access their datas but if conditioned they can be restricted from ressetting the private variables.
For example: In ATM, once you set your account number, your pin number, your bank details, all of it is now privately stored inside the banking system, and no one else can access it without the required credentials and you can't change the details of yours unless you proceed through certain steps and conditions.


4)What is a constructor in Java?
Explain how the this keyword is used inside a constructor.
Why do we use constructors to initialize object values?

ANS:- Constructor in Java are special type of method which is used to initialize the values of the object inside the class when called upon. By default the Java creates its own default constructor if you haven't made one already using the class.
'this' keyword is used inside the constructor's to assign that this variable is a class instance variable that is being assigned the value of or being used as of.
Constructor is used to initialize the objects with certain predictable properties that is functional and understandable otherwise missing properties can create it could lead to unpredictable behavior of the object.
