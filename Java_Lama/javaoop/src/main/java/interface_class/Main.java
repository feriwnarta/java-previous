/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_class;

/**
 *
 * @author Feri Winarta
 */
abstract class Shape {
    protected int luas,tinggi,alas;
    
}

class Rectangle extends Shape implements Rumus{
    
    Rectangle(int l, int t, int a) {
        this.luas = l;
        this.tinggi = t;
        this.alas = a;
    }
    
    @Override
    public int getLuas() {
        return super.luas * super.tinggi;
    }
    @Override
    public int getAlas() {
        return super.luas * super.tinggi;
    }
    @Override
    public int getTinggi() {
        return super.luas * super.tinggi;
    }
}


public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(12,5,7);
        r.getAlas();
        r.getTinggi();
        r.getLuas();
    }
}
