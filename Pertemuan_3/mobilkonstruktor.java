package Pertemuan_3;
//calvin
public class mobilkonstruktor {
        String warna;
        int tahunproduksi;
    public mobilkonstruktor(String warna, int tahunproduksi){
        this.warna = warna;
        this.tahunproduksi = tahunproduksi;
    }
    void info(){
        System.out.println("warna = " +warna);
        System.out.println("Tahun Produksi = " + tahunproduksi);
    }
}
