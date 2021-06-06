/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramerWorkk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Feri Winarta
 */
public class Sorted {
    public static void main(String[] args) {
        // create objek
        Customer cs1 = new Customer();
        Customer cs2 = new Customer();
        Customer cs3 = new Customer();
        Customer cs4 = new Customer();
        
        // set id
        cs1.setId(5000);
        cs2.setId(100);
        cs3.setId(40);
        cs4.setId(1000);
        
        List<Customer> cust = new ArrayList<>();
        cust.add(cs1);  
        cust.add(cs2);
        cust.add(cs3);
        cust.add(cs4);
        
        Iterator<Customer> i = cust.iterator();
        System.out.println("array list sebelum sorting");
        while(i.hasNext()) {
            Customer c = i.next();
            System.out.println("keranjang " + c.hashCode() + 
                    " idnya : " + c.getId());
        }
        System.out.println("array list sesudah sorting");
        Collections.sort(cust);
        
        for(int j = 0; j < cust.size();j++) {
            System.out.println("index ke-" + j + ":" + cust.get(j) ); 
        }

        
        
    }
}
