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
package java_internship_assignment;

import java.util.Scanner;

public class incresechecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,c=0;
		int[]arr=new int[5];
		for(i=0;i<5;i++)
		{	
			System.out.println("Enter 5 numbers ");
			arr[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{	

			System.out.println(arr[i]);
		}
		for(i=0;i<4;i++)
		{	
			if(arr[i]<arr[i+1])
			{	
				c++;
				
			}
		}
		if(c==4)
		{	
			System.out.println("The numbers are in increasing order");
		}
		else
		{	
			System.out.println("The numbers are not in increasing order");

		}
				


	}

}

