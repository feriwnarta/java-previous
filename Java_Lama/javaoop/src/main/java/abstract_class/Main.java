/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_class;

abstract class Shape {
    protected String color;
    protected int luas,volume;
    
    abstract double getArea();
    abstract String display();
    
    void displayName() {
        System.out.println("Halo ini adalah " + Shape.class);
    }
    
    void sayHi() {
        System.out.println("Hallo semua");
    }
    
}

class Triangle extends Shape {
    
    Triangle (int luas, int volume) {
        super.luas = luas;
        super.volume = volume;
    }
    
    @Override                        
    double getArea() {
        return super.luas * super.volume;
    }
    
    @Override
    String display() {
        return "Hallo";
    }
}

class Circle extends Shape {
     
    @Override
     double getArea() {
        return super.luas * super.volume;
    }
    
    @Override
    String display() {
        return "Hallo";
    }
     
}

public class Main {
    public static void main(String[] args) {
        Triangle obj = new Triangle(15,12);
        System.out.println(obj.getArea());
        
        Circle obj2 = new Circle();
        obj2.sayHi();
        
       
    }
}
