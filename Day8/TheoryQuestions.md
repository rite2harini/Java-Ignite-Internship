
1)Can an array store values of different data types?
Why or why not?
Give an example.

ANS:- An array is a collection of multiple variables of a single datatype, meaning an array of a particular datattype can store multiple values of that particular datatype, it cannot store values of multiple datatypes.
For example, int arr[] = {23,45,89,76,90};
In the above declared array, since it is declared as integer type array it can store integer values only storing any other type of values will cause error.


2)A student writes:
int arr[] = new int[5];
System.out.println(arr[5]);
Will the program compile?
Will it execute successfully?
Explain.

ANS:- No the program won't be compiled neither execute succefully because, while the array is declared properly, the array indices start from 0, meaning an array of 5 has indices, 0,1,2,3 and 4, but here the code is written to print arr[5], which isn't a valid index and falls outside the actuall indices length of the given array hence it will show an error and not be able to execute properly.


3)A company stores monthly sales for 12 months.
Would you use:
1D Array
OR
2D Array
Explain your choice.

ANS:- This depends on whether it is the total sales per month we are storing or rather we are storing sales of each month for the products that company has,
- 1D Array is preferrable in the case of when we are storing the direct total sales of the company store per month for 12 months as that is the only parameter of one company's total sales in a month where the month keeps changing so a 1D array would be more suitable here..
- But, if we become more professional in our approach, a company could have branches, or either the company has different types of products sales in a month, so here the required changes from, total sales per month, to per item/ product per monthly sale OR per branch per monthly sale, here both the parameters could be changed and to store such values we would need 2D arrays.


4)Imagine you are developing a cinema ticket booking system.
Which information can be represented using a 2D array?
Explain how rows and columns would represent the seating arrangement.

ANS:- While developing a cinema ticket, the information which can be represented using a 2D array, is the seat no. while booking the ticket, since the seats in the movie hall are arranged row and column wise, so the row no. and columon no. could help in finding the exact seat.
Rows and columns represent the seating arrangement as, for like matrix, an array of arrays, a row how array of seats within it, now within the given or assigned row, you find that specific array of seats, now with the column no. you find the seat from the specific row which helps in seating arrangement


