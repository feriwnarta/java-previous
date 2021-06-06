/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramerWorkk;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Feri Winarta
 */
public class SetApp {
    public static void main(String[] args) {
        Set<Customer> customers = new HashSet<Customer>();
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();
        
        c1.setId(10);
        c2.setId(20);
        c3.setId(30);
        
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);        
        
        Iterator<Customer> i = customers.iterator();
        while(i.hasNext()) {
            Customer cust = i.next();
            System.out.println(cust.getId());
        }
        
    }
}
