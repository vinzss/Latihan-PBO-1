package Pertemuan_2;
//calvin
import java.util.Scanner;
public class lingkaran2beraksi {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        lingkaran2 lng = new lingkaran2();
        System.out.println("Masukan jari-jari lingkaran = ");
        lng.r = input.nextInt();
        lng.luas = lng.pi*lng.r* lng.r;
        System.out.println("Luas Lingkaran = " + lng.luas);
    }
}
