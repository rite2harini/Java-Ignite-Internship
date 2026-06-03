
1)Can an array store values of different data types?

Why or why not?

Give an example.

ANSWER:-
-> No, an array cannot store different data types.
-> An array stores only one type of data. All values inside the array must be of the same type.
Example:
      int arr[] = {10, 20, 30};
-> This array stores only integer values.




2)A student writes:

int arr[] = new int[5];

System.out.println(arr[5]);

Will the program compile?

Will it execute successfully?

Explain.

ANSWER:-
int arr[] = new int[5];
System.out.println(arr[5]);
Will the program compile?
-> Yes, the program will compile.
Will it execute successfully?
-> No, it will give an error while running.
Explanation:
-> The array size is 5, so valid indexes are 0, 1, 2, 3, and 4.
-> arr[5] does not exist, so Java gives an ArrayIndexOutOfBoundsException.



3)A company stores monthly sales for 12 months.

Would you use:

1D Array
OR
2D Array

Explain your choice.
ANSWER:-
-> I would use a 1D Array.
Reason:
-> There is only one sales value for each month. Since there are 12 months, a single array is enough.
Example:
     int sales[] = new int[12];


4)Imagine you are developing a cinema ticket booking system.

Which information can be represented using a 2D array?

Explain how rows and columns would represent the seating arrangement.

ANSWER:-
-> A 2D Array can be used to store seat information in a cinema hall.
Explanation:
-> Rows represent seat rows (A, B, C, etc.)
-> Columns represent seat numbers (1, 2, 3, etc.)
For example:

1 2 3
A X O O
B O X O
Here:
O = Available seat
X = Booked seat
-> A 2D array is useful because seats are arranged in rows and columns.

