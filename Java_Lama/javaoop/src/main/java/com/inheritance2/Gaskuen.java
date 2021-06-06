/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance2;

/**
 *
 * @author Feri Winarta
 */




class Car {
    protected String model;
    protected float speed;
    
    public void displayModel() {
        System.out.println("Model Car " + this.model);
    }
    public void speedDoMeter() {
        System.out.println("Speed Now " + this.speed);
    }
    public void automatic() {
        System.out.println("Matic");
    }
}

class Avanza extends Car {
    
    public void setModel() {
        super.model = "Avanza"; 
    }
    public void setSpeed() {
        super.speed = 1300;
    }
    public void automatic() {
        System.out.println("Mobil " + super.model + " Memiliki sistem Manual / Kopling");
    }
}

class Brio extends Car {
    public void setModel () {
        super.model = "Brio";
    }
    public void setSpeed ()
    {
        super.speed = 1100;
    }
}
 
public class Gaskuen {
    public static void main(String[] args) {
        Avanza G = new Avanza();
        G.setModel();
        G.setSpeed();
        
        G.displayModel();
        G.speedDoMeter();
        G.automatic();
        
        Brio b = new Brio();
        b.setModel();
        b.setSpeed();

        b.displayModel();
        b.speedDoMeter();
        b.automatic();
    }
    
  
}
