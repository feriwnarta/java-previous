/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

/**
 *
 * @author Feri Winarta
 */
import java.util.ArrayList;
public class Driver {
    public static void main(String[] args) {
        String[] dish = {"Sandwich","Coffe","French Fries","Salad"};
        double[] cost = {8.7, 9.0, 5.0, 12.0, 4.0};
        Bill myBil = new Bill();
        myBil.addOrder("Sandwich", 3, dish, cost);
        myBil.addOrder("Coffe", 6, dish, cost);
        myBil.getOrder();
        System.out.println(myBil.getTotal());
        
        
    }
}
