package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Mototaxis extends Transportes{
    private int alumnos;

    public Mototaxis() {
        super();
    }

    public Mototaxis(String placa, String color, ArrayList <Transportistas>  transportista, ArrayList<Rutas> rutas, int alumnos) {
        super( placa, color, transportista, rutas);
        this.alumnos = alumnos;
    }

    public Mototaxis(int alumnos, String placa, String color) {
        super(placa, color);
    }
    

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        if (alumnos <= 2 && alumnos > -1){
            this.alumnos = alumnos;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "alumnos=" + alumnos;
    }
    
    
}
