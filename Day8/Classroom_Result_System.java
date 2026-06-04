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
public class ClassroomResult {
    public static void main(String[] args) {
        int[] marks = {85, 22, 45, 34, 90, 77, 12, 35, 60, 28};
        int passedCount = 0;
        int failedCount = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 35) {
                passedCount++;
            } else {
                failedCount++;
            }
        }

        System.out.println("Passed Students: " + passedCount);
        System.out.println("Failed Students: " + failedCount);
    }
}
