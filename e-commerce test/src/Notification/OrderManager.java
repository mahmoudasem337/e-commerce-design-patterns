/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notification;

/**
 *
 * @author kerol_3obfacr
 */
public class OrderManager extends Subject {
    public void updateOrderStatus(String userName, String productName, String newStatus) {
        // صياغة رسالة الإشعار
        String message = String.format("Your order for %s has been %s.", productName, newStatus);
        System.out.println(message);

        // إخطار المراقبين (Observers)
        notifyObservers(message);
    }
}
