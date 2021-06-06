package com.latihanProjek;

class User {
    String nama;
    int darah;

    Senjata pedang;
    Tameng perisai;
    
    User(String nama, int darah) {
        this.nama = nama;
        this.darah = darah;
    }
    
    void equipWeapon(Senjata pedang) {
        this.pedang = pedang;

    }
    
    void equipArmor(Tameng armor) {
        this.perisai = armor;
    }
    
//    public static int display2() {
//        return 10;
//    }

}

class Senjata {
    double attackPower;
    String namaPedang;
    
    Senjata(String nama,double attackPower) {
        this.namaPedang = nama;
        this.attackPower = attackPower;
    }
//    
//    void display() {
//        System.out.println("tameng ");
//        Tameng.display();
//    }
    
//    void display() {
//        System.out.println("Ini adalah diplay punya class senjata " + User.display2());
//    }
}

class Tameng {
    String namaTameng;
    double defensePower;
    
    Tameng(String nama, double defensePower) {
        this.namaTameng = nama;
        this.defensePower = defensePower;
    }
    
//    public static void display() {
//        System.out.println("nomor " + User.display2());
//    }
}
public class NewClass {
    public static void main(String[] args) {
//        membuat objek 
    User pengguna1 = new User("Feri", 100);
    Senjata pedang1 = new Senjata("Pedang Ksatria", 100);
    Tameng perisai1 = new Tameng("Vanguard", 15);
  
//    membuat akses class pedang dan tameng ke user
    pengguna1.equipWeapon(pedang1);
    pengguna1.equipArmor(perisai1);
    
    
    
//    
        
    }
}
