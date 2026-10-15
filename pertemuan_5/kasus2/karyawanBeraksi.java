package pertemuan_5.kasus2;

public class karyawanBeraksi {
    public static void main(String[] args) {
        // 1. Membuat objek Karyawan
        Karyawan karyawan1 = new Karyawan("1001", "Calvin", "Jakarta", "Software Engineer", "Laki-laki", "Kristen");
        Karyawan karyawan2 = new Karyawan("1002", "Budi", "Bekasi", "Data Analyst", "Laki-laki", "Islam");

        // 2. Membuat objek DataGaji dengan referensi (relasi) ke objek Karyawan untuk bulan Oktober 2026
        DataGaji gaji1 = new DataGaji("Oktober 2026", 8000000, 2000000, karyawan1);
        DataGaji gaji2 = new DataGaji("Oktober 2026", 7500000, 1500000, karyawan2);

        // 3. Menampilkan Data
        System.out.println("=== DATA PENGGAJIAN KARYAWAN ===");
        gaji1.tampilkanDataGaji();
        gaji2.tampilkanDataGaji();
    }
}