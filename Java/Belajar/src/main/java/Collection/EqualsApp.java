/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Objects;

class Coba {
    private int id;
    
    public Coba(int id) {
        this.id = id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 1;
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
        final Coba other = (Coba) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}

public class EqualsApp {
    public static void main(String[] args) {
        Coba cb = new Coba(20);
        Coba cb2 = new Coba(20);
        Coba cb3 = cb;
        Coba cb4 = cb2;
        
        // membandingkan objek 1 dengan objek 2 menggunakan
        // defualt method equals akan membandingkan kesamaan berdasarkan
        // memori reference bukan membandingkan berdasarkan kesamaan isinya
        System.out.println("Equals default masih membandingkan berdasarkan"
                + " memori reference");
        String tes1 = (cb.equals(cb2)) ? "Benar" : "salah";
        String tes2 = (cb.equals(cb3)) ? "Benar" : "Salah";
        String tes3 = (cb2.equals(cb4)) ? "Benar" : "Salah";
        System.out.println("Ini tes 1 : " + tes1);
        System.out.println("Ini tes 2 : " + tes2);
        System.out.println("Ini tes 3 : " + tes3);
        
        cek(cb);
        cek(cb2);
        cek(cb3);
        
        System.out.println("\n");
        System.out.println("Setelah equals method dioveride kita membandingkan"
                + "value bukan memori referencenya");
        cb3 = new Coba(30);
        
        // equals yang dioveride akan true kalah id nya sama
        boolean isTrue = cb.equals(cb2);
        System.out.println(isTrue);
        
        boolean isTrue2 = cb.equals(cb3);
        System.out.println(isTrue2);
        
        
        // cek hashcode
        System.out.println("\ncek hashcode");
        if(cb.equals(cb2)) {
            System.out.println("true");
            System.out.println(cb.hashCode());
            System.out.println(cb2.hashCode());
        } else {
            System.out.println("salah!!!");
        }
        
        //cek hashcode salah
        if(cb.equals(cb3)) {
            System.out.println("true");
            System.out.println(cb.hashCode());
            System.out.println(cb3.hashCode());
        } else {
            System.out.println("salah!!!");
            System.out.println(cb.hashCode());
            System.out.println(cb3.hashCode());
        }
        
        System.out.println(cb.hashCode());
        System.out.println(cb3.hashCode());
        
        if(cb.equals(cb3)) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }
        
        
        

    }
    
    static void cek(Object obj) {
        int addres = obj.hashCode();
        System.out.println(Integer.toHexString(addres));
    }
}
