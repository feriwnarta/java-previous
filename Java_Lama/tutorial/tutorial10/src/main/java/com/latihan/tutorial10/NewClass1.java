package com.latihan.tutorial10;
import java.util.Scanner;

public class NewClass1{
      public static void main (String[] args) {
//          membuat switch
       String input;
       Scanner inputUser = new Scanner(System.in);
       
          System.out.println("masukan nama = ");
          input = inputUser.next();
          
          switch(input) {
              case "feri" : 
                  System.out.println("Nama anda adalah " + input);
                  break;
              case "figo" :
                  System.out.println("nama anda adalah " + input);
                  break;
              case "beruk" :
                  System.out.println("nama anda adalah brk" );
                  break;
              case "tepung" :
                  System.out.println("nama anda adalah tpg" );;
                  break;
              default : 
                  System.out.println(input + " tidak ada nama");
          }
        
          
          
          
      }       
}


 