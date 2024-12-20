/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package OrderStates;


/**
 *
 * @author ASEM
 */
public class main {

    public static void main(String[] args) {
        
        // Create a new order context with initial status "Pending"
        OrderContext order = new OrderContext(1,"john_doe", "Laptop", "2", "1500", "Pending");

        String c = order.getStatus();
        System.out.println(c);
        // Display initial order status
        order.showStatus();

        // Process the order lifecycle
        order.nextStep(); // Pending -> Shipped
        order.showStatus();
        c = order.getStatus();
        System.out.println(c);

        order.nextStep(); // Shipped -> Delivered
        order.showStatus();
        c = order.getStatus();
        System.out.println(c);

        order.nextStep(); // Delivered (no further transitions)
    }
}
