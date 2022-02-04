/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegomolina_12141157_victorvalladares_12141026;

/**
 *
 * @author diego
 */
public class Rutas {
    private String nombreRuta;
    private int x;
    private int y;

    public Rutas() {
    }

    public Rutas(String nombreRuta, int x, int y) {
        this.nombreRuta = nombreRuta;
        this.x = x;
        this.y = y;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rutas:" + "Nombre de Ruta = " + nombreRuta + ", Coordenada X = " + x + ", coordenada Y = " + y;
    }
    
}
