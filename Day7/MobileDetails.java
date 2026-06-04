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
public class Mobile {
    private String brand;
    private double price;
    private int storage;

    public Mobile(String brand, double price, int storage) {
        this.brand = brand;
        this.price = price;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println(this.brand);
        System.out.println(this.price);
        System.out.println(this.storage);
    }

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Samsung", 899.99, 256);
        Mobile mobile2 = new Mobile("Apple", 999.00, 512);

        mobile1.displayDetails();
        mobile2.displayDetails();
    }
}
