/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08_1_exercise;

/**
 *
 * @author mphoshai
 */
public class Item {
    char color;
    
    public boolean setColor(char colorCode) {
        if (colorCode == ' '){
            return false;
        }
        else {
            this.color = colorCode;
            return true;
        }
    } 
}
