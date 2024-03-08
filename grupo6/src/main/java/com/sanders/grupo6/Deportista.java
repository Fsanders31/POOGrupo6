/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sanders.grupo6;

public class Deportista extends Persona {

    private String disciplina;
    private String equipo;

    public Deportista(String nombre, String apellido, int edad, double peso, String nacionalidad, String telefono, String email, String disciplina, String equipo) {
        super(nombre, apellido, edad, peso, nacionalidad, telefono, email);
        this.disciplina = disciplina;
        this.equipo = equipo;
    }

    @Override
    public void ocupacion() {
        System.out.println("Deportista, en la disciplina de " + disciplina + ". Formo parte del equipo " + equipo);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
