package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Mototaxis extends Transportes{

    public Mototaxis() {
        super();
    }
    
    public Mototaxis(String placa, String color) {
        super(placa, color);
    }

    public Mototaxis(String placa, String color, ArrayList <Transportistas>  transportista, ArrayList<Rutas> rutas, ArrayList <Alumnos> alumnos) {
        super( placa, color, transportista, alumnos, rutas);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
