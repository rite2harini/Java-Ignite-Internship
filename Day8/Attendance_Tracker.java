public class AttendanceTracker {

	    public static void main(String[] args) {

	        String studentName = "Sumi";
	        int totalClasses = 120;
	        int attendedClasses = 95;

	        double attendance =
	                (attendedClasses * 100.0) / totalClasses;

	        System.out.println("Student : " + studentName);
	        System.out.println("Attendance : " + attendance + "%");

	        if(attendance >= 75)
	            System.out.println("Eligible for Exam");
	        else
	            System.out.println("Not Eligible for Exam");
	    }
	}


