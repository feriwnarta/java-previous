package relasi_assosiation.bidirectional;

public class Sekolah {
    private String namaSekolah;
    private KepalaSekolah kepsek;

    public Sekolah(String namaSekolah){
        this.namaSekolah = namaSekolah;
    }
    
    public void setNamaSekolah(String namaSekolah){
        this.namaSekolah = namaSekolah;
    }
    
    public String getNamaSekolah(){
        return namaSekolah;
    }

    public void setKepalaSekolah(KepalaSekolah kepsek){
        this.kepsek = kepsek;
    }

    public KepalaSekolah getKepalaSekolah(){
        return kepsek;
    }


}
