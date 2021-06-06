/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polimorphism;

/**
 *
 * @author Feri Winarta
 */
class Player {
    protected String name;
    
    Player(String name) {
        this.name = name;
    }
    
    Player() {
        
    }
    
    void displayAttack(Weapon p) {
        System.out.println(p.attackPower());
    }
    
    void displayName(Weapon p) {
        System.out.println(p.name);
    }
}

class Weapon extends Player {
    private double attack;
    
    Weapon(String name ) {
        super.name = name;
    }
    
    Weapon(double attack) {
        this.attack = attack;
    }
    
    protected double attackPower() {
        return this.attack;
    }
    
}

class Armor extends Player {
    
    private double defence;
    
    Armor(String name) {
        super.name = name;
    }
    
}


public class NewClass1 {
    public static void main(String[] args) {
        Player p = new Player("Feri winarta");
//        p.displayAttack(new Weapon("gadah"));
        Weapon w = new Weapon("agda");
        p.displayName(w);
        p.displayAttack(new Weapon(125.7));
        
        
    }
}
