/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Latihan1;

/**
 *
 * @author Calvin
 */
public class mahasiswa2 {
    private String nim, nama;
    protected String[] kodeMakul = new String[2];
    protected String[] namaMakul = new String[2];
    private int jmlMakul = 0;

    public mahasiswa2(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void setKodeMakul(String kdMakul) {
        kodeMakul[jmlMakul] = kdMakul;
        jmlMakul++;
    }

    public void setNamaMakul(String nmMakul) {
        namaMakul[jmlMakul] = nmMakul;
        jmlMakul++;
    }

    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public int getJmlMakul() { return jmlMakul; }

    public void daftarMakul() {
        System.out.println("Nomor Induk Mahasiswa : " + nim);
        System.out.println("Nama Mahasiswa        : " + nama);
        System.out.println("Mata Kuliah yang diambil : ");
        for (int i = 0; i < jmlMakul; i++) {
            System.out.println(kodeMakul[i]);
        }
}}
