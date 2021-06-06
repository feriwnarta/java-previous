package AnonymousClass;

public class AnonymousApp {
    String variable = "x";

    public String toString() {
        return "Kelas : Anonymous " + "variabelnya " + this.variable;
    }

    public static void main(String[] args) {
        Anonyms agj = new Anonyms() {
            public void display() {
                System.out.println("Wouyyy!!!");
            }
        };



        // objek menempati memori


        AnonymousApp app = new AnonymousApp();
        System.out.println(app.toString());
        AnonymousApp app2 = new AnonymousApp();
        AnonymousApp app3 = app;

        addres(app2);
        addres(app);
        addres(app3);
    }

    static void addres(Object obj) {
        int add = System.identityHashCode(obj);
        System.out.println(Integer.toHexString(add));
    }

    static void coba(int integera) {

    }


}
