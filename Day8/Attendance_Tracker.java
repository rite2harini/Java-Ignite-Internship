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
public class AttendanceTracker {
    public static void main(String[] args) {
        int[] attendance = {1, 0, 1, 1, 1, 0, 1, 1, 0, 1};
        int presentCount = 0;
        int absentCount = 0;
        int totalStudents = attendance.length;

        for (int i = 0; i < totalStudents; i++) {
            if (attendance[i] == 1) {
                presentCount++;
            } else if (attendance[i] == 0) {
                absentCount++;
            }
        }

        double percentage = ((double) presentCount / totalStudents) * 100;

        System.out.println("Total Present Students: " + presentCount);
        System.out.println("Total Absent Students: " + absentCount);
        System.out.println("Attendance Percentage: " + percentage + "%");
    }
}
