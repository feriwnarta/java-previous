package relasi_assosiation.bidirectional.onetomany;

import java.util.LinkedList;

public class OneManyApp {
    public static void main(String[] args) {
        LinkedList<Mahasiswa> mhs = new LinkedList<>();
        Kelas kelas = new Kelas("IF21", mhs);

        // isi linked list mahasiswa
        // relasi objek mhs dengan kelas
        mhs.addFirst(new Mahasiswa("20201000041",kelas));
        mhs.addFirst(new Mahasiswa("20201000042",kelas));


        // tampil isi list dari objek kelas
        // relasi kelas denga mhs
        System.out.println("list mahasiswa : \n");
        for(Mahasiswa list : kelas.getMhs()) {
            System.out.println(list.getNim());
        }
 


    }
}
