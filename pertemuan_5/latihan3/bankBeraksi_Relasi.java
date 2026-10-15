package pertemuan_5.latihan3;

public class bankBeraksi_Relasi {
    public static void main(String args[]){
        nasabah_Relasi ika = new nasabah_Relasi("Ika", 123456789); //buat objek nasabah
        rekening_relasi bni = new rekening_relasi(123456789, 1000000); //buat objek rekening
        ika.bukarekening(bni); //buat relasi antar objeknya
    }
}