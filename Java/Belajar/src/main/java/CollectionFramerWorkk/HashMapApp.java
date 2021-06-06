/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramerWorkk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Feri Winarta
 */
public class HashMapApp {
    public static void main(String[] args) {
        // membuat hasmap, dan array list
        Map<String, List<Customer>> map = new HashMap<>();
        // list untuk customer tangerang
        List<Customer> tngCust = new ArrayList<>();
        
        // tangerang
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();
        // surabaya
        Customer s1 = new Customer();
        Customer s2 = new Customer();
        
        // customer tangerang
        c1.setId(10);
        c2.setId(60);
        c2.setId(50);
        // customer surabaya
        s1.setId(30);
        s2.setId(40);
        
        // list simapan objek
        tngCust.add(c1);
        tngCust.add(c2);
        tngCust.add(c3);
        // map tangerang
        map.put("Tangerang", tngCust);
        
        // list untuk customer surabaya
        List<Customer> sbyCust = new ArrayList<>();
        sbyCust.add(s1);
        sbyCust.add(s2);
        
        // map surabaya
        map.put("Surabaya", sbyCust);
        //System.out.println(map);
        
//        Set<String> keys = map.keySet();
//        Iterator<String> i = keys.iterator();
//        while(i.hasNext()) {
//            String a = i.next();
//            List<Customer> list = map.get(keys);
//            for(int j = 0; j < list.size(); j++) {
//                Customer cust = list.get(j);
//                System.out.println("kota : " + keys + "customer id : " + 
//                        cust.getId());
//            }
        }
        
    }

