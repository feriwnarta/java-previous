/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encapsulasi;

/**
 *
 * @author Feri Winarta
 */
class Player {
    private String name;
    private int defaultHealth;
    private int level;
    private Weapon weapon;
    private Armor armor;
    
    public Player(String name) {
        this.name = name;
        this.defaultHealth = 100;
        this.level = 1;
    }
    
    public void setWeapon(Weapon obj) {
        this.weapon = obj;
    }
    
    public void setArmor(Armor obj) {
        this.armor = obj;
    }
    
    public int getHealt() {
        return this.defaultHealth;
    }
    
    public void display() {
        System.out.println("Nama Player            :" + this.name);
        System.out.println("Darah Player           :" + this.getHealt());
        System.out.println("Weapon Attack          :" + this.weapon.getAttack());
        System.out.println("Darah Player + Wepaon  :" + this.getMaxHealth());
    }
    
    public int getMaxHealth() {
        String nameWeapon = this.weapon.getName();
        this.weapon.setAddHealth(nameWeapon);
        return this.defaultHealth + this.weapon.getHealth();
    }
    
    
}

class Weapon {
    private String name;
    private int attack;
    private int addHealth;
    
    public Weapon(String name) {
        this.name = name;
        this.attack = weaponAttack(name);
    }
    
    public int weaponAttack(String name) {
        int attackPower = 0;
        if(name.equalsIgnoreCase("balistik")) {
            attackPower = 6;
        } else if(name.equalsIgnoreCase("butterfly")) {
            attackPower = 8;
        } else {
            attackPower = 0;
        }
        
        return attackPower;
    }

    public void setAddHealth(String name) {
        if(name.equalsIgnoreCase("balistik")) {
            this.addHealth = 10;
        } else {
            this.addHealth = 12;
        }   
    }
    
        
    public int getAttack() {
        return this.attack;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getHealth() {
        return this.addHealth;
    }
    
    public void displayAttackPower() {
        System.out.println("Senjata " + this.name + " Memiliki attackPower " + this.attack);
    }
}

class Armor{
    private String name;
    private int defense;
}


public class Main {
    public static void main(String[] args) {
//    create objek
//    obj player
    Player player1 = new Player("dieOrLife");
//    obj weapon 
    Weapon weapon1 = new Weapon("balistik");
    
//    akses kelas weapong didalam kelas player
    player1.setWeapon(weapon1);
    
    player1.display();
    
    
    
    
    
    }
}
