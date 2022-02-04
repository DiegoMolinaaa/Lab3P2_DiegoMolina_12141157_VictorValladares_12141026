package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Taxis extends Transportes {
    private int numtaxi;
    private ArrayList <Alumnos> alumnos;

    public Taxis() {
        super();
    }
    
    public Taxis(int numtaxi, String placa, String color) {
        super(placa, color);
        this.numtaxi = numtaxi;
    }

    public Taxis(String placa, String color, ArrayList <Transportistas>  transportista, ArrayList<Rutas> rutas,int numtaxi, ArrayList <Alumnos> alumnos) {
        super( placa, color, transportista, rutas);
        this.numtaxi = numtaxi;
        this.alumnos = alumnos;
    }

    
    public int getNumtaxi() {
        return numtaxi;
    }

    public void setNumtaxi(int numtaxi) {
        this.numtaxi = numtaxi;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    
    public void setAlumnos(ArrayList <Alumnos> alumnos) {
        if (alumnos.size() <= 4 && alumnos.size() >-1){
            this.alumnos = alumnos;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "numtaxi=" + numtaxi + ", alumnos=" + alumnos;
    }
    
    
}
