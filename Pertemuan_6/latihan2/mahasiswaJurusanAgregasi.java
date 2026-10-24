/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.latihan2;

/**
 *
 * @author Calvin
 */
public class mahasiswaJurusanAgregasi {
    public static void main(String[] args) {
        jurusanAgregasi jurusan = new jurusanAgregasi("TI", "Teknik Informatika");
        
        mahasiswaAgregasi mhs1 = new mahasiswaAgregasi();
        mhs1.setNim("59230047");
        mhs1.setNama("Andrew Albertinus");
        
        mahasiswaAgregasi mhs2 = new mahasiswaAgregasi();
        mhs2.setNim("56230149");
        mhs2.setNama("Apriliyana Juslan");

        jurusan.addMahasiswa(mhs1);
        jurusan.addMahasiswa(mhs2);

        System.out.println("Kode Jurusan = " + jurusan.getKode());
        System.out.println("Nama Jurusan = " + jurusan.getNama());
        
        mahasiswaAgregasi[] daftar = jurusan.getDaftarMhs();
        for (mahasiswaAgregasi m : daftar) {
            if (m != null) {
                System.out.println(" " + m.getNim() + " " + m.getNama());
            }
        }
    }
}
