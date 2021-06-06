/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.List;
import java.lang.Object;

/**
 *
 * @author Feri Winarta
 */
public class ListApp {

    public static void main(String[] args) {    
        List aList = new ArrayList<Integer>();
        aList.add(10);
        aList.add(5);
        aList.add(8);
        aList.add(16);
        
        for(int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }
        
        ListApp la = new ListApp();
        ListApp la2 = new ListApp();
        ListApp la3 = la;
        ListApp la4 = la2;
        int addres = la.hashCode();
        int addres2 = la2.hashCode();
        int addres3 = la3.hashCode();
        int addres4 = la4.hashCode();
        System.out.println(Integer.toHexString(addres));
        System.out.println(Integer.toHexString(addres2));
        System.out.println(Integer.toHexString(addres3));
        System.out.println(Integer.toHexString(addres4));
        
       
    }
}
