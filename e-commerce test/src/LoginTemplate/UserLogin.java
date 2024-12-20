/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginTemplate;
import connection.connect;
import e_commerce.Products;
import java.sql.*;
/**
 *
 * @author kerol_3obfacr
 */
public class UserLogin extends LoginTemplate {
    private String username;

    public UserLogin(String username) {
        this.username = username;
    }

    @Override
    protected boolean authenticate(String username, String password) {
        // User authentication logic
        try {
            Connection conn = connect.getConnection();
            String query = "SELECT * FROM users WHERE name = ? AND password = ?";
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
        // User authorization logic (if any)
    }

    @Override
    protected void redirect() {
        // Redirect to user dashboard
        new Products(username).setVisible(true);
    }
}


