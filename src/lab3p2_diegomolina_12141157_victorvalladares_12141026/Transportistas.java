package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.Date;


public class Transportistas extends Personas{
    private int aniosExperiencia;
    private String apodo;

    public Transportistas() {
        super();
    }

    public Transportistas(int aniosExperiencia, String apodo, String nombre, long identidad, Date fechaNacimiento) {
        super(nombre, identidad, fechaNacimiento);
        this.aniosExperiencia = aniosExperiencia;
        this.apodo = apodo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Transportistas: "+super.toString()+ "Años de Experiencia = " + aniosExperiencia + ", Apodo=" + apodo;
    }
    
    
}
