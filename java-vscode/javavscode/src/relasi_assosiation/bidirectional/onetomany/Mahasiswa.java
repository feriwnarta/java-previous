package relasi_assosiation.bidirectional.onetomany;

public class Mahasiswa {
    private String nim;
    private Kelas kelas;

    public Mahasiswa(String nim, Kelas kelas){
        this.nim = nim;
        this.kelas = kelas;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void setKelas(Kelas kelas){
        this.kelas = kelas;
    }

    public Kelas getKelas(){
        return kelas;
    }
}
