 main
public class Order {
	private int orderId;
    private String customerName;
    private String productName;
    private int quantity;
    private double pricePerItem;

    Order(int orderId, String customerName, String productName,
          int quantity, double pricePerItem) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    double calculateTotal() {
        return quantity * pricePerItem;
    }

    double applyDiscount() {
        double total = calculateTotal();

        if (total > 10000) {
            total = total - (total * 0.20);
        } else if (total > 5000) {
            total = total - (total * 0.10);
        }

        return total;
    }

    void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Item: " + pricePerItem);
        System.out.println("Total Amount: " + calculateTotal());
        System.out.println("Final Amount After Discount: " + applyDiscount());
    }
    public static void main(String[] args) {

        Order o1 = new Order(101, "Anju", "Laptop", 2, 6000);

        o1.display();
    }
}
/*
ADVANCED 1 – E-Commerce Order System

Create a class Order:

Attributes:
orderId
customerName
productName
quantity
pricePerItem (PRIVATE)
Requirements:
Initialize using constructor
Use encapsulation properly
Methods:
calculateTotal()
applyDiscount()
Rules:
If total > 5000 → 10% discount
If total > 10000 → 20% discount
Twist:

Final amount must be returned, not printed directly inside constructor.
*/
main
