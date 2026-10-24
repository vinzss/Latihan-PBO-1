/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Latihan4;

/**
 *
 * @author Calvin
 */
import java.util.*; 
public class departement_Agregasi {
    String name;
    private List<student_Agregasi> students;

    departement_Agregasi(String name, List<student_Agregasi> students) {
        this.name = name;
        this.students = students;
    }

    public List<student_Agregasi> getStudents() {
        return students;
    }
}
