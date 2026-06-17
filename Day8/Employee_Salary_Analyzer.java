public class EmployeeSalaryAnalyzer {


	    public static void main(String[] args) {

	        String empName = "krish";
	        double basicSalary = 30000;

	        double hra = basicSalary * 0.20;
	        double da = basicSalary * 0.10;
	        double grossSalary = basicSalary + hra + da;

	        System.out.println("Employee : " + empName);
	        System.out.println("Basic Salary : " + basicSalary);
	        System.out.println("HRA : " + hra);
	        System.out.println("DA : " + da);
	        System.out.println("Gross Salary : " + grossSalary);
	    }
	}


