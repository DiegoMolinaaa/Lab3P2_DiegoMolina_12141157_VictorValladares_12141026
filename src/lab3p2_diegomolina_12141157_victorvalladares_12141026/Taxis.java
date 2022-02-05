package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Taxis extends Transportes {
    private int numtaxi;

    public Taxis() {
        super();
    }
    
    public Taxis(int numtaxi, String placa, String color) {
        super(placa, color);
        this.numtaxi = numtaxi;
    }

    public Taxis(String placa, String color, ArrayList <Transportistas>  transportista, ArrayList<Rutas> rutas,int numtaxi, ArrayList <Alumnos> alumnos) {
        super( placa, color, transportista, alumnos, rutas);
        this.numtaxi = numtaxi;
    }

    
    public int getNumtaxi() {
        return numtaxi;
    }

    public void setNumtaxi(int numtaxi) {
        this.numtaxi = numtaxi;
    }

    @Override
    public String toString() {
        return super.toString() + ", numtaxi=" + numtaxi;
    }
    
    
}
