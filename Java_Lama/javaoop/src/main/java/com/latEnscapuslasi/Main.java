/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latEnscapuslasi;

/**
 *
 * @author Feri Winarta
 */
class Player {
    private int baseHealth;
    private int baseAttack;
    private String name; 
    private Armor armor;
    private Weapon weapon;
    private int level;
    private int incerementHealth;
    private int incerementAttack;
    
    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incerementHealth = 20;
        this.incerementAttack = 20;
    }
    
    public void setArmor(Armor obj) {
        this.armor = obj;
    }
    
    public void setWeapon(Weapon obj) {
        this.weapon = obj;
    }
    
    public int maxHealth() {
        return this.baseHealth + this.level * this.incerementHealth + this.armor.getAddHealth();
    }
    
    public int getAttackPower() {
       return this.baseAttack + this.level * this.incerementAttack + this.weapon.getAttack();
    }
    
    public void levelUp() {
        this.level++;
    }
    
    public void display() {
        System.out.println("Nama Player   : " + this.name);
        System.out.println("Level         : " + this.level );
        System.out.println("Max Health    : " + this.maxHealth());
        System.out.println("Attack        : " + this.getAttackPower() + "\n");
        
    }
}

class Weapon {
    private String name;
    private int attack;
    
    public Weapon(String name,int attack) {
        this.name = name;
        this.attack = attack;               
    }
    
    public int getAttack() {
        return this.attack;
    }
    
}

class Armor {
    private String name;
    private int strenght;
    private int health;
    
    public Armor (String name,int strength,int health) {
        this.name = name;
        this.strenght = strength;
        this.health = health;
    }
    
    public int getAddHealth() {
        return this.strenght * 10 + this.health;
    }
    

}


public class Main {
    public static void main(String[] args) {
//        instanssiasi objek
        Player player1 = new Player("dieOrLife");
        Weapon weapon1 = new Weapon("balistik",10);
        Armor armor1 = new Armor("vanguard",5,100);     
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
//        player 2
        Player player2 = new Player("mysTique");
        Weapon weapon2 = new Weapon("Rudal",11);
        Armor armor2 = new Armor("DOT",4,90);     
        player2.setArmor(armor1);
        player2.setWeapon(weapon1);
        
        
  
        
        
    }
}
