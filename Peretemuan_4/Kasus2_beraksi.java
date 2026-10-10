package Peretemuan_4;
//calvin juniando
public class Kasus2_beraksi {
    public static void main(String[] args) {
        kasus2 ksk2 = new kasus2();

        // Memberikan nilai atribut menggunakan setter
        ksk2.setNim("50220060");
        ksk2.setNama("Kevin Sandjaja");
        ksk2.setJurusan("Teknik Informatika");
        ksk2.setMataKuliah("Pemrograman Berorientasi Objek");

        // Menampilkan data menggunakan getter
        System.out.println("Nomor Induk Mahasiswa = " + ksk2.getNim());
        System.out.println("Nama Mahasiswa         = " +ksk2.getNama());
        System.out.println("Jurusan Mahasiswa      = " +ksk2.getJurusan());
        System.out.println("Mata Kuliah Mahasiswa  = " +ksk2.getMataKuliah());
        }
}
