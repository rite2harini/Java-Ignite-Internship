
1)Can an array store values of different data types?

Why or why not?

Give an example.
ANS->No, an array cannot store different data types directly in Java.
     Why?
      An array in Java is homogeneous, which means all elements inside the array must be of the same data type.
      int arr[] = {10, 20, 30}




2)A student writes:

int arr[] = new int[5];

System.out.println(arr[5]);

Will the program compile?

Will it execute successfully?

Explain.
ANS --> Yes, the program will compile successfully.
        No, it will not execute successfully.
        5 IS outside the array boundary



3)A company stores monthly sales for 12 months.

Would you use:

1D Array
OR
2D Array

Explain your choice.
ANS--> I would use a 1D Array.

Because sales data for 12 months is a single list of values.



4)Imagine you are developing a cinema ticket booking system.

Which information can be represented using a 2D array?

Explain how rows and columns would represent the seating arrangement.
ANS --int seats[][] = new int[5][10]
This means:

5 rows
10 seats in each row
Representation
Rows → Different seat rows in the hall
Columns → Seat numbers in each row




4)
