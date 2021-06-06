package relasi_assosiation.bidirectional;

public class KepalaSekolah {
    private String namaKepsek;
    private Sekolah sekolah;

    public KepalaSekolah(String namaKepsek){
        this.namaKepsek = namaKepsek;
    }

    public void setNamaKepsek(String namaKepsek){
        this.namaKepsek = namaKepsek;
    }

    public String getNamaKepsek(){
        return namaKepsek;
    }

    public void setSekolah(Sekolah sekolah){
        this.sekolah = sekolah;
    }

    public Sekolah getSekolah(){
        return sekolah;
    }

    public void indentitas(String alamat, int umur, String jenjangPendidikan){
        System.out.println("nama : " + namaKepsek + "\ntingal di : " + alamat +"\numur : " + umur + "\nPendidikan : " + jenjangPendidikan);
    }

    public void showIndentitas(){
        indentitas("tegal", 52, "S1");
    }
}
