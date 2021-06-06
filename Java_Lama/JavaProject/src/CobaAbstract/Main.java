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

//full Overide

class Mobil extends Kendaraan{
    private String merek = null;
    private int berat = 0;
    
    @Override
   void setMerek(String merek) {
        this.merek = merek;
   }
    
    @Override
   void setBerat(int berat) {
        this.berat = berat;
   }
   
//   method didalam inherit bisa overloading dan auto pilih sesuai parameter
   
   void display(String nama) {
       System.out.println("Bego " + nama);
   }
}

class Bemo extends Angkot {
    
    Bemo(String merek,int tahun,int ban) {
        super.merek = merek;
        super.tahunBuat = tahun;
        super.jumlahBan = ban;
    }
    
//    saat melakukan overiding method, header method tersebut harus sama dan sesuai
//    akan tetapi bodynya dapat beda
//    berbeda dengan method overloading yang header methodnya harus beda
    
    void showJumlahBan() {
        System.out.println("Ban");
    }
    
   
    void showMerek() {
        System.out.println("Halo");
    }
    
    void showTahunBuat() {
        System.out.println("Hei");
    }
    
    
    void display2() {
        
        System.out.println("BEMO INI ADALAH BEMO YANG DIMILIKI PRESIDEN SOEKARNO");
    }
              
}




public class Main {
    public static void main(String[] args) {
//       full overide

//        Mobil m = new Mobil();
//        m.setMerek("BMW");
//        m.setBerat(123);
//        m.display();

        Bemo b = new Bemo("Klasik Bemo",1987,3);
//        b.display();
        System.out.println("");
        Bemo c = new Bemo("BEMO SIDUL",1963,4);
//        c.display();
        System.out.println("");
        Bemo d = new Bemo("BEMO GUE",1964,3);
//        d.display2();
        System.out.println("");
        Bemo e = new Bemo("Old Bemo",1998,6);
//        e.display();
        
        
        Mobil m = new Mobil();
        m.display();


        
    }
}
