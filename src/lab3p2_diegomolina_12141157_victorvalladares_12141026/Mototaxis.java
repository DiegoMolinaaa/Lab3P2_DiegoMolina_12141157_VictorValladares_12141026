package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Mototaxis extends Transportes{
    private int alumnos;

    public Mototaxis() {
        super();
    }

    public Mototaxis(int placa, String color, ArrayList <Transportistas>  transportista, ArrayList<Rutas> rutas, int alumnos) {
        super( placa, color, transportista, rutas);
        this.alumnos = alumnos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return super.toString() + "alumnos=" + alumnos;
    }
    
    
}
