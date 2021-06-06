/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.method;

/**
 *
 * @author Feri Winarta
 */

class Mahasiswa {
    String namaDepan;
    String namaBelakang;
    
    Mahasiswa(String namaDepan,String namaBelakang) {
    this.namaDepan = namaDepan;
    this.namaBelakang = namaBelakang;

    }
    
    void cetak() {
        System.out.println("Nama anda adalah " + this.namaDepan + this.namaBelakang);
       
    }
    
    void setNama(String nama) {
        String gabung = this.namaDepan + this.namaBelakang;
        gabung = nama;
        System.out.println(gabung);
    }
    
    void contoh () {
        System.out.println("ini contoh");
//        Main.metodd("Sayang feri");
    }
    
//    String contoh2(String contoh) {
//        return contoh;
//    }
    
//    String gabungan(int angka) {
//       return 
//    }
    
//    int contoh (int angka) {
//        return angka;
//    }
    
    int statiss (int hasil ) {
        return hasil;
    }
    
//   public int gabungan(int hasil) {
//       return Main.metodd(hasil);
//   }
    
    
    
     
}

class Css {
    int nilai;
    
    int cetak;
}

public class Main {
    
//     int metodd(String nama, int total) {
     int metodd(int total) {
       
//        System.out.println(nama);
        int hasil = total * total;
        
        
        return hasil;
    }
//    String nama;
////    konstuktor
//     Main (String nama) {
//       this.nama = nama;
//       System.out.println(this.nama);
//   } 
////     sebuah metod dengan non static, dipanggil menggunakan sebuah fungsi
//        void metod (String nama) {
//            System.out.println(nama);
//        }
//        sebuah metod dengan static, dipanggil tanpa menggunakan fungsi
    
//    void nonstatis(String apa) {
//        System.out.println(apa);
//    }
//        
//        static void metod2 (String nama) {
//            System.out.println(nama);
//        }
    
    static void statis(String apa) {
        System.out.println("contoh statis " + apa);
    }
    
    void statis2(String apa) {
        System.out.println("contoh tanpa statis " + apa); 
    }
   
   
   
    public static void main(String[] args) {
        
        Css objekCss = new Css();
        
       
        
//        menjalankan kelas didalam main
            
//        statis("statis");
//        Main objekStatis = new Main();
//        objekStatis.statis2("non statis");

//        Main objekMaen = new Main("Nama Baru");
//        Main objekLaura = new Main("Laura");
//        metod2("peju");
//            Main objekBaru = new Main();
//            objekBaru.nonstatis("apakek");
            
//            int cetak = metodd("laruaagoe", 5);
//            System.out.println(cetak);
            
        Mahasiswa objekNama = new Mahasiswa("Feri", "Winarta");
        objekNama.contoh();
        objekNama.cetak();
        objekNama.setNama("Joko anwar");
//        int cetak = objekNama.gabungan("feri");
//        System.out.println("nilai dari metod gabungan antara metod main dengan mahasiswa " + cetak);
        
        
                
        
        
        
        
    }
}
