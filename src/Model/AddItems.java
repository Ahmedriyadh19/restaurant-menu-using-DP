/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author alahm
 */
public abstract class AddItems implements Item {
    /*
        this can't use to create object because it is abstract we will use 
        beverages class ans SideDish class 
    
    */
    
    
    
    private Item newItem;

    public AddItems(Item newItem) {
        this.newItem = newItem;
    }

    @Override
    public String itemName() {
        return newItem.itemName();
    }

    @Override
    public int itemQuantity(int q) {
        return newItem.itemQuantity(q);
    }

    @Override
    public double itemPrice() {
        return newItem.itemPrice();
    }

    @Override
    public double itemTotle() {
        return newItem.itemTotle();
    }

}
