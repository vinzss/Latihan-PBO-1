package Pertemuan_2;

public class kotak_bearaksi {
    static void main(String[] args) {
//        creat object dan instansiasi ke class kotak
        Kotak ktk = new Kotak();
        ktk.panjang = 4.0;
        ktk.lebar = 3.0;
        ktk.tinggi = 4.0;
        double volume;
        volume = ktk.panjang* ktk.lebar* ktk.tinggi;
        System.out.println("hasil volume kotak = " + volume + " Cm");
    }
}
