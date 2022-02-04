package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Buses extends Transportes{
    private ArrayList <Alumnos> alumnos;
    private int sillas;
    private int depie;

    public Buses() {
        super();
    }

    public Buses(int placa, String color, ArrayList <Transportistas>  transportista, ArrayList<Rutas> rutas, ArrayList<Alumnos> alumnos, int sillas, int depie) {
        super( placa, color, transportista, rutas);
        this.alumnos = alumnos;
        this.sillas = sillas;
        this.depie = depie;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        if (alumnos.size() <= sillas + depie){
            this.alumnos = alumnos;
        }
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
        return super.toString() + "alumnos=" + alumnos + ", sillas=" + sillas + ", depie=" + depie;
    }
    
}
