
package JavaIgniteDay8;
import java.util.Scanner;
public class Student_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mark[]=new int [10];
		int i;
		System.out.println("Enter the marks of the 10 students :");
		for(i=0;i<10;i++) {
			mark[i] = sc.nextInt();
		}
		System.out.println("Detailed marks :");
		for(i=0;i<10;i++) {
			System.out.printf("%d\n",mark[i]);
		}
		sc.close();
	}

}
