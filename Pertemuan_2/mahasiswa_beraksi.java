package Pertemuan_2;
//calvin
public class mahasiswa_beraksi {
    static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = 55250010;
        mhs.nama = "Calvin Juniando";
        mhs.alamat = "Jalan Kopi , Kota tua";
        mhs.jurusan = "Teknik Informatika";

        System.out.println("Nama : " + mhs.nama + "\nNim : " + mhs.nim + "\nJurusan : " + mhs.jurusan + "\n Alamat :" + mhs.alamat);
    }
}

