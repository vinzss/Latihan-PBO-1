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
public class studenAgregasi_Beraksi {
    public static void main(String[] args) {
        student_Agregasi s1 = new student_Agregasi("Mia", 1, "CSE");
        student_Agregasi s2 = new student_Agregasi("Priya", 2, "CSE");
        student_Agregasi s3 = new student_Agregasi("John", 1, "EE");
        student_Agregasi s4 = new student_Agregasi("Rahul", 2, "EE");

        List<student_Agregasi> cse_students = new ArrayList<>();
        cse_students.add(s1);
        cse_students.add(s2);

        List<student_Agregasi> ee_students = new ArrayList<>();
        ee_students.add(s3);
        ee_students.add(s4);

        departement_Agregasi CSE = new departement_Agregasi("CSE", cse_students);
        departement_Agregasi EE = new departement_Agregasi("EE", ee_students);

        List<departement_Agregasi> departments = new ArrayList<>();
        departments.add(CSE);
        departments.add(EE);

        institute_Agregasi institute = new institute_Agregasi("BITS", departments);
        System.out.print("Total siswa adalah: ");
        System.out.println(institute.getTotalStudentsInInstitute());
    }
}
