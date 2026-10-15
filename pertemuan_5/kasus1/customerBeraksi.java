package pertemuan_5.kasus1;

public class customerBeraksi {
    public static void main(String[] args) {

        Orders order1 = new Orders("INV-202610-001", "16 Oktober 2026");
        Orders order2 = new Orders("INV-202610-002", "17 Oktober 2026");


        Customer customer1 = new Customer("Calvin");
        Customer customer2 = new Customer("Andi");

        customer1.buatOrder(order1);
        customer2.buatOrder(order2);

        System.out.println("=== DATA ORDER CUSTOMER ===");
        customer1.tampilkanData();
        customer2.tampilkanData();
    }
}
