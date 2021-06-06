package Field;

class Car {
    String merek;
    int speed;
}


public class Main {
    public static void main(String[] args) {
        Car avanza = new Car();
        avanza.merek = "avanza";
        avanza.speed = 1200;

        System.out.println(avanza.merek);
        System.out.println(avanza.speed);


    }
}
