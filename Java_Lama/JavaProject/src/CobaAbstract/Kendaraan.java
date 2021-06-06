/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaAbstract;

/**
 *
 * @author Feri Winarta
 */
public class Kendaraan {
    private int berat;
    private String warna;
    private String merek;
    private int jumlahBan;
    
    void setBerat(int berat ) {
        this.berat = berat;
    }
    
    void setMerek(String merek) {
        this.merek = merek;
    }
    
    void display() {
        System.out.println("Halo");
    }
   
}
