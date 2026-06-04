/*
Easy 1 – Student Marks Display

Create a program that:

Stores 5 student marks in a 1D array
Prints all marks using a loop
Sample Output
Student Marks:
78
65
90
82
55
  */
public class StudentMarksDisplay {

    public static void main(String[] args) {

        int[] marks = {78, 65, 90, 82, 55};

        System.out.println("Student Marks:");

        for (int i = 0; i < 5; i++) {

            System.out.println(marks[i]);
        }
    }
}
