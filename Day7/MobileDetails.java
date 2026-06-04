/*
EASY
Mobile Details System

Create a class Mobile:

Attributes:
brand
price
storage
Tasks:
Use constructor to initialize values
Create 2 mobile objects
Display details using method
Twist:

Price must be private and only shown via method.
  */
package java_internship_day7;
class Mobile_atr{
	String name;
	 private double price;
	int storage;
	
	Mobile_atr(String n,double p, int s){
		name = n;
		price = p;
		storage = s;
	}
	public double getPrice() {
		return price;
	}
	void display() {
		 System.out.println("Name : " + name);
	  System.out.println("Price : " + getPrice());
	  System.out.println("Storage : " + storage + " GB");
	}
}
public class Mobile {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile_atr m1 = new Mobile_atr("Samsung",25000,128);
		Mobile_atr m2 = new Mobile_atr("Apple",80000,256);

		m1.display();
		m2.display();
 }
}

