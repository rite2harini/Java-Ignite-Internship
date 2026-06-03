
1)Can an array store values of different data types?
NO
Why or why not?
Beccause the array type is always a simgle type. array cant read the other data variables except the initialised variable
Give an example.
int []ar = new int 5;
here we can give data as {10,20,30,40,50}
as if we give {10.5,20.5,30,40,50.25} it will delete the decimal part
and will store {10,20,30,40,50}


2)A student writes:

int arr[] = new int[5];

System.out.println(arr[5]);

Will the program compile?
yes
Will it execute successfully?
no
Explain.

it wont execute as the arr can store only 5 elements,but the sop is asking for 6th element which is not possible

3)A company stores monthly sales for 12 months.

Would you use:

1D Array
OR
2D Array
ans-2d array
Explain your choice.
as it will be easy to acesss the elememts for doing different opperation

4)Imagine you are developing a cinema ticket booking system.

Which information can be represented using a 2D array?
the seat is occupied or vaccant or any specail seat.
Explain how rows and columns would represent the seating arrangement.

the rows and coulmn will have some value which will point to a seat and in that the value will be presentlike the seat is vaccant or occupied or the seat is for any senoir citizen or best selling seats etc.


4)
