/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginTemplate;

import e_commerce.ProductsManagement;
import connection.connect;
import java.sql.*;
/**
 *
 * @author kerol_3obfacr
 */
public class AdminLogin extends LoginTemplate {
    @Override
    protected boolean authenticate(String username, String password) {
        // Admin authentication logic
        try{
            Connection conn = connect.getConnection();
            String query = "SELECT * FROM admins WHERE name = ? AND password = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, username);
                stmt.setString(2, password);
                try (ResultSet rs = stmt.executeQuery()) {
                    return rs.next();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    protected void authorize() {
        // Admin authorization logic (if any)
    }

    @Override
    protected void redirect() {
        // Redirect to admin dashboard
        new ProductsManagement().setVisible(true);
    }
}
