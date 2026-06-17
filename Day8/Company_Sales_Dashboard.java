public class CompanySalesDshboard {
	

	    public static void main(String[] args) {

	        double jan = 25000;
	        double feb = 30000;
	        double mar = 35000;

	        double total = jan + feb + mar;
	        double average = total / 3;

	        System.out.println("January Sales : " + jan);
	        System.out.println("February Sales : " + feb);
	        System.out.println("March Sales : " + mar);

	        System.out.println("Total Sales : " + total);
	        System.out.println("Average Sales : " + average);

	        if(average >= 30000)
	            System.out.println("Good Performance");
	        else
	            System.out.println("Needs Improvement");
	    }
	}

