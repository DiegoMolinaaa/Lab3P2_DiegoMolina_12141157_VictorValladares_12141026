/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.Date;

<<<<<<< HEAD
public class Clases {
=======
public class Clases{
>>>>>>> 0325f7b23d9c8d5320b521544b11b590433bb9bf
    private String nombreClase;
    private int codigo;

    public Clases() {
    }
   

    public Clases(String nombreClase, int codigo) {
        this.nombreClase = nombreClase;
        this.codigo = codigo;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo != this.codigo){
            this.codigo = codigo;
        }
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Clase: " + "nombreClase=" + nombreClase + ", codigo=" + codigo;
=======
        return "Clase: "+"Nombre de Clase = " + nombreClase + ", Codigo = " + codigo;
>>>>>>> 0325f7b23d9c8d5320b521544b11b590433bb9bf
    }
    
    
}
