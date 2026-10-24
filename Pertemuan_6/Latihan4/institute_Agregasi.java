/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Latihan4;
import java.util.*;

/**
 *
 * @author Calvin
 */
public class institute_Agregasi {
    String instituteName;
    private List<departement_Agregasi> departments;

    institute_Agregasi(String instituteName, List<departement_Agregasi> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public int getTotalStudentsInInstitute() {
        int noOfStudents = 0;
        List<student_Agregasi> students;
        for (departement_Agregasi dept : departments) {
            students = dept.getStudents();
            for (student_Agregasi s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
