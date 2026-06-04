/*
1. Attendance Tracker (Medium)

A class has attendance records for 10 students.

Store attendance as:

1 = Present
0 = Absent

Calculate:

Total Present Students
Total Absent Students
Attendance Percentage
*/
import java.util.Scanner;

public class AttendanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] attendance = new int[10];
        
        // Input attendance for 10 students
        System.out.println("Enter attendance (1=Present, 0=Absent) for 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            attendance[i] = sc.nextInt();
        }
        
        // Calculate totals
        int present = 0, absent = 0;
        for (int status : attendance) {
            if (status == 1) present++;
            else if (status == 0) absent++;
        }
        
        // Display results
        System.out.println("\n=== Attendance Report ===");
        System.out.println("Total Present: " + present);
        System.out.println("Total Absent: " + absent);
        System.out.printf("Attendance Percentage: %.2f%%\n", (present * 100.0 / 10));
        
        sc.close();
    }
}
