/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tesException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Cny {
    static float getAngpao() {
        return 200f;
    }
    static void sayNewYear() {
        System.out.println("Happy Chinesse New Year");
        getAngpao();
    }
    static String format() {
        LocalDateTime myDateObj = LocalDateTime.now();  
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = myDateObj.format(myFormatObj);  
        return formattedDate;
    }
    public static void main(String[] args) {
        if(format().contains("12Feb-2021")) {
            sayNewYear();
        } else {
            System.out.println("Belum waktunya");
        }
    }
}
