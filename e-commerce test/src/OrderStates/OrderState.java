/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package OrderStates;

/**
 *
 * @author ASEM
 */
public interface OrderState{
    public void displayStatus();
    public void handleOrder(OrderContext context);
}
