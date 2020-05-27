/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex05_3_exercise;

/**
 *
 * @author mphoshai
 */
public class itemPrices {
    public static void main(String[] args){
        
        String custName = "Mary Smith";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";
        
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
       // Iterate through and print out the items from the items array
       for (String item : items ) {
           System.out.println("Items are " + item);
       }
        
    }
}
