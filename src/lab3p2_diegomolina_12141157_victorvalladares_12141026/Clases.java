/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.Date;

public class Clases {
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
        return "Clase: " + "nombreClase=" + nombreClase + ", codigo=" + codigo;
    }
    
    
}
