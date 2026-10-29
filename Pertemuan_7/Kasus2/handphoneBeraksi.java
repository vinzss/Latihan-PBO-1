/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_7.Kasus2;

/**
 *
 * @author Calvin
 */
public class handphoneBeraksi {
    public static void main(String[] args) {
        battery bat = new battery("5000 mAh");
        camera cam = new camera("64 MP", "32 MP");
        cpu prosesor = new cpu("Snapdragon 8 Gen 2", "3.2 GHz", "Octa-core");
        memory mem = new memory("1 TB (MicroSD)", "256 GB");
        
        handphone hpKu = new handphone("Galaxy S23", "Samsung", bat, cam, prosesor, mem);
        
        System.out.println("=== KASUS 2 (Oleh: Calvin Juniando) ===");
        System.out.println(hpKu.tampilkan());
    }
}
