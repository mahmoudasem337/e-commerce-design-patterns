/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderStates;

/**
 *
 * @author ASEM
 */
public class OrderDeliveredState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Order has already been delivered. No further actions needed.");
    }

    @Override
    public void displayStatus() {
        System.out.println("Status: Order Delivered.");
    }
}

