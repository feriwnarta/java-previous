/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptioon;

/*
 *
 * @author Feri Winarta
 */
import java.io.IOException;
import java.io.FileNotFoundException;

public class CekLokasi {
    public static void main(String[] args) {
        
        String s = null;
        System.out.println(s);
        
        String a = cek(s);
        System.out.println(a);
        
        int[]data = {1,2,3};
        for(int i = 0; i < 5; i++)
        {
            System.out.println(data[i]);
        }
    }
    
    static String cek(String s) {
        return s;
    }
    
    
}
