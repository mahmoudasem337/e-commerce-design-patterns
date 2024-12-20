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
public class ClothingProduct extends Product{
    public ClothingProduct(String name, String price, String quantity){
        setCategory("Clothing");
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }
}
