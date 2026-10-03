package Pertemuan_3;
//calvin
public class BankBeraksi {
    public static void main(String[] args) {
        Bank bankABC = new Bank(100000);

        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());

        bankABC.simpanUang(500000);
        bankABC.ambilUang(150000);
    }
}
