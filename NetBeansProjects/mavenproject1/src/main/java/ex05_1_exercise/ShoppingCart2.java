/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05_1_exercise;

/**
 *
 * @author mphoshai
 */
public class ShoppingCart2 {
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
	double total;
   
        
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        boolean outOfStock = true;
        
        // Test quantity and modify message if quantity > 1.  
         if (quantity > 1){
             message = message +"s";
         }
         
        if (outOfStock) {
            System.out.println(itemDesc+" is out of stock.");
        }
        else{
             System.out.println(message);
             System.out.println("Total cost with tax:"+ total);
             
        } 
        
    }
     
      
}
