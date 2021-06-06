/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encapsulasii;

/**
 *
 * @author Feri Winarta
 */

class Player1 {
    private String name;
    private int damage;
    
    public Player1(String name,int dam) {
        this.name = name;
        this.damage = dam;
    }
    
    public void Attack(Player1 musuh) {
        System.out.println(this.name + " Attacking " + musuh.name);
    }
    
    public int pengurangan(Player1 musuh) {
        return this.damage - musuh.damage;
    }
    
}
public class NewClass1 {
    public static void main(String[] args) {
        Player1 player  = new Player1("Feri",15);
        Player1 player2  = new Player1("Loke",10);
    
//        method didalam kelas dapat mengakses kelas juga yang berati 
//        parameter akan dikirim dengan objek kelas yang berhubunga
        player.Attack(player2);
        System.out.println(player.pengurangan(player2));
    }
}
