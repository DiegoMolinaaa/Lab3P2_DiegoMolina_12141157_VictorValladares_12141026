package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;

public class Transportes {
    private String placa;
    private String color;
    private ArrayList <Transportistas> transportista = new ArrayList();
    private ArrayList <Rutas> rutas = new ArrayList();

    public Transportes() {
    }

    public Transportes(String placa, String color) {
        this.placa = placa;
        this.color = color;
    }
    
    public Transportes(String placa, String color, ArrayList <Transportistas> transportista, ArrayList<Rutas> rutas) {
        this.placa = placa;
        this.color = color;
        this.transportista = transportista;
        this.rutas = rutas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    public String getColor() {
        return color;
    }

     public void setColor(String color) {
        this.color = color;
    }
    
    public ArrayList <Transportistas> getTransportista() {
        return transportista;
    }

    public void setTransportista(ArrayList <Transportistas> transportista) {
        this.transportista = transportista;
    }

    public ArrayList<Rutas> getRutas() {
        return rutas;
    }

    public void setRutas(ArrayList<Rutas> rutas) {
        this.rutas = rutas;
    }

    @Override
    public String toString() {
        return "Transporte: " + "Placa = " + placa + ", Color = " + color + ", Transportista = " + transportista + ", Estaciones = " + rutas;
    }
    
    
}
