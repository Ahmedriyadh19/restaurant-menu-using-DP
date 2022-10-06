/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Beverage;

import Model.AddItems;
import Model.Item;

/**
 *
 * @author alahm
 */
public class Beverage extends AddItems{
    /*
        the class is extent from abstract 
    */
     
    public Beverage(Item newItem) {
        super(newItem);
    }

    @Override
    public double itemTotle() {
        return super.itemTotle();
    }

    @Override
    public double itemPrice() {
        return super.itemPrice(); 
    }

    @Override
    public int itemQuantity(int q) {
        return super.itemQuantity(q); 
    }

    @Override
    public String itemName() {
        return super.itemName(); 
    }
    
}
