package pertemuan_5.kasus2;

public class Karyawan {
    private String nip;
    private String nama;
    private String alamat;
    private String jabatan;
    private String jenisKelamin;
    private String agama;

    // Menggunakan Konstruktor untuk inisialisasi data
    public Karyawan(String nip, String nama, String alamat, String jabatan, String jenisKelamin, String agama) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
    }

    // Method Getter untuk mengambil data (karena atribut bersifat private)
    public String getNip() { return nip; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getJabatan() { return jabatan; }
    public String getJenisKelamin() { return jenisKelamin; }
    public String getAgama() { return agama; }
}