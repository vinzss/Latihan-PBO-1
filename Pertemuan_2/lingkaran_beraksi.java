package Pertemuan_2;

public class lingkaran_beraksi {
    static void main(String[] args) {
        lingkaran lng = new lingkaran();
        lng.pi = 3.141592;
        lng.r = 6;
        lng.keliling = 2*lng.pi* lng.r;
        System.out.println("keliling lingkaran = " + lng.keliling);
    }
}
