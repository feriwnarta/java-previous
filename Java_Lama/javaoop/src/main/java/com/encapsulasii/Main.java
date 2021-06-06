package com.encapsulasii;

class Player {
    private final String name;
    private final int defaultHealth;
    private Armor armor;
    private Weapon weapon;
    private int level;
    private final int incHealth;
    private final int incAttack;
    
    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.defaultHealth = 100;
        this.incHealth = 20;
        this.incAttack = 20;
    }
     
    
    public void display() {
        System.out.println("Player \t\t:" + this.name);
        System.out.println("Level \t\t:" + this.level);
        System.out.println("Weapon \t\t:" + this.weapon.getName());
        System.out.println("Tameng \t\t:" + this.armor.getName());
        System.out.println("Max Health \t:" + maxHealth());
        System.out.println("Attack\t\t:" + getAttack()+"\n");
    }
    
    public void war(Player musuh) {
        System.out.println(this.name + " attacking " + musuh.name);
        
    }
 
    public void setArmor(Armor obj) {
        this.armor = obj;
    }
    
    public void setWeapon(Weapon obj) {
        this.weapon = obj;
    }
    
    public int maxHealth() {
        return this.defaultHealth + this.armor.getAddHealth() + this.level * this.incHealth;
    }
    
    public void levelUp() {
        this.level++;
    }
    
    public int getAttack() {
        return this.defaultHealth + this.level * this.incAttack + this.weapon.getAttack();
    }
    
}

class Weapon {
    private final String name;
    private final int attack;
    
    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAttack() {
        return this.attack;
    }
    
}

class Armor {
    private final String name;
    private final int strength;
    private final int health;
    
    public Armor(String name,int strength,int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }
    
    public String getName() {
        return this.name;
    }
     
    public int getAddHealth() {
        return this.strength * 10 + this.health;
    }
}

public class Main {
    public static void main(String[] args) {
//        object Created
        Player player1 = new Player("dieOrLife");
        Armor armor1 = new Armor("Vanguard",5,100);
        Weapon weapon1 = new Weapon("Balistik",10);
//        akses object // objcet mmber 
       player1.setArmor(armor1);
       player1.setWeapon(weapon1);
//       obj 2
       Player player2 = new Player("myStique");
       Armor armor2 = new Armor("Defend Ancient",6,98);
       Weapon weapon2 = new Weapon("ButterFly",13);
//        akses object // objcet mmber 
       player2.setArmor(armor2);
       player2.setWeapon(weapon2);
       
       
     
       
       
        
        
        
    }
}
