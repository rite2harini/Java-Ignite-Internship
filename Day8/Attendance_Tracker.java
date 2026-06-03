import java.util.Scanner;
public class AttendanceTracker {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
      int[] attendance = new int[10];
System.out.println("Enter attendance of 10 students one by one");
      System.out.println("Enter 1 if present and 0 for absent");
      for(int i=0;i<10;i++)
        {
          attendance[i]=sc.nextInt();
        }
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
        System.out.println("Attendance Percentage: "
                + attendancePercentage + "%");
    }
}
