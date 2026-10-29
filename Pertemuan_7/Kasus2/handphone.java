/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_7.Kasus2;

/**
 *
 * @author Calvin
 */
public class handphone {
    private battery Battery;
    private camera Camera;
    private cpu Cpu;
    private memory Memory;
    private String merk;
    private String pabrikan;

    public handphone(String merk, String pabrikan, battery Battery, camera Camera, cpu Cpu, memory Memory) {
        this.merk = merk;
        this.pabrikan = pabrikan;
        this.Battery = Battery;
        this.Camera = Camera;
        this.Cpu = Cpu;
        this.Memory = Memory;
    }

    public String spesifikasi() {
        return "Spesifikasi Handphone:\n" +
               "- CPU: " + Cpu.cpu_Name + " (" + Cpu.cpu_Speed + ", " + Cpu.cpu_Type + ")\n" +
               "- Kamera Depan: " + Camera.front + ", Kamera Belakang: " + Camera.back + "\n" +
               "- Memori Internal: " + Memory.internal + ", Memori Eksternal: " + Memory.external + "\n" +
               "- Baterai: " + Battery.capacity;
    }

    public String tampilkan() {
        return "Handphone " + merk + " buatan " + pabrikan + "\n" + spesifikasi();
    }
}
