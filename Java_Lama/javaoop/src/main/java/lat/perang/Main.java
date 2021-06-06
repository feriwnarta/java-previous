/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat.perang;

/**
 *
 * @author Feri Winarta
 */
class Player {
   String nama;
   String hp;
   Weapon senjata;
   Armor tameng;
   
   Player(String nama, String hp) {
       this.nama = nama;
       this.hp = hp;
   }

   void warIsBegin(Player musuh) {
//    udin menyerang otoy(player1 serang player 2)
       System.out.println(this.nama + " menyerang " + musuh.nama);
//       defense(musuh,musuh.tameng); 
        double attackPower = musuh.senjata.attackPower;
        
   }

   void defense(Player musuh,Armor tamengMusuh) {
//       player 2 menampilkan defense terlebih dahulu
       System.out.println(musuh.nama + " memiliki defense sebesar " + tamengMusuh.defensePower);
//       tampilkan hasil demeg jika damage lebih besar dari pada defnse
       double attackPower = this.senjata.attackPower;
       double defensePower = musuh.tameng.defensePower;
       double damage = 0;
       if(attackPower > defensePower) {
           damage = attackPower - defensePower;
           System.out.println(musuh.nama + " menerima damage sebesar " + damage);
       } else {
           System.out.println("Serangan gagal damage yang di berikan " + damage);
       }
   }

   void equipWeapon(Weapon senjata) {
       this.senjata = senjata;
   }
   
   void equipArmor(Armor tameng) {
       this.tameng = tameng;
   }
   
   void display() {
       System.out.println("\nNAMA PLAYER = " + this.nama);
       System.out.println("JUMLAH DARAH = " + this.hp + " HP");
       this.senjata.dispay();
//       tammeng dalam bentuk return
       String data = tameng.dispay();
       System.out.println(data);
   } 
}

class Weapon {
    String nama;
    double attackPower;
    
    Weapon(String nama,double attack) {
        this.nama = nama;
        this.attackPower = attack;
    }
    
    void dispay() {
        System.out.println("SENJATA ADALAH " + this.nama.toUpperCase() + " KEKUATAN " + this.attackPower);
    }
}

class Armor {
    String nama;
    double defensePower;
    Armor(String nama, double defense) {
        this.nama = nama;
        this.defensePower = defense;
    }
    
    String dispay() {
        return ("TAMENG ADALAH " + this.nama.toUpperCase() + " KEKUATAN " + this.defensePower);
    }
}

public class Main {
    public static void main(String[] args) {
//        objek player
        Player player1 = new Player("udin","100");
        Player player2 = new Player("otoy","100");
//        objek weapon
        Weapon pedang = new Weapon("ballistik",15);
        Weapon archer = new Weapon("valkrye",10);
//        objek armor 
        Armor perisai = new Armor("vanguard",10);
        Armor kaos = new Armor("tanktop master",1);
        
//        player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(perisai);
        player1.display();
        
//        player 2
        player2.equipWeapon(archer);
        player2.equipArmor(kaos);
        player2.display();
        
//        pertempuran
        System.out.println("\nWAR IS BEGINING");
        System.out.println("=================");
        player1.warIsBegin(player2);
        
        System.out.println("\nPetempurn balasan");
        player2.warIsBegin(player1);
        
    }
}
