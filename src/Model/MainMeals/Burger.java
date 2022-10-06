/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.MainMeals;

import Model.Item;

/**
 *
 * @author alahm
 */
public class Burger implements Item {
    /*
    set a name and price  for the objects 
    and get the total quantity, price and name and last price 
    */
    private final String name = "Burger";
    private final double price = 15;
    private int quantity;

    @Override
    public String itemName() {
        return name;
    }

    @Override
    public double itemPrice() {
        return price;
    }

    @Override
    public double itemTotle() {
        return price * quantity;
    }

    @Override
    public int itemQuantity(int q) {
        return quantity = q;
    }

}
