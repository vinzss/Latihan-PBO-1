/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_7.Dependence.Latihan3;

/**
 *
 * @author Calvin
 */
public class Aplikasi {
    private String namaplikasi;
    private email e1, e2;

    public email getE1() {
        return e1;
    }

    public email getE2() {
        return e2;
    }

    public Aplikasi(String namaplikasi) {
        this.namaplikasi = namaplikasi;
    }

    public String getNamaplikasi() {
        return namaplikasi;
    }

    public void buatPesan(int nopesan, String judul, String pesan) {
        if (nopesan == 1) {
            e1 = new email(judul, pesan);
        } else {
            e2 = new email(judul, pesan);
        }
    }

    public void kirimPesan(email e, String penerima) {
        e.setKepada(penerima);
        System.out.println("=== Aplikasi Pengirim Pesan (Oleh: Calvin Juniando) ==="); 
        System.out.println(getNamaplikasi());
        System.out.println("Pesan anda terkirim kepada: " + e.getKepada());
        System.out.println("Judul = " + e.getSubjek());
        System.out.println("Isi Pesan = " + e.getPesan());
        System.out.println();
    }

    
    public static void main(String[] args) {
        Aplikasi app = new Aplikasi("Sistem Notifikasi Kwik Kian Gie");
        
        app.buatPesan(1, "Tugas PBO", "Jangan lupa upload tugas ke e-learning.");
        app.kirimPesan(app.getE1(), "Mahasiswa");
    }
}