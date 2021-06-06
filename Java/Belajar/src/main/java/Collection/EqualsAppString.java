/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Objects;
import java.util.Random;

class Customer {
    private String name;
    
    public Customer(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
       return 1;
    }
    
    

}


public class EqualsAppString {
    public static void main(String[] args) {
        Customer c1 = new Customer("Feri");
        Customer c2 = new Customer("Feri");
        Customer c3 = new Customer("winarta");
        
        if(c1.equals(c2)) {
            System.out.println("benar");
            System.out.println(c1.hashCode());
            System.out.println(c2.hashCode());
        } else {
            System.out.println("salah");
        }
        
        if(c1.equals(c3)) {
            System.out.println("benar");
            System.out.println(c1.hashCode());
            System.out.println(c2.hashCode());
        } else {
            System.out.println("salah");
            System.out.println(c1.hashCode());
            System.out.println(c2.hashCode());
        }
        
        c3.setName("sondol");
        System.out.println(c1.getName());
        System.out.println(c3.getName());
        System.out.println(c1.hashCode());
        System.out.println(c3.hashCode());

    }
}
