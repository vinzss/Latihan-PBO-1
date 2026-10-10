package Peretemuan_4;

public class kasus4_Beraksi {
    public static void main(String[] args) {
        // Membuat objek dari class encapsulasiBuku
        kasus4 ksk4 = new kasus4();

        // Mengisi nilai variabel menggunakan method setter
        ksk4.setTitle("Pengantar pemrograman berbasis object dengan PHP");
        ksk4.setAuthor("Budi Santoso");
        ksk4.setIsbn("978-623-00-4078-8");
        ksk4.setPrice(50000);
        ksk4.setYear(2022);

        // Menampilkan output menggunakan method getter
        System.out.println("Judul Buku      = " + ksk4.getTitle());
        System.out.println("Penulis Buku    = " + ksk4.getAuthor());
        System.out.println("ISBN Buku       = " + ksk4.getIsbn());
        System.out.println("Harga Buku      = " + ksk4.getPrice());
        System.out.println("Tahun terbit    = " + ksk4.getYear());
    }
}
