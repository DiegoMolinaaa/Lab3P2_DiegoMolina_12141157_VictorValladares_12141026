package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Buses extends Transportes{
    
    private int sillas;
    private int depie;

    public Buses() {
        super();
    }

    public Buses(String placa, String color, ArrayList <Transportistas>  transportista, ArrayList<Rutas> rutas, ArrayList<Alumnos> alumnos, int sillas, int depie) {
        super( placa, color, transportista, alumnos, rutas);
        this.sillas = sillas;
        this.depie = depie;
    }

    public Buses(String placa, String color, int sillas, int depie) {
        super(placa, color);
        this.sillas = sillas;
        this.depie = depie;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public int getDepie() {
        return depie;
    }

    public void setDepie(int depie) {
        this.depie = depie;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sillas=" + sillas + ", De Pie=" + depie;
    }
    
}
