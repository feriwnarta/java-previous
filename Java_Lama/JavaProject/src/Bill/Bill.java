/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;
import java.util.ArrayList;

/**
 *
 * @author Feri Winarta
 */
public class Bill {
    private ArrayList<String> orderedFood;
    private ArrayList<Integer> orderedQuantity;
    private double totalCost;
    
    public Bill() {
        orderedFood = new ArrayList<>();
        orderedQuantity = new ArrayList<>();
        
    }
    
    public double getTotal() {
        return totalCost;
    }
    
    public void addOrder(String meal, int quantity,String[]dish
                        ,double[]cost) {
        this.orderedFood.add(meal);
        this.orderedQuantity.add(quantity);
        
        for(int i = 0; i < dish.length; i++) {
            if(meal.equals(dish[i])) {
                totalCost += quantity * cost[i];
            }
        }
    }
    
    public void getOrder() {
        for(int i = 0; i < orderedFood.size(); i++) {
            System.out.println(orderedFood.get(i) + " " + orderedQuantity.get(i));
        }
    }
    
    
    
  
}
