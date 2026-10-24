/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Case1;

/**
 *
 * @author Calvin
 */
public class maskapai {
    private String kode_maskapai;
    private penumpang[] daftarPenumpang = new penumpang[10]; 
    private int jmlPenumpang = 0;

    public maskapai(String kode_maskapai) {
        this.kode_maskapai = kode_maskapai;
    }

    public void setPenumpang(penumpang p) {
        daftarPenumpang[jmlPenumpang] = p;
        jmlPenumpang++;
    }

    public void tampilkanData() {
        System.out.println("Kode Maskapai : " + kode_maskapai);
        System.out.println("Daftar Penumpang : ");
        for (int i = 0; i < jmlPenumpang; i++) {
            System.out.println("- ID: " + daftarPenumpang[i].getIdPenumpang() + 
                               " | Nama: " + daftarPenumpang[i].getNamaPenumpang());
        }
    }
}
