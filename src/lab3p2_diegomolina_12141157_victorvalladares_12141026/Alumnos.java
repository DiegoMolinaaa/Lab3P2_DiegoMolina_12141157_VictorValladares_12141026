/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Alumnos extends Personas {
    private int idEstudiantil;
    private ArrayList<Clases> clases= new ArrayList();

    public Alumnos() {
    }

    public Alumnos(int idEstudiantil, String nombre, int identidad, Date fechaNacimiento) {
        super(nombre, identidad, fechaNacimiento);
        this.idEstudiantil = idEstudiantil;
    }

    public int getIdEstudiantil() {
        return idEstudiantil;
    }

    public void setIdEstudiantil(int idEstudiantil) {
        this.idEstudiantil = idEstudiantil;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Alumnos: " +super.toString()+ "ID Estudiantil=" + idEstudiantil + ", Clases=" + clases;
    }
    
}
