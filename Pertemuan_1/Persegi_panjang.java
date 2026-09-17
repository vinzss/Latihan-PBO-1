/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_1;

/**
 *
 * @author Calvin
 */
import java.util.Scanner;
public class Persegi_panjang {
    public static void main(String[] args) {
        int panjang,luas,Lebar;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Panjang Persegi Panjang = ");
        panjang=input.nextInt();
        System.out.println("Masukan Lebar Persegi Panjang = ");
        Lebar=input.nextInt();
        luas=panjang*Lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
    }
}
