/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Latihan3;

/**
 *
 * @author Calvin
 */
public class Main2_Agregasi {
    public static void main(String[] args) {
        // Membuat Objek Jurusan
        Jurusan2_Agregasi j = new Jurusan2_Agregasi("DKV", "Desain Komunikasi Visual");
        
        // Membuat Objek Mahasiswa 1
        mahasiswa_Agregasi m1 = new mahasiswa_Agregasi();
        m1.setNim("43210195");
        m1.setNama("Dita Dwita Hayuning Tyas");
        
        // Membuat Objek Mahasiswa 2
        mahasiswa_Agregasi m2 = new mahasiswa_Agregasi();
        m2.setNim("56210008");
        m2.setNama("Nukky Sugandi");
        
        // Hubungkan Mahasiswa dengan Jurusan
        j.addMahasiswa(m1);
        j.addMahasiswa(m2);
        
        // Tampilkan Data
        j.displayData();
    }
}
