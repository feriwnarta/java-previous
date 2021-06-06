/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramerWorkk;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Feri Winarta
 */
public class TresetComparator {
    public static void main(String[] args) {
        // jika item yang masuk treset tidak bisa mengimplement comparable
        // kita bisa membuat kelas barukomparator yang mengimplement comparator
        // dan kelas komparator dimasukan ke konsttukor treeset
        Set<Customer> cust = new TreeSet<Customer>(new CustomerComparator());
        Customer cs1 = new Customer();
        Customer cs2 = new Customer();
        Customer cs3 = new Customer();
        Customer cs4 = new Customer();
         // set id
        cs1.setId(4000);
        cs2.setId(20);
        cs3.setId(300);
        cs4.setId(100);
        
        cust.add(cs1);
        cust.add(cs2);
        cust.add(cs3);
        cust.add(cs4);
        
        Iterator<Customer> i = cust.iterator();
        while(i.hasNext()) {
            Customer c = i.next();
            System.out.println("Keranjang no : " + c.hashCode() + 
                    " dengan id " + c.getId());
        }
        
        
        
    }
}
