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
class GetNSet {
    private int dataPrivate;
    private Baru baru;
    
    public void setData(int data) {
        this.dataPrivate = data;
    }
    
    public int getData() {
        return this.dataPrivate;
    }
    
    public void display() {
        System.out.println(this.dataPrivate);
    }
    
    public void setBaru(Baru baru) {
        this.baru = baru;
    }
    
    public void displayGetFloat() {
        float data = this.baru.getAccesFloat();
        System.out.println("GET DARI DATA FLOAT KELAS BARU " + data);
    }
    
    public void setIntBaru(int data) {
        this.baru.setIntData(data);
    }
    
    public void displayGetInt() {
        System.out.println("HASIL DARI INT DATA KELAS BARU " + this.baru.getAccesInt());
    }
    
}

class Baru {
    private int data;
    private float dataFloat;
    
    public Baru() {
        this.data = 1;
        this.dataFloat = 2.07f;
    }
    
    public float getAccesFloat() {
        return this.dataFloat;
    }
    
    public void setIntData(int data) {
        this.data = data;
    }
    
    public int getAccesInt() {
        return this.data;
    }
    
}


public class NewClass {
    public static void main(String[] args) {
        GetNSet obj1 = new GetNSet();
        Baru obj2 = new Baru();
        
        obj1.setBaru(obj2);
        obj1.displayGetFloat();
        obj1.setData(12);
        
        obj1.setIntBaru(123);
        obj1.displayGetInt();
        System.out.println(obj2.getAccesInt());
    }
}
