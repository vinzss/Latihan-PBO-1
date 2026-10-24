/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Case2;

/**
 *
 * @author Calvin
 */
public class gajiBeraksi {
    public static void main(String[] args) {
        karyawan k1 = new karyawan("EMP-001", "Calvin Juniando", "Jakarta", "Developer", "L", "Kristen");
        dataGaji gajiBulanIni = new dataGaji("Oktober 2024", 8000000, 2500000, k1);
        
        gajiBulanIni.tampilkanSlip();
    }
}
