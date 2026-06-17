class Mobile {
    String brand;
    String storage;
    private double price;

    Mobile(String brand, double price, String storage) {
        this.brand = brand;
        this.price = price;
        this.storage = storage;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Storage: " + storage);
        System.out.println();
    }
}


public class MobileDetails {
	public static void main(String[] args) {

        Mobile m1 = new Mobile("Samsung", 25000, "128GB");
        Mobile m2 = new Mobile("OnePlus", 30000, "256GB");

        m1.display();
        m2.display();
    }
}


