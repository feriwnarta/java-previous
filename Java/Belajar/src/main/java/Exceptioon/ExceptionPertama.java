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

public class ExceptionPertama extends Throwable{
    // default konstruktor
    public ExceptionPertama(){}
    
    public ExceptionPertama(String message)throws ExceptionPertama{
        super(message);
    }
}
