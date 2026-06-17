package day7assginment;
class Order {
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
}
public class ECommerceOrderSystem {
	public static void main(String[] args) {

        Order o1 = new Order(101, "Sumi", "Laptop", 2, 6000);

        o1.display();
    }
}




