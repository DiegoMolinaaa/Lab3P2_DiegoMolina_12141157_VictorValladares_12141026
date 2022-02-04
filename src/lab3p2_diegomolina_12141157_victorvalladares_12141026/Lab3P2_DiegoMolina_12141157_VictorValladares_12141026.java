
package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class Lab3P2_DiegoMolina_12141157_VictorValladares_12141026 {

    static Scanner lea = new Scanner(System.in);
    static ArrayList<Transportistas> transportistas = new ArrayList();
    static ArrayList<Alumnos> alumnos = new ArrayList();
    static ArrayList<Transportes> transportes = new ArrayList();
    static ArrayList<Clases> clases = new ArrayList();
    static ArrayList<Rutas> rutas = new ArrayList();
    public static void main(String[] args) {
        int op=0;
        transportistas.add(new Transportistas(15, "Joche", "Juan Ramon Oliva", 123456789, new Date()));
        alumnos.add(new Alumnos(12140143, "Roberto Rodriguez", 332424424, new Date()));
        transportes.add(new Buses("KJ1241EWIX", "Amarillo",20, 15));
        clases.add(new Clases("Programacion II", 1286));
        clases.add(new Clases("Algebra", 225));
        rutas.add(new Rutas("Plaza Miraflores", 5, 7));
        while(op!=13){
            System.out.println("--------------------------------");
            System.out.println("1) Crear Clase");
            System.out.println("2) Crear Ruta");
            System.out.println("3) Crear Alumno");
            System.out.println("4) Agregar Clase a Alumno");
            System.out.println("5) Crear Transportista");
            System.out.println("6) Crear Transporte");
            System.out.println("7) Simulacion");
            System.out.println("8) Listar Clases");
            System.out.println("9) Listar Estaciones");
            System.out.println("10) Listar Alumnos");
            System.out.println("11) Listar Transportistas");
            System.out.println("12) Listar Transportes");
            System.out.println("13) Salir");
            System.out.print("Ingrese una opcion: ");
            op = lea.nextInt();
            System.out.println("--------------------------------");
            switch(op){
                case 1:{
                    crearClase();
                    break;
                }
                case 2:{
                    crearRuta();
                    break;
                }
                case 3:{
                    crearAlumno();
                    break;
                }
                case 4:{
                    agregarClase();
                    break;
                }
                case 5:{
                    crearTransportista();
                    break;
                }
                case 6:{
                    crearTransporte();
                    break;
                }
                case 7:{
                    do{
                        realizar( menuSimulacion() );
                    }while(true);
                }
                case 8:{
                    listarClases();
                    break;
                }
                case 9:{
                    listarRutas();
                    break;
                }
                case 10:{
                    listarAlumnos();
                    break;
                }
                case 11:{
                    listarTransportistas();
                    break;
                }
                case 12:{
                    listarTransportes();
                    break;
                }
                case 13:{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Ingrese una opcion valida");
                    break;
                }
            }// fin switch
        }//fin while
    }// fin main
    
    public static int menuSimulacion(){
        System.out.println("-----------------------------------------------");
        System.out.println("0. Salir");
        System.out.print("1. Subir alumno a transporte\n" +
                        "2. Bajar alumno\n" +
                        "3. Listar alumnos en un transporte\n" +
                        "4. Escoger transportista\n" +
                        "5. Quitar transportista\n" +
                        "6. Añadir estacion\n" +
                        "7. Quitar estacion\n" +
                        "8. Imprimir transporte\n" +
                        "9. Comenzar\n" +
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        System.out.println("-----------------------------------------------");
        return op;
    }
    
    
    public static void crearClase(){
        lea.nextLine();
        System.out.print("Ingrese el nombre de la clase: ");
        String nombreClase = lea.nextLine();
        System.out.print("Ingrese el codigo de la clase: ");
        int codigo = lea.nextInt();
        for (Clases clases : clases){
            if (clases.getCodigo() == codigo){
                System.out.print("codigo ingresado ya existe ingresado ya existe, intente de nuevo: ");
                codigo = lea.nextInt();
            }
        }
        clases.add(new Clases(nombreClase, codigo));
    }
    public static void crearRuta(){
        lea.nextLine();
        System.out.print("Ingrese el nombre de la estacion: ");
        String nombre = lea.nextLine();
        System.out.print("Ingrese una coordenada x: ");
        int x= lea.nextInt();
        System.out.print("Ingrese una coordenada y: ");
        int y = lea.nextInt();
        rutas.add(new Rutas(nombre, x, y));
    }
    public static void crearAlumno(){
        lea.nextLine();
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = lea.nextLine();
        System.out.print("Ingrese el id: ");
        
    }
    public static void agregarClase(){
        System.out.print("Ingrese el numero del alumno que sera asignado la clase[0 a "+(alumnos.size()-1)+"]: ");
        int pos1 = lea.nextInt();
        while(pos1<0 || pos1>(alumnos.size()-1)){
            System.out.println("Debe de ingresar un numero entre los rangos establecidos [0 a "+(alumnos.size()-1)+"]");
            System.out.print("Ingrese el numero del cliente que sera asignado una mascota[0 a "+(alumnos.size()-1)+"]: ");
            pos1 = lea.nextInt();
        }
        System.out.print("Ingrese el numero de la clase que sera asignada al alumno[0 a "+(clases.size()-1)+"]: ");
        int pos2 = lea.nextInt();
        while(pos2<0 || pos2>(clases.size()-1)){
            System.out.println("Debe de ingresar un numero entre los rangos establecidos [0 a "+(clases.size()-1)+"]");
            System.out.print("Ingrese el numero del cliente que sera asignado una mascota[0 a "+(clases.size()-1)+"]: ");
            pos2 = lea.nextInt();
        }
        ((Alumnos)alumnos.get(pos1)).getClases().add(clases.get(pos2));
        System.out.println("Se ha asignado la mascota exitosamente");
    }
    public static void crearTransportista(){
        
    }
    public static void crearTransporte (){
        
    }
    public static void listarClases(){
        for (Object ob : clases) {
            System.out.println(clases.indexOf(ob)+" -> "+clases.toString());
        }
    }
    public static void listarRutas(){
        for (Object ob : rutas) {
            System.out.println(rutas.indexOf(ob)+" -> "+rutas.toString());
        }
    }
    public static void listarAlumnos (){
        for (Object ob : alumnos) {
            System.out.println(alumnos.indexOf(ob)+" -> "+alumnos.toString());
        }
    }
    public static void listarTransportistas(){
        for (Object ob : transportistas) {
            System.out.println(transportistas.indexOf(ob)+" -> "+transportistas.toString());
        }
    }
    public static void listarTransportes(){
        for (Object ob : transportes) {
            System.out.println(transportes.indexOf(ob)+" -> "+transportes.toString());
        }
    }
    
    //----------- Metodos de main ----------------------------------------------
    
    public static void realizar(int op){
        if (op == 0){
            System.exit(0);
        }else if (op == 1){
           
        }else if (op == 2){
          
        }else if (op == 3){
           
        }else if (op == 4){
            
        }else if (op == 5){
            
        }else if (op == 6){
           
        }else if (op == 7){
           
        }else if (op == 8){
            
        }else if (op == 9){
            
        }
    }
    
}
