/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uas;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MASUKAN NAMA ANDA = ");
        String name = input.nextLine();
        Library obj1 = new Library(name);
        obj1.menu();

    }
}
