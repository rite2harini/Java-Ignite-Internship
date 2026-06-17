public class ConsecutiveIncreaseChecker {
	

	    public static void main(String[] args) {

	        int[] arr = {10, 20, 30, 40, 50};

	        boolean increasing = true;

	        for(int i = 0; i < arr.length - 1; i++) {

	            if(arr[i] >= arr[i + 1]) {
	                increasing = false;
	                break;
	            }
	        }

	        if(increasing)
	            System.out.println("Array is in increasing order");
	        else
	            System.out.println("Array is not in increasing order");
	    }
	}


