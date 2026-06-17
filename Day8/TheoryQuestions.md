
1)Can an array store values of different data types?

Why or why not?

Give an example.




2)A student writes:

int arr[] = new int[5];

System.out.println(arr[5]);

Will the program compile?

Will it execute successfully?

Explain.



3)A company stores monthly sales for 12 months.

Would you use:

1D Array
OR
2D Array

Explain your choice.


4)Imagine you are developing a cinema ticket booking system.

Which information can be represented using a 2D array?

Explain how rows and columns would represent the seating arrangement.



1.In Java, an array cannot store values of different data types because arrays are strongly typed and allocate a continuous block of memory based on a specific size and type. Mixing data types breaks this structure. For example, trying to write an integer array that also contains a string, like int[] numbers = {10, 20, "Hello"};, will immediately result in a compilation error.

2.If a student writes code to print index 5 of an array initialized with a size of 5, the program will compile perfectly fine because the syntax itself is valid. However, it will not execute successfully; it will crash and throw an ArrayIndexOutOfBoundsException. This happens because Java arrays are zero-indexed, meaning an array of size 5 only has valid indices ranging from 0 to 4.

3.To store monthly sales for 12 months, you should use a 1D array. A 1D array is perfect for a single, flat sequence of data, which in this case is just one sales figure per month. You would only need a 2D array if you were tracking an additional dimension of data, such as the monthly sales across several different store branches.

4.In a cinema ticket booking system, a 2D array naturally represents the physical seating chart of the theater. The rows of the array directly correspond to the physical rows of seats, and the columns represent the individual seat numbers within those rows. By accessing a specific row and column index, the system can easily check or change whether that exact seat is currently available or booked.
