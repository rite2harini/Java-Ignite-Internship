package JavaIgniteDay8;
import java.util.Scanner;
public class Class_mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks[]=new int [10];
		int i,pass=0,fail=0;
		System.out.println("Enter the marks for the 10 students :");
		for(i=0;i<10;i++) {
			marks[i] = sc.nextInt();
		}
		for(i=0;i<10;i++) {
			if(marks[i] >= 35)
				pass++;
			else
				fail++;
		}
		System.out.printf("Number of students passed Students : %d\nNumber of studens failed Student : %d\n",pass,fail);
		sc.close();
	}

}
