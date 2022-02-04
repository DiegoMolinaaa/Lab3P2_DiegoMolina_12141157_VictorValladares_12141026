package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Taxis extends Transportes {
    private int numtaxi;
    private int capacidad;

    public Taxis() {
        super();
    }

    public Taxis(int placa, String color, ArrayList <Transportistas>  transportista, ArrayList<Rutas> rutas,int numtaxi, int capacidad) {
        super( placa, color, transportista, rutas);
        this.numtaxi = numtaxi;
        this.capacidad = capacidad;
    }

    

    public int getNumtaxi() {
        return numtaxi;
    }

    public void setNumtaxi(int numtaxi) {
        this.numtaxi = numtaxi;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString() + "numtaxi=" + numtaxi + ", capacidad=" + capacidad;
    }
    
    
}
