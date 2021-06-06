package relasi_assosiation.bidirectional.onetomany;

import java.util.LinkedList;

public class Kelas {
    private String kodeKelas;
    private LinkedList<Mahasiswa> mhs;

    public Kelas(String kodeKelas, LinkedList<Mahasiswa> mhs){
        this.kodeKelas = kodeKelas;
        this.mhs = mhs;
    }

    public void setKodeKelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    public String getKodeKelas(){
        return kodeKelas;
    }

    public void setMhs(LinkedList<Mahasiswa> mhs){
        this.mhs = mhs;
    }

    public LinkedList<Mahasiswa> getMhs(){
        return mhs;
    }

    

}
