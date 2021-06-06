/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author Feri Winarta
 */
public class Test {
    private int id;
    
    public Test(int id) {
        this.id = id;
    }
    
    public Test(int id, String name) {
        this(id);
    }
    static void address(Object o) {
        int addres = o.hashCode();
        System.out.println(Integer.toHexString(addres));
    }
    public static void showId(Test ts) {
        System.out.println(ts.id);
    }
    
    public static void main(String[] args) {
        Test t1 = new Test(10);
        Test t2 = new Test(30);
        Test t3 = t1;
           
        address(t1);
        address(t2);
        address(t3);
        
        showId(t1);
        showId(t2);
        showId(t3);
        
        System.out.println("");
        t3.id = 50;
        showId(t1);
        showId(t2);
        showId(t3);
        
        t1.id = 100;
        showId(t1);
        showId(t2);
        showId(t3);
        
        System.out.println("");
        
        String data = "Feri";
        String data2 = new String("Feri");
       
        address(data);
        address(data2);   
        
    }
}
