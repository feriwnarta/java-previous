/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Objects;

/**
 *
 * @author Feri Winarta
 */
public class EqualsOveride {
    private int id;
    private String data;
    
    public EqualsOveride(int id) {
        this.id = id;
    }
    
    public static void howHas(Object o) {
        System.out.println(Objects.hashCode(o));
    }
    
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final EqualsOveride other = (EqualsOveride) obj;
//        if (this.id != other.id) {
//            return false;
//        }
//        if (!Objects.equals(this.data, other.data)) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 13 * hash + this.id;
//        hash = 13 * hash + Objects.hashCode(this.data);
//        return hash;
//    }

    
    
    public static void main(String[] args) {
        EqualsOveride oq = new EqualsOveride(20);
        EqualsOveride oq1 = new EqualsOveride(20);
    
        boolean truet = oq.equals(oq1);
        System.out.println(truet);
        
        
        System.out.println(oq.hashCode());
        System.out.println(oq1.hashCode());
        
        
        
        
        
    }
}



