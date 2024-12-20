/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author ASEM
 */
public class ProductFactory {
    
    public static final int Electronic_Product =1;
    public static final int Clothing_Product =2;
    public static final int HomeAppliances_Product =3;
    
    public static Product createProduct(int CategoryId, String name, String price, String quantity){
    switch (CategoryId) {
            case Electronic_Product:
                return new ElectronicProduct(name,price,quantity);
            case Clothing_Product:
                return new ClothingProduct(name,price,quantity);
            case HomeAppliances_Product:
                return new HomeAppliancesProduct(name,price,quantity);
            default:
                return null;
        }
}
}