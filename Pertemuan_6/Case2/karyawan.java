/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Case2;

/**
 *
 * @author Calvin
 */
public class karyawan {
    private String nip, nama, alamat, jabatan, jenisKelamin, agama;

    public karyawan(String nip, String nama, String alamat, String jabatan, String jk, String agama) {
        this.nip = nip; this.nama = nama; this.alamat = alamat;
        this.jabatan = jabatan; this.jenisKelamin = jk; this.agama = agama;
    }

    public String getNip() { return nip; }
    public String getNama() { return nama; }
} 
