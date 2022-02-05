/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Personas {
    SimpleDateFormat df = new  SimpleDateFormat("yyyy/MM/dd");
    private String nombre;
    private long identidad;
    private Date fechaNacimiento;

    public Personas() {
    }

    public Personas(String nombre, long identidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getIdentidad() {
        return identidad;
    }

    public void setIdentidad(long identidad) {
        this.identidad = identidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + ", Identidad = " + identidad + ", Fecha de Nacimiento = " + df.format(fechaNacimiento)+", ";
    }
    

}
