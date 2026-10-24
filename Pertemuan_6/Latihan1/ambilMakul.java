/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Latihan1;

/**
 *
 * @author Calvin
 */
public class ambilMakul {
    public static void main(String[] args) {
        mataKuliah makul1 = new mataKuliah("KD001", "1. Pemrograman Berorientasi Objek");
        mataKuliah makul2 = new mataKuliah("KD002", "2. Bahasa Inggris");
        mahasiswa2 mhs1 = new mahasiswa2("44240077", "Yulia Khairunnisa");

        mhs1.setKodeMakul(makul1.getNmMakul());
        mhs1.setKodeMakul(makul2.getNmMakul());
        mhs1.daftarMakul();
}}
