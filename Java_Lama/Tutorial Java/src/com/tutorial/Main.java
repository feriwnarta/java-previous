package com.tutorial;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner inputUser = new Scanner;
        String id;
        String password;
        String Masuk = "Daftar / Login";
        String admin1Id = "dieorlife";
        String adminPass = "feriganteng";
        String daftarId;
        String daftarPass;



//        Program
        while(true) {

            do {
                System.out.println("Selamat Datang di portal");
                System.out.println(Masuk);
                if (Masuk.equalsIgnoreCase("Login")) {
                    System.out.println("Masukan Id anda");
                    id = inputUser.next();
                    System.out.println("Masukan Password anda");
                    password = inputUser.next();
                    if (id.equalsIgnoreCase(admin1Id) && password.equalsIgnoreCase(adminPass)) {
                        System.out.println("Selamat datang Admin DieOrlife");

                    } else {
                        System.out.println("Id atau password anda salah");
                    }
                } else if (Masuk.equalsIgnoreCase("Daftar")) {

                    System.out.println("Silahkan bikin id (minimal 1 uppercase, 1 number,");
                    daftarId = inputUser.next();
                    System.out.println("Masukan Password");
                    daftarPass = inputUser.next();
                    break;

                }

            } while (true);
        }


    }
}
