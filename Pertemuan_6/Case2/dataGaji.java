/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Case2;

/**
 *
 * @author Calvin
 */
public class dataGaji {
    private String bulan;
    private double gapok, tunjangan, totalGaji;
    private karyawan pegawai; // Relasi many-to-one

    public dataGaji(String bulan, double gapok, double tunjangan, karyawan pegawai) {
        this.bulan = bulan;
        this.gapok = gapok;
        this.tunjangan = tunjangan;
        this.pegawai = pegawai;
        this.totalGaji = gapok + tunjangan;
    }

    public void tampilkanSlip() {
        System.out.println("--- SLIP GAJI ---");
        System.out.println("Bulan      : " + bulan);
        System.out.println("NIP Pegawai: " + pegawai.getNip());
        System.out.println("Nama       : " + pegawai.getNama());
        System.out.println("Gaji Pokok : Rp " + gapok);
        System.out.println("Tunjangan  : Rp " + tunjangan);
        System.out.println("Total Gaji : Rp " + totalGaji);
    }
}
