package com.latihanProjek;

class Player {
    String nama;
    int darah;
    Weapon senjata;
    Armor tameng;
    
        Player(String nama, int darah) {
            this.nama = nama;
            this.darah = darah;
    }
        void equipWeapon(Weapon senjata) {
            this.senjata = senjata;
        }
        
//        void display() {
//            System.out.println("nama = " + this.nama);
//            
//        }
}

class Weapon {
    double attackPower;
    String nama;
        
        Weapon(String nama, double attack) {
            this.nama = nama;
            this.attackPower = attack;
        }
        void display() {
            System.out.println("nama senjata " + this.nama + " kekuatan " + this.attackPower);
        }
}

class Armor {
    double defensePower;
    String nama;
    
    Armor(String nama, double defense) {
        this.nama = nama;
        this.defensePower = defense;
    }
    
    void display() {
        System.out.println("nama " + this.nama + " kekuatan " + this.defensePower);
    }
}

public class Main {
    public static void main(String[] args) {
//        objek Player
    Player player = new Player("Feri Winarta", 100);
    Weapon senjata = new Weapon("Pedang", 10);
    player.equipWeapon(senjata);
    player.senjata.display();
    
        
     
        
        
        
        
    }
}