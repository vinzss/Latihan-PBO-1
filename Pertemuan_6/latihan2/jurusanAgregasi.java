/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.latihan2;

/**
 *
 * @author Calvin
 */
public class jurusanAgregasi {
    private String kode, nama;
    private mahasiswaAgregasi daftarMhs[] = new mahasiswaAgregasi[10];
    private int jumlahMhs;

    public jurusanAgregasi(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getJumlahMhs() { return jumlahMhs; }

    public void addMahasiswa(mahasiswaAgregasi m) {
        if (jumlahMhs < this.daftarMhs.length) {
            daftarMhs[jumlahMhs] = m;
            jumlahMhs++;
        }
    }

    public mahasiswaAgregasi[] getDaftarMhs() { return daftarMhs; }
}
