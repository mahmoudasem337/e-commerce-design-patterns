/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderStates;

/**
 *
 * @author ASEM
 */
public class OrderShippedState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Order is in transit to the delivery address.");
        
        // Update the order status in the database or system
        context.setStatus("Delivered");
        
        // Transition to the next state
        context.setCurrentState(new OrderDeliveredState());
    }

    @Override
    public void displayStatus() {
        System.out.println("Status: Order Shipped.");
    }
}
