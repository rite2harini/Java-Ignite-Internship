/*
Medium – Classroom Result System

Create a program that:

Stores marks of 10 students in an array
Count:
Number of students who passed (marks >= 35)
Number of students who failed (marks < 35)
Output Example
Passed Students: 7
Failed Students: 3
*/
public class ClassroomResultSystem {

    public static void main(String[] args) {

        int[] marks = {78, 45, 22, 90, 67, 30, 55, 81, 34, 40};

        int passed = 0;
        int failed = 0;

        for (int i = 0; i < 10; i++) {

            if (marks[i] >= 35) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("Passed Students: " + passed);
        System.out.println("Failed Students: " + failed);
    }
}
