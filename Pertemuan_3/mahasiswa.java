package Pertemuan_3;
//calvin
public class mahasiswa {
    String nama,alamat;
    double ipk;

    void cetakMahasiswaGenius(){
        nama = "Nur Salim";
        alamat = "Jakarta";
        ipk = 3.97;
        System.out.println("Mahasiswa Genius");
        System.out.println("-----------------");
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("Alamat Mahasiswa = " + alamat);
        System.out.println("IPK  = " + ipk);
    }
    void cetakMahasiswaPintar(){
        nama = "nurlela";
        alamat = "Jakarta";
        ipk = 3.5;
        System.out.println("Mahasiswa pintar");
        System.out.println("-----------------");
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("Alamat Mahasiswa = " + alamat);
        System.out.println("IPK  = " + ipk);
    }
}
