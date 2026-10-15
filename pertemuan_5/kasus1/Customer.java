package pertemuan_5.kasus1;

public class Customer {
    String nama;
    Orders order;

    public Customer(String nama) {
        this.nama = nama;
    }

    // Perbaikan pada parameter dan penambahan tutup kurung kurawal
    public void buatOrder(Orders o) {
        this.order = o;
    }

    public void tampilkanData() {
        System.out.println("Nama Customer : " + nama);
        if (order != null) {
            System.out.println("Nomor Invoice : " + order.invoice);
            System.out.println("Tanggal Order : " + order.tanggal);
        } else {
            System.out.println("Belum ada order.");
        }
        System.out.println("----------------------------------");
    }
}
