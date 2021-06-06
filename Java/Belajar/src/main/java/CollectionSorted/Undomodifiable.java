/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionSorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Feri Winarta
 */
public class Undomodifiable {
    public static void main(String[] args) {
        List<String> myEmail = new ArrayList<>();
        myEmail.add("itsdownloadakun@gmail.com");
        myEmail.add("stealjoqo01@gmail.com");
        Customer cust1 = new Customer();

        
        // hal ini akan berbahaya karena list colection
        // mengembalikan colection sendiri, karena colection
        // adalah sebuah objek, tentu si method akan dapat meruba
        // colection tersebut
        
//        cust1.setEmail(myEmail);
//        List<String> value = cust1.getEmail();
//        value.add("Begunggang.com");
//        System.out.println(value);


        // method unmodifiable unuk akses collection atau
        // enkapsulasinya collection
        
        cust1.setEmail(myEmail);
        List<String> value = cust1.getEmail();
        System.out.println(value);
        
        
//        Map<String, String> map = new HashMap<>();
//        map.put("feri", "feri.com");
//        map.put("bgengong","begengon.com");
//        map.put("pju","pju.com");
//        
//        System.out.println(map);
        
        
        
        
        
        
    }
}
