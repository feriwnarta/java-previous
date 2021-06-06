package Konstruktor;

class Person {
    String nama;
    int usia;

    Person(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

}


public class Konstruktor {
    public static void main(String[] args) {
        Person p1 = new Person("feri",19);

    }
}
