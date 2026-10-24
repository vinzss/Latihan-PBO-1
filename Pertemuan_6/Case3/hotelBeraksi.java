/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Case3;

/**
 *
 * @author Calvin
 */
public class hotelBeraksi {
    public static void main(String[] args) {
        hotel htl = new hotel(505, "ASTON-JKT", 2, "Deluxe Room", 1200000);
        
        customer c1 = new customer(1, "Calvin Juniando", "Jakarta", "0812345", "calvin@email.com");
        customer c2 = new customer(2, "Davina Hanifa", "Jakarta", "0856789", "davina@email.com");

        // Menambahkan relasi agregasi
        htl.addcustomer(c1);
        htl.addcustomer(c2);

        // Menampilkan data
        htl.displayData();
    }
}
