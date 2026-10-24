/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Case1;

/**
 *
 * @author Calvin
 */
public class maskapaiBeraksi {
    public static void main(String[] args) {
        maskapai garuda = new maskapai("GA-2026");
        
        penumpang p1 = new penumpang(101, "Calvin Juniando");
        penumpang p2 = new penumpang(102, "Davina Hanifa");

        garuda.setPenumpang(p1);
        garuda.setPenumpang(p2);
        
        garuda.tampilkanData();
    }
}
