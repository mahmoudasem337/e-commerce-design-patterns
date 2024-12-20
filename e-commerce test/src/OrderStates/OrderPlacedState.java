/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderStates;

/**
 *
 * @author ASEM
 */
public class OrderPlacedState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Order is being processed and will be shipped soon.");
        
        // Update the order status in the database or system
        context.setStatus("Shipped");
        
        // Transition to the next state
        context.setCurrentState(new OrderShippedState());
    }

    @Override
    public void displayStatus() {
        System.out.println("Status: Order Received.");
        
    }
}
