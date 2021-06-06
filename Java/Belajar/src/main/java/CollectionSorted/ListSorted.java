/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionSorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Feri Winarta
 */
public class ListSorted {
    public static void main(String[] args) {
        // buat objek
        List<Customer> cust = new ArrayList<>();
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();
        Customer cust3 = new Customer();
        Customer cust4 = new Customer();
        
        // isi property
        cust1.setId(10);
        cust2.setId(60);
        cust3.setId(50);
        cust4.setId(200);
        
        cust.add(cust1);
        cust.add(cust2);
        cust.add(cust3);
        cust.add(cust4);
        
        // data sebelum sorting
        System.out.println("data sebelum sorting");
        Iterator<Customer> i = cust.iterator();
        while(i.hasNext()) {
            Customer c = i.next();
            System.out.println("alamat : " + c.hashCode() + "\nid : " + c.getId());
        }
        
        // sorting dengan Comparator
        cust.sort(new CustComparator());
        
        // data sesudah sorting
        System.out.println("\ndata sesudah sorting");
        Iterator<Customer> j = cust.iterator();
        while(j.hasNext()) {
            Customer c = j.next();
            System.out.println("alamat : " + c.hashCode() + "\nid : " + c.getId());
        }
        
        
        
    }
}
