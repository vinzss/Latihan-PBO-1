/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_7.Komposisi.Latihan1;

/**
 *
 * @author Calvin
 */
public class laptop {
    private String merk,tipe;
    private cpu cpu;
    private vga vga;

    public laptop(String merk, String tipe) {
        this.merk = merk;
        this.tipe = tipe;
    }
    public void addKomponen(cpu cpu, vga vga){
        this.cpu = cpu;
        this.vga = vga;
    }
    public void displayData(){
        System.out.println("Laptop"+ this.merk + " dengan Spesifikasi " + this.tipe);
        System.out.println("Memiliki Spesifikasi");
        System.out.println(" -" + cpu.getNama());
        System.out.println(" -" + vga.getnama()+ "dengan Kapasitas" + vga.getKapasitas()+"");
    } 
}
