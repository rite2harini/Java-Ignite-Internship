
1)Can an array store values of different data types?

Why or why not?

Give an example.

No, an array cannot store values of different data types. An array is designed to store elements of the same data type only. This ensures efficient memory allocation and easy access to elements.
int arr[] = {10, 20, 30, 40};
Here, all elements are integers.

The following is invalid
int arr[] = {10, "Hello", 30};
because "Hello" is a String, not an integer.


2)A student writes:

int arr[] = new int[5];

System.out.println(arr[5]);

Will the program compile?
Yes, the program will compile successfully because the syntax is correct.

Will it execute successfully?
No, it will not execute successfully.

Explain.
An array of size 5 has indices from 0 to 4.
arr[0]
arr[1]
arr[2]
arr[3]
arr[4]
Trying to access arr[5] is outside the array's valid range, causing an ArrayIndexOutOfBoundsException at runtime.




3)A company stores monthly sales for 12 months.

Would you use:

1D Array
OR
2D Array

Explain your choice.
I would use a 1D Array because there is only one set of data (sales values) for 12 months.
double sales[] = {12000, 15000, 18000, 17000,
                  20000, 22000, 21000, 25000,
                  24000, 26000, 28000, 30000};
   Each element represents the sales of one month.

A 2D array is not required because there is only one dimension (months).               



4)Imagine you are developing a cinema ticket booking system.

Which information can be represented using a 2D array?
In a cinema ticket booking system, a 2D array can be used to represent the seating arrangement of the theater. Each element of the array represents one seat.

Rows represent different seat rows (A, B, C, D, etc.), and columns represent seat numbers within each row.
Explain how rows and columns would represent the seating arrangement.
int seats[][] = new int[5][10];
0 = Seat available
1 = Seat booked

For example:

seats[0][0] represents seat A1.
seats[1][4] represents seat B5.
seats[4][9] represents seat E10.

A 2D array is suitable because cinema seats are arranged in rows and columns, making it easy to track available and booked seats.


4)
