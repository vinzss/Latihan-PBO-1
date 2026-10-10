package Peretemuan_4;

public class kasus3_beraksi {
    public static void main(String[] args) {
        // Membuat objek dari class persegiPanjang
        kasus3 ksk3 = new kasus3();

        // Mengatur nilai panjang: 50 dan lebar: 100
        ksk3.setpanjang(50);
        ksk3.setlebar(100);

        // Menampilkan output sesuai format
        System.out.println("Panjang : " + ksk3.getPanjang() + " cm");
        System.out.println("Lebar   : " + ksk3.getLebar() + " cm");
        System.out.println("Luas    : " + ksk3.getLuas() + " cm");
    }
}
