/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polimorphism;

/**
 *
 * @author Feri Winarta
 */
class Bank {
    String name;
    float getBunga() {
        return 0f;
    }
    
}

class Bca extends Bank{
    String name = "BCA";
    float getBunga() {
        return 7f;
    }
    
    
}

class Bni extends Bank {
    String name = "BNI";
    float getBunga() {
        return 8f;
    }
}



public class UpCasting {
    public static void main(String[] args) {
        Bank b = new Bank();
        
        
      
        
    }
    
 
    
    
    
}
