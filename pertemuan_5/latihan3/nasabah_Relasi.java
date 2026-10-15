package pertemuan_5.latihan3;

public class nasabah_Relasi {
    String nama;
    long ktp;
    rekening_relasi rek; //data member berupa object class rekening

    //beberapa jenis konstructor
    public nasabah_Relasi() {
        nama = "kosong";
        ktp = 0;
        System.out.println("Nasabah baru dibuat...");
    }

    public nasabah_Relasi(String n, long k){
        nama = n;
        ktp = k;
        System.out.println("Nasabah "+nama+" dibuat...");
    }

    public nasabah_Relasi(String n){ nama = n; }
    public nasabah_Relasi(long k){ ktp = k; }

    public void bukarekening(rekening_relasi r){ //method untuk implementasi relasi
        rek = r;      //object assignment
        System.out.println(nama+" Sukses buka rekening ");
    }
}
