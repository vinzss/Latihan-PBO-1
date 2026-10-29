/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_7.kasus1;

/**
 *
 * @author Calvin
 */
public class Komputer {
    private final String merkKomputer;
    private final String tipe;
    private keyboard keyboard;
    private CPU cpu;
    private mouse mouse;

    public Komputer(String merkKomputer, String tipe) {
        this.merkKomputer = merkKomputer;
        this.tipe = tipe;
    }

    public void addKomponen(CPU cpu, keyboard keyboard,mouse mouse) {
        this.cpu = cpu;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void tampilkanSpesifikasi() {
        System.out.println("Komputer " + merkKomputer + " dengan tipe " + tipe);
        System.out.println("Mempunyai Spesifikasi Hardware Sebagai Berikut :");
        System.out.println("1. " + cpu.getNama());
        System.out.println("2. " + keyboard.getMerk());
        System.out.println("3. " + mouse.getMerk());
        System.out.println("BUILD SUCCESSFUL (Oleh: Calvin Juniando)");
    }
}
