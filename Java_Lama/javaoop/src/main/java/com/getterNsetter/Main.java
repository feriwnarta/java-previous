/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.getterNsetter;

/**
 *
 * @author Feri Winarta
 */
class Data {
    public int publicData;
    private int privateData;
    private double privateDouble;
//    read (mencetak)
    public int getPrivateData() {
        return this.privateData;
    }
    
    public void setPrivateData(int pass) {
        this.privateData = pass;
    }
//    overiding
    public float getPrivate() {
        return this.privateData;
    }
    
    public void setPrivateData(float pass) {
        this.privateDouble = pass;
    }
    
    void display() {
        System.out.println(this.privateData);
    }
}
public class Main {
    public static void main(String[] args) {
        
//        dengan acces public kita bisa akses
        Data obj1 = new Data();
//        write
        obj1.publicData = 10;
//        read
        System.out.println(obj1.publicData);
//        tidak bisa
//        obj1.privateData = 10;
        System.out.println(obj1.getPrivateData());
        int data = obj1.getPrivateData();
        System.out.println(data);
        
//        setter private data / write private data / inisialisai private data
        obj1.setPrivateData(100); // overiding bentuk int
        obj1.setPrivateData(12.5f); // overiding bentuk float
        System.out.println(obj1.getPrivateData());
     
        
    }     
    
}
