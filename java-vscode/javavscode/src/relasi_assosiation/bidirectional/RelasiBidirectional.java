package relasi_assosiation.bidirectional;

public class RelasiBidirectional {
    public static void main(String[] args) {
        Sekolah school = new Sekolah("Ariya Metta");
        KepalaSekolah kepsek = new KepalaSekolah("Sakimin");


        // konek relasi bidirectional (objek berada di atribut antar kelas);
        school.setKepalaSekolah(kepsek);
        kepsek.setSekolah(school);

        // isi dari objek sekolah
        // objek sekolah akan mengakses objek kepsek
        System.out.println("isi dari objek sekolah");
        System.out.println(school.getNamaSekolah() + " memiliki kepala sekolah bernama " + school.getKepalaSekolah().getNamaKepsek());
        System.out.println("identitas Kepala sekolah : \n");
        school.getKepalaSekolah().showIndentitas();

        // isi dari objek kepsek
        // objek kepsek akan mengakses objek sekolah
        System.out.println("\nIsi dari objek kepala sekolah");
        System.out.println(kepsek.getNamaKepsek() + " dia merupakan kepala sekolah dari sekolah " + kepsek.getSekolah().getNamaSekolah());

        


    }
}
