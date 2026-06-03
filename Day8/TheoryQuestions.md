1) Can an array store values of different data types? Why or why not? Give an example.
No. In Java, an array can store only values of the same data type because the array's type is fixed when it is created.
Example:
Java
int[] arr = {10, 20, 30, 40};
This array can store only integers.
The following is invalid:
Java
int[] arr = {10, "Hello", 20};
because "Hello" is a String, not an int.
2) A student writes:
Java
int arr[] = new int[5];

System.out.println(arr[5]);
Will the program compile?
Yes, the program will compile successfully.
Will it execute successfully?
No, it will throw a runtime exception.
Explanation:
An array of size 5 has valid indices:
0, 1, 2, 3, 4
But arr[5] tries to access the 6th element, which does not exist.
Exception:
ArrayIndexOutOfBoundsException
So the program compiles but crashes at runtime
3) A company stores monthly sales for 12 months. Would you use 1D Array or 2D Array? Explain your choice.
Answer:
I would use a 1D Array.
Because there is only one value (sales) for each of the 12 months.
Example:
Java
int[] sales = new int[12];
Here:
sales[0] → January sales
sales[1] → February sales
...
sales[11] → December sales
A 2D array is not needed because there is only one set of monthly sales data.
4) Imagine you are developing a cinema ticket booking system. Which information can be represented using a 2D array? Explain how rows and columns would represent the seating arrangement.
Answer:
A 2D array can be used to represent the cinema seating arrangement.
Example:
Java
int[][] seats = new int[5][10];
Here:
Rows represent seat rows (A, B, C, D, E)
Columns represent seat numbers (1–10)
Example:
Row A : A1 A2 A3 A4 A5
Row B : B1 B2 B3 B4 B5
Row C : C1 C2 C3 C4 C5
The values can indicate seat status:
0 = Available
1 = Booked
So a 2D array is suitable because cinema seats are arranged in rows and columns.

Plain text
ArrayIndexOutOfBoundsException
So the program compiles but crashes at runtime.
