package JavaIgniteDay8;
import java.util.Scanner;
public class Consecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n[]=new int [5];
		int i,c = 0;
		System.out.println("Enter the numbers");
		for(i=0;i<5;i++)
			n[i] = sc.nextInt();
		for(i=0;i<4;i++)
			if(n[i] < n[i+1])
				c++;
		if(c == 4)
			System.out.println("The array is in increasing order");
		else
			System.out.println("The array is not in increasing order");
		sc.close();
	}

}
