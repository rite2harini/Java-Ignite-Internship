/*
Consecutive Increase Checker 

Store 5 numbers in an array.

Determine whether the numbers are in strictly increasing order.

Example
10 20 30 40 50

Output:

Array is in increasing order

Example:

10 20 15 40 50

Output:

Array is NOT in increasing order
  */
import java.util.Scanner;
public class increase_checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter 5 numbers:");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		for(int i =0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				System.out.println("Array is not in increasing order!");
				return;
			}
		}
		System.out.println("Array is in increasing order!");
		sc.close();
	}

}
