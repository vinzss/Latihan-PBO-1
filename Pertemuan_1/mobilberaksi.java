/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_1;

/**
 *
 * @author Calvin
 */
public class mobilberaksi {
    public static void main(String[] args) {
        mobil mobilku = new mobil();
        
        mobilku.TahunProduksi = 2020;
        mobilku.Warna = "Merah";
        
        System.out.println("Warna mobil = " + mobilku.Warna);
        System.out.println("Tahun Produksi = " + mobilku.TahunProduksi);
    }
}
