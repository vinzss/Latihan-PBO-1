package Pertemuan_3;
//calvin
public class konstruktorMahasiswaBeraksi {
    public static void main(String[] args) {
        // Membuat objek baru dengan mengirimkan nilai ke dalam konstruktor
        konstruktorMahasiswa mahasiswa1 = new konstruktorMahasiswa("202612345", "Calvin Juniando", "Laki-laki", 20);

        // Menampilkan nilai atribut langsung di main class
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NIM           : " + mahasiswa1.nim);
        System.out.println("Nama          : " + mahasiswa1.nama);
        System.out.println("Jenis Kelamin : " + mahasiswa1.jenisKelamin);
        System.out.println("Usia          : " + mahasiswa1.usia + " tahun");
    }
}