package pertemuan_5.kasus2;

public class DataGaji {
    private String bulan;
    private int gapok;
    private int tunjangan;
    private int totalGaji;

    // Relasi dengan class Karyawan (Many to One)
    private Karyawan pegawai;

    public DataGaji(String bulan, int gapok, int tunjangan, Karyawan pegawai) {
        this.bulan = bulan;
        this.gapok = gapok;
        this.tunjangan = tunjangan;
        this.pegawai = pegawai;
        this.totalGaji = gapok + tunjangan; // Total otomatis dihitung
    }

    public void tampilkanDataGaji() {
        // Mengambil data dari objek pegawai (class Karyawan)
        System.out.println("NIP Karyawan   : " + pegawai.getNip());
        System.out.println("Nama Karyawan  : " + pegawai.getNama());
        System.out.println("Jabatan        : " + pegawai.getJabatan());

        // Menampilkan data dari class DataGaji itu sendiri
        System.out.println("Bulan          : " + bulan);
        System.out.println("Gaji Pokok     : Rp " + gapok);
        System.out.println("Tunjangan      : Rp " + tunjangan);
        System.out.println("Total Gaji     : Rp " + totalGaji);
        System.out.println("------------------------------------------");
    }
}
