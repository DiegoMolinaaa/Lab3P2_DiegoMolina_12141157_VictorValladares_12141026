package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Mototaxis extends Transportes{
    private ArrayList <Alumnos> alumnos;

    public Mototaxis() {
        super();
    }
    
    public Mototaxis(String placa, String color) {
        super(placa, color);
    }

    public Mototaxis(String placa, String color, ArrayList <Transportistas>  transportista, ArrayList<Rutas> rutas, ArrayList <Alumnos> alumnos) {
        super( placa, color, transportista, rutas);
        this.alumnos = alumnos;
    }

    

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList <Alumnos> alumnos) {
        if (alumnos.size() <= 2 && alumnos.size() > -1){
            this.alumnos = alumnos;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", alumnos=" + alumnos;
    }
    
    
}
