package com.staticNonStatic;

//class Statis {
////    public static String name;
//    public String lastName;
//    
//    Statis(String name, String last) {
////        this.name = name;
//        this.lastName = last;
//    }
    
    class StaticMethod {
        private static String name;
        private String lastName;
        
        public StaticMethod(String name, String last) {
           this.name = name;
           this.lastName = last;
        }
        
//        method get non static
        public String getName() {
            return this.name;
        }
        
//        method get dengan static context
        public static String getLanjut() {
            return StaticMethod.name;
        }
        
    }
    
    
    


public class Main {
    public static void main(String[] args) {
//        Statis obj = new Statis("Feri","winarta");
//        Mencetak non staic attribute
//        System.out.println(obj.name);  //static bisa ditaruh didalam objek juga
//        System.out.println(obj.lastName); // non static harus ditaruh didalam obj
//        mencetak Static attribute
//        System.out.println(Statis.name); // menggunakan statis tanpa objek dengan pemanggilan namaKelas bukan objek
        
//        Mengakses method Static
        StaticMethod obj1 = new StaticMethod("feri","winarta");
//        Method Non Static
        System.out.println("Contoh dari Non Static method " + obj1.getName());
        System.out.println("Contoh dari static method " + StaticMethod.getLanjut());
    
    
    
        
    }
}
