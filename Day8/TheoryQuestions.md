
1)Can an array store values of different data types?

Why or why not?

Give an example.
ANS: No an array in java cannot store values of different datatypes.
In Java, arrays are homogeneous (same type) because:
Type safety - Java ensures all elements are of the same type to prevent runtime errors.
// This will cause a compilation error
int[] mixed = {10, "Hello", 20.5, true};  





2)A student writes:

int arr[] = new int[5];

System.out.println(arr[5]);

Will the program compile?

Will it execute successfully?

Explain.
ANS:
Yes the program will compile successfully.
No the program will not execute successfully
It will go out of bounds.



3)A company will use 1D or 2D array to store its employees salary of 12 months?

 We should use 2D array because 1 will store the months and the other will store the salary.
 


4)Imagine you are developing a cinema ticket booking system.

Which information can be represented using a 2D array?

Explain how rows and columns would represent the seating arrangement.
ANS:
A 2D array is an ideal data structure for representing cinema seating arrangements because:
It naturally models the grid-like physical structure of a theater
Makes booking operations simple and efficient

Allows easy visual display of the entire seating chart

Supports batch operations on rows or columns

The row index represents the seat row (A, B, C...), while the column index represents the seat number within that row. This one-to-one mapping makes the 2D array intuitive and practical for implementing a cinema ticket booking system.




