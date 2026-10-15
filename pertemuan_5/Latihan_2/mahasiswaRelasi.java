package pertemuan_5.Latihan_2;

public class mahasiswaRelasi {
    //deklarasi attribut/property
    private String nim;
    private String nama;

    //create method set
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //create method get
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}