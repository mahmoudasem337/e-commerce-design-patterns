/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderStates;

/**
 *
 * @author ASEM
 */
/**
 * Represents the context for managing the state of an order.
 */
public class OrderContext {

    private int id;                // Order ID (Primary Key)
    private String userName;        // Username of the customer
    private String productName;     // Product name
    private String quantity;           // Quantity of the product ordered
    private String price;           // Price of the product
    private String status;          // Current status of the order (Pending, Shipped, Delivered)

    private OrderState currentState; // Current state of the order

    public OrderContext(String userName, String productName, String quantity, String price, String status) {
        this.userName = userName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.status = status;

        // Initialize state based on the status
        switch (status) {
            case "Pending":
                this.currentState = new OrderPlacedState();
                break;
            case "Shipped":
                this.currentState = new OrderShippedState();
                break;
            case "Delivered":
                this.currentState = new OrderDeliveredState();
                break;
            default:
                throw new IllegalStateException("Invalid order status: " + status);
        }
    }
    public OrderContext(int id, String userName, String productName, String quantity, String price, String status) {
        this.id = id;
        this.userName = userName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.status = status;

        // Initialize state based on the status
        switch (status) {
            case "Pending":
                this.currentState = new OrderPlacedState();
                break;
            case "Shipped":
                this.currentState = new OrderShippedState();
                break;
            case "Delivered":
                this.currentState = new OrderDeliveredState();
                break;
            default:
                throw new IllegalStateException("Invalid order status: " + status);
        }
    }

    // Update the current state
    public void setCurrentState(OrderState currentState) {
        this.currentState = currentState;
    }

    // Process the next step in the order lifecycle
    public void nextStep() {
        currentState.handleOrder(this); // Delegate the handling to the current state
    }

    // Display the current status
    public void showStatus() {
        currentState.displayStatus(); // Delegate the status display to the current state
    }

    // Getter and Setter for the order status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getters for order details (if needed for external use)
    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getProductName() {
        return productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }
}

