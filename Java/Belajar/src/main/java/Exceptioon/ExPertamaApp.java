/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptioon;

/**
 *
 * @author Feri Winarta
 */
public class ExPertamaApp extends ExceptionPertama{
    public void erorPertama() {
        try {
            System.out.println("hai");
            throw new ExceptionPertama("Error");
        }catch(ExceptionPertama e) {
            System.err.println(e);
        }
    }
}

class App {
    public static void main(String[] args) {
        
    }
}
