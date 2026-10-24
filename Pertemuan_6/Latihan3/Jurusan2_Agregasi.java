/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Latihan3;

/**
 *
 * @author Calvin
 */
public class Jurusan2_Agregasi {
    private String kode, nama;
    private mahasiswa_Agregasi daftarMhs[] = new mahasiswa_Agregasi[10];
    private int jumlahMhs;

    public Jurusan2_Agregasi(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return this.kode;
    }

    public String getNama() {
        return this.nama;
    }

    public int getJumlahMhs() {
        return this.jumlahMhs;
    }

    public void addMahasiswa(mahasiswa_Agregasi m) {
        if (jumlahMhs < this.daftarMhs.length) {
            daftarMhs[jumlahMhs] = m;
            jumlahMhs++;
        }
    }

    // Class Jurusan tidak hanya menyimpan, tapi mengakses dan menampilkan
    public void displayData() {
        System.out.println("Kode Jurusan =" + this.kode);
        System.out.println("Nama Jurusan =" + this.nama);
        for (mahasiswa_Agregasi m : daftarMhs) {
            if (m != null) {
                System.out.println(" " + m.getNim() + m.getNama());
            }
        }
    }
}
