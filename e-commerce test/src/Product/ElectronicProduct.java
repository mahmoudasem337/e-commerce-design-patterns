/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

import Product.Product;

/**
 *
 * @author ASEM
 */
public class ElectronicProduct extends Product{
    public ElectronicProduct(String name, String price, String quantity){
        setCategory("Electronics");
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }
}
