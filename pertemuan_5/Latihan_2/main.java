package pertemuan_5.Latihan_2;

public class main {
    //main class
    public static void main(String[] args) {
        //create object m1 dan instansiasi ke class mahasiswaRelasi
        mahasiswaRelasi m1 = new mahasiswaRelasi();
        //panggil object dan method set
        m1.setNim("59230047");
        m1.setNama("Andrew Albertius");

        //create object m2 dan instansiasi ke class mahasiswaRelasi
        mahasiswaRelasi m2 = new mahasiswaRelasi();
        //panggil object dan method set
        m2.setNim("56230149");
        m2.setNama("Apriliyana Juslan");

        //create object d dan instansi ke class dosenRelasi
        dosenRelasi d = new dosenRelasi();
        //panggil object dan method set
        d.setKodeDosen("MBL");

        //relasikan class dosen dan mahasiswa
        d.setNimMhs(m1.getNim());
        d.setNimMhs(m2.getNim());

        //Menampilkan data dosen dan mahasiswa
        System.out.println("Kode Dosen = " + d.getKodeDosen());
        System.out.println("Mengajar Mahasiswa");

        //ambil jumlah Mahasiswa
        int jum = d.getJumlahMhs();

        //tampilkan nim mhs yang diajar dosen dengan looping
        for (int i=0; i<jum; i++) {
            System.out.println(" - " + d.getNimMhs(i));
        }
    }
}