public class Attendancetracker {
	public static void main(String[] args) {

        int[] attendance = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1};

        int present = 0;
        int absent = 0;

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == 1) {
                present++;
            } else {
                absent++;
            }
        }

        double attendancePercentage =
                (double) present / attendance.length * 100;

        System.out.println("Total Present Students: " + present);
        System.out.println("Total Absent Students: " + absent);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
    }
}
