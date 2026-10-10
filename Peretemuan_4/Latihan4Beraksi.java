package Peretemuan_4;

public class Latihan4Beraksi {
    public static void main(String[] args) {
        //create object dan instansiasi
        Latihan4 data = new Latihan4();

        //Gunakan method set untuk isi nilai
        data.setMenu("Ayam Goreng");
        data.setharga(17000);
        data.setSpesial(true);

        //Memanggil Method Get dari Class restoran dan Menampilkannya
        System.out.println("Harga Menu Makanan Rumah Makan ABC ");
        System.out.println("-----------------------------------");
        System.out.println("Menu Makanan         : "+data.getMenu());
        System.out.println("Harga Makanan        : Rp."+data.getHarga());
        System.out.println("Menu Spesial         : "+data.getSpesial());
    }
}
