package Pertemuan_3;
//calvin
public class Matematika {
    int a, b;
    double total;

    void pertambahan(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    void perkalian(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    void pengurangan(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    void pembagian(int a, int b) {
        // Menggunakan (double) agar hasil pembagian bisa berupa desimal (contoh: 5 / 2 = 2.5)
        System.out.println(a + " / " + b + " = " + ((double) a / b));
    }
}