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

public class ConsecutiveIncreaseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // Check if strictly increasing
        boolean isIncreasing = true;
        for (int i = 0; i < 4; i++) {
            if (numbers[i] >= numbers[i + 1]) {
                isIncreasing = false;
                break;
            }
        }
        
        // Display result
        if (isIncreasing) {
            System.out.println("Array is in increasing order");
        } else {
            System.out.println("Array is NOT in increasing order");
        }
        
        sc.close();
    }
}
