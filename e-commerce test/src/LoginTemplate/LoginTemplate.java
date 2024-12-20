/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginTemplate;

import javax.swing.JOptionPane;

/**
 *
 * @author kerol_3obfacr
 */
public abstract class LoginTemplate {
    public final boolean login(String username, String password) {
        if (authenticate(username, password)) {
            authorize();
            redirect();
            return true;
        } else {
            showError();
            return false;
        }
    }

    protected abstract boolean authenticate(String username, String password);
    protected abstract void authorize();
    protected abstract void redirect();
    protected void showError() {
        JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
    }
}

