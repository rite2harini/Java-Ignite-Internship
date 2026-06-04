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
public class Order {
    private String orderId;
    private String customerName;
    private String productName;
    private int quantity;
    private double pricePerItem;

    public Order(String orderId, String customerName, String productName, int quantity, double pricePerItem) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double calculateTotal() {
        return this.quantity * this.pricePerItem;
    }

    public double applyDiscount() {
        double total = calculateTotal();
        double discountRate = 0.0;

        if (total > 10000) {
            discountRate = 0.20; // 20% discount
        } else if (total > 5000) {
            discountRate = 0.10; // 10% discount
        }

       
        return total * (1 - discountRate);
    }

    // Getters and Setters 
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}

