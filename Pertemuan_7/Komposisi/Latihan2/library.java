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
public class library {
    private final List<book> books;

    public library(List<book> books) {
        this.books = books;
    }

    public List<book> getTotalBooksInLibrary() {
        return books;
    }
}
