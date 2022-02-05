package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Rapiditos extends Transportes{
    private int sillas;
    private ArrayList <Alumnos> alumnos= new ArrayList();

    public Rapiditos() {
        super();
    }

    public Rapiditos(int sillas, String placa, String color, ArrayList <Transportistas>  transportista, ArrayList<Rutas> rutas) {
        super(placa, color, transportista, rutas);
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

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        if (alumnos.size() <= sillas){
            this.alumnos = alumnos;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", sillas=" + sillas + ", alumnos=" + alumnos;
    }
    
    
    
}
