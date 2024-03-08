/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sanders.grupo6;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double peso;
    protected String nacionalidad;
    protected String telefono;
    protected String email;

    public Persona(String nombre, String apellido, int edad, double peso, String nacionalidad, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void ocupacion();

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Apellido: " + apellido + "\n"
                + "Edad: " + edad + " años\n"
                + "Peso: " + peso + " kg\n"
                + "Nacionalidad: " + nacionalidad + "\n"
                + "Teléfono: " + telefono + "\n"
                + "Email: " + email;
    }
}

