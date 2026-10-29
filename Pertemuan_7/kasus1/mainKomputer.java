/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_7.kasus1;

/**
 *
 * @author Calvin
 */
public class mainKomputer {
    public static void main(String[] args) {
        Komputer komputerKu = new Komputer("ASUS ExpertBook Flip", "B5302FEA-LG7110T");
        
        CPU cpuKu = new CPU("intel Core i7");
        keyboard keyboardKu = new keyboard("Logitec");
        mouse mouseKu = new mouse("Wireless HP S4000 Gold");
        
        komputerKu.addKomponen(cpuKu, keyboardKu, mouseKu);
        komputerKu.tampilkanSpesifikasi();
    }
}
