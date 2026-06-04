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

        int[] attendance = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1};

        int present = 0;
        int absent = 0;

        for (int i = 0; i < 10; i++) {

            if (attendance[i] == 1) {
                present++;
            } else {
                absent++;
            }
        }

        double percentage = (present * 100.0) / 10;

        System.out.println("Total Present Students: " + present);
        System.out.println("Total Absent Students: " + absent);
        System.out.println("Attendance Percentage: " + percentage + "%");
    }
}
