public class StudentMarksDisplay {

	    public static void main(String[] args) {
	        String name = "Sumi";
	        int rollNo = 101;

	        int java = 85;
	        int daa = 78;
	        int math = 90;

	        int total = java + daa + math;
	        double percentage = total / 3.0;

	        System.out.println("----- STUDENT REPORT -----");
	        System.out.println("Name : " + name);
	        System.out.println("Roll No : " + rollNo);
	        System.out.println("Java : " + java);
	        System.out.println("DAA : " + daa);
	        System.out.println("Math : " + math);
	        System.out.println("Total : " + total);
	        System.out.println("Percentage : " + percentage + "%");
	    }
	}


