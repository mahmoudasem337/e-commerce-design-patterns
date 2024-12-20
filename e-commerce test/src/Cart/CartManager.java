/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cart;

import Product.Product;
import java.util.ArrayList;
import java.util.List;

public class CartManager {
    private static CartManager instance;
    private List<Product> cart;

    public CartManager() {
        cart = new ArrayList<>();
    }

    public static CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    public void addItem(Product item) {
        boolean exists = false;
        for (Product product : cart) {
            if (product.getName().equals(item.getName())) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            cart.add(item);
        } else {
            System.out.println("Product already in cart: " + item.getName());
        }
    }

    public List<Product> getCart() {
        return cart;
    }

    public void printCartItems() {
        System.out.println("Cart Items:");
        for (Product item : cart) {
            System.out.println(item.getName());
        }
    }

    public void deleteItem(String productName) {
        Product toRemove = null;
        for (Product product : cart) {
            if (product.getName().equals(productName)) {
                toRemove = product;
                break;
            }
        }
        if (toRemove != null) {
            cart.remove(toRemove);
            System.out.println("Product removed from cart: " + productName);
        } else {
            System.out.println("Product not found in cart: " + productName);
        }
    }
}
