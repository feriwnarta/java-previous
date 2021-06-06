/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.pkg07;

/**
 *
 * @author Feri Winarta
 */
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";


        printAddress("str_1",str_1);
        printAddress("str_2",str_2);
        printAddress("str_3",str_3);

        str_3 = str_3.substring(0,2);
        printAddress("str_3",str_3);

        String str_4 = "callo";
        printAddress("str_4",str_4);

        
        
        
        
        
    }
    
     private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
