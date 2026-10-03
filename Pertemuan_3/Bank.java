package Pertemuan_3;
//calvin
public class Bank {
    int saldo;

    public Bank(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    public void simpanUang(int jumlah) {
        System.out.println("Simpan uang: Rp. " + jumlah);
        saldo += jumlah; // Menambah saldo
        System.out.println("Saldo saat ini: Rp. " + getSaldo());
    }
    public void ambilUang(int jumlah) {
        System.out.println("Ambil uang: Rp. " + jumlah);
        saldo -= jumlah; // Mengurangi saldo
        System.out.println("Saldo saat ini: Rp. " + getSaldo());
    }
    public int getSaldo() {
        return saldo;
    }
}
