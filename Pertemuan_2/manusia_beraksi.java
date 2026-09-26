package Pertemuan_2;

public class manusia_beraksi {
    static void main(String[] args) {
        manusia mns = new manusia();
        mns.getPrint();

        System.out.println("Nama          :" + mns.nama);
        System.out.println("jenis kelamin :" + mns.jeniskelamin);
        System.out.println("Alamat        :" + mns.alamat );
        System.out.println("Usia          :" + mns.usia);
    }
}
