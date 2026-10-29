/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_7.Komposisi.Latihan2;
import java.util.*;
/**
 *
 * @author Calvin
 */
public class mainLibrary {
    public static void main(String[] args) {
        book b1 = new book("Bahasa Inggris 1", "Zidane Zulfan Zhari");
        book b2 = new book("Bahasa Inggris 2", "Yulia Khairunnisa");
        book b3 = new book("Matematika Ekonomi", "Christopher Hosea Wijaya");

        List<book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        library perpus = new library(books);
        List<book> bks = perpus.getTotalBooksInLibrary();

        System.out.println("=== Daftar Buku (Tugas Oleh: Calvin Juniando) ==="); 
        for (book bk : bks) {
            System.out.println("Judul : " + bk.title + " dan Pengarang : " + bk.author);
        }
    }
}
