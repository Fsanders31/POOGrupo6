/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sanders.grupo6;

public class Doctor extends Persona {

    private String especialidad;
    private int numColegiado;

    public Doctor(String nombre, String apellido, int edad, double peso, String nacionalidad, String telefono, String email, String especialidad, int numColegiado) {
        super(nombre, apellido, edad, peso, nacionalidad, telefono, email);
        this.especialidad = especialidad;
        this.numColegiado = numColegiado;
    }

    @Override
    public void ocupacion() {
        System.out.println("Doctor, especializado como " + especialidad + ". # colegiado " + numColegiado);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }
}
