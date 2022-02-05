package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Rapiditos extends Transportes{
    private int sillas;
    

    public Rapiditos() {
        super();
    }

    public Rapiditos(int sillas, String placa, String color, ArrayList <Transportistas>  transportista, ArrayList<Alumnos> alumnos, ArrayList<Rutas> rutas) {
        super(placa, color, transportista, alumnos, rutas);
        this.sillas = sillas;
    }

    public Rapiditos(int sillas, String placa, String color) {
        super(placa, color);
        this.sillas = sillas;
    }
    

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    @Override
    public String toString() {
        return super.toString() + ", sillas=" + sillas;
    }
    
    
    
}
