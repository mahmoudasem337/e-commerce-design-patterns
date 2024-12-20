/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notification;

/**
 *
 * @author kerol_3obfacr
 */
import connection.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UserNotification implements Observer {
    private String userName;

    public UserNotification(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        saveNotificationToDatabase(message);
    }

    private void saveNotificationToDatabase(String message) {
        String query = "INSERT INTO notifications (user_name, message) VALUES (?, ?)";
        
        try{
            Connection conn = connect.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, userName);
            stmt.setString(2, message);
            stmt.executeUpdate();
            System.out.println("Notification saved for user: " + userName);
            
            
        }catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
