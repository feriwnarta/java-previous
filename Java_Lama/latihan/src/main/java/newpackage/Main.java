/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


/**
 *
 * @author Feri Winarta
 */
public class Main {
    static void checkAge(int age) {
        try {
            if(age < 18) {
                throw new ArithmeticException();
            } else {
                System.out.println("Lanjur");
            }
        } catch(Exception e) {
            System.err.println("Salah nih bos");
        }
        
    }
    public static void main(String[] args) {
        checkAge(19);
    }
}
