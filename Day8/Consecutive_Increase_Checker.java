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
package java_intership_day8;
import java.util.Scanner;
public class Consecuutiive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num[]=new int [5];
		int i,count = 0;
		System.out.println("Enter the numbers");
		for(i=0;i<5;i++)
			num[i] = sc.nextInt();
		for(i=0;i<4;i++)
			if(num[i] < num[i+1])
				count++;//will increase if the number ahead is greater then the previous one
		if(count == 4)
			System.out.println("The array is in increasing order");
		else
			System.out.println("The array is not in increasing order");
		sc.close();
	}

}
