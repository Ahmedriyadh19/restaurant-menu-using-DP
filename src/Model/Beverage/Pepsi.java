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
public class Pepsi extends Beverage {
    /*
    set a name and price  for the objects 
    and get the total quantity, price and name and last price 
    */
    private final String name = "Pepsi";
    private final double price = 3;
    private int quantity;

    public Pepsi(Item newItem) {
        super(newItem);
    }

     @Override
    public double itemTotle() {
        return price * quantity;
    }

    @Override
    public double itemPrice() {
        return price;
    }

    @Override
    public int itemQuantity(int q) {
        return quantity = q;
    }

    @Override
    public String itemName() {
        return name;
    }


}
