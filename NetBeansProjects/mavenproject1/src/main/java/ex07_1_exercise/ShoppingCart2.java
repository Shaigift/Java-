/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07_1_exercise;

/**
 *
 * @author mphoshai
 */
public class ShoppingCart2 {
    public static void main (String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;   
        StringBuilder sb;
        
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        
        
        sb = new StringBuilder(firstName);
	//Instantiate and initialize sb to firstName.
        sb.append(" Smith ");
        System.out.println(sb);
	// Put the full name back together, using StringBuilder append method.
	//   You can just enter the String literal for the last name.
	//   Print the full name.
    }
}
    
