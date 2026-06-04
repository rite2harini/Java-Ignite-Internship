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
public class ConsecutiveIncreaseChecker {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        boolean increasing = true;

        for (int i = 0; i < 4; i++) {

            if (numbers[i] >= numbers[i + 1]) {
                increasing = false;
                break;
            }
        }

        if (increasing) {
            System.out.println("Array is in increasing order");
        } else {
            System.out.println("Array is NOT in increasing order");
        }
    }
}
