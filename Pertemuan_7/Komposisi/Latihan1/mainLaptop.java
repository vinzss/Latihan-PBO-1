/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_7.Komposisi.Latihan1;

/**
 *
 * @author Calvin
 */
public class mainLaptop {
    public static void main(String[] args) {
        laptop laptop1 = new laptop("Asus", "a452");
        laptop1.addKomponen(new cpu("inten core i7"),new vga("Nvidia",8));
        laptop1.displayData();
        System.out.println("");
        laptop laptop2 = new laptop("Toshiba", "6053");
        laptop2.addKomponen(new cpu("inten core i5"),new vga("Nvidia",4));
        laptop2.displayData();
    }
    private static final System.Logger LOG = System.getLogger(mainLaptop.class.getName());
}
