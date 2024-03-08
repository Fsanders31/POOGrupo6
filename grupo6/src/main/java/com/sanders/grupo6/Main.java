/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sanders.grupo6;

public class Main {

    public static void main(String[] args) {

        Doctor doctor = new Doctor("Ivan", "Lopez", 45, 80.5, "Hondureño", "88761554", "lopezivan1889@gmail.com",
                "Cirugía Plástica", 45561);

        System.out.println(doctor);
        doctor.ocupacion();

    }
}
