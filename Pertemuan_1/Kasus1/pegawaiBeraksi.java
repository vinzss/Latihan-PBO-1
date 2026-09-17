/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_1.Kasus1;

/**
 *
 * @author Calvin
 */
public class pegawaiBeraksi {
    public static void main(String[] args) {
        Pegawai pegawaiku = new Pegawai();
        
        pegawaiku.NIP = 55250010;
        pegawaiku.Nama_pegawai = "Calvin Juniando";
        pegawaiku.Alamat_pegawai = "Jalan Yos Sudarso";
        pegawaiku.Jabatan_pegawai= "Manager Oprasional";
        
        System.out.println("Nomor Induk Pegawai = " + pegawaiku.NIP);
        System.out.println("Nama Pegawai = " + pegawaiku.Nama_pegawai);
        System.out.println("Alamat Pegawai = " + pegawaiku.Alamat_pegawai);
        System.out.println("Jabatan Pegawai = " + pegawaiku.Jabatan_pegawai);
        
    }
}
