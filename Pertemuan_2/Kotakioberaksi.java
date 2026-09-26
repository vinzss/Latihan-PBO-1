package Pertemuan_2;
import java.util.Scanner;
public class Kotakioberaksi {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KotakIo ktk = new KotakIo();
        System.out.print("Masukan Tinggi kotak  = ");
        ktk.tinggi = input.nextDouble();
        System.out.print("Masukan Lebar kotak   = ");
        ktk.lebar = input.nextDouble();
        System.out.print("Masukan Panjang kotak = ");
        ktk.panjang = input.nextDouble();
        ktk.cetakKotak();

    }
}
