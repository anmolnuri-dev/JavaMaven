package org.example;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student(101,"Anmol","anmolnuri@gmail.com", "IT");
        String department = s1.getDepartment();
        System.out.println(department);
        s1.setDepartment("Engineering");
        department = s1.getDepartment();
        System.out.println(department);
    }
}
