package pertemuan_5.Latihan_1;

public class main {
    static void main(String[] args) {
        pegawai pg = new pegawai();
        bank bk = new bank();

        pg.setNama("Calvin juniando");
        bk.setNamaBank("Bank ABC");
        System.out.println(pg.getNama() + " Adalah karyawan dari " + bk.getNamaBank());
    }
}
