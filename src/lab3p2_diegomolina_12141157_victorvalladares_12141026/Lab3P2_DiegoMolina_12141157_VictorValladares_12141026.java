
package lab3p2_diegomolina_12141157_victorvalladares_12141026;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Date;
public class Lab3P2_DiegoMolina_12141157_VictorValladares_12141026 {

    static Scanner lea = new Scanner(System.in);//holaaaa
    static DateFormat df = new  SimpleDateFormat("yyyy/MM/dd");
    static ArrayList<Transportistas> transportistas = new ArrayList();
    static ArrayList<Alumnos> alumnos = new ArrayList();
    static ArrayList<Transportes> transportes = new ArrayList();
    static ArrayList<Clases> clases = new ArrayList();
    static ArrayList<Rutas> rutas = new ArrayList();
    static ArrayList <String> tipos = new ArrayList ();
    static ArrayList<Alumnos> alumnosSim = new ArrayList();
    static boolean entra=true;
    public static void main(String[] args) throws ParseException {
        int op=0;
        DateFormat df = new  SimpleDateFormat("yyyy/MM/dd");
        transportistas.add(new Transportistas(15, "Joche", "Juan Ramon Oliva", 123456789, df.parse(df.format(new Date()))));
        alumnos.add(new Alumnos(12140143, "Roberto Rodriguez", 332424424, df.parse(df.format(new Date()))));
        transportistas.add(new Transportistas(15, "Joche", "Juan Ramon Oliva", 123456789, df.parse("1966/03/5")));
        alumnos.add(new Alumnos(12140143, "Roberto Rodriguez", 332424424, df.parse("2001/07/22")));
        alumnos.add(new Alumnos(12141026, "Kristian Molina", 346291721, df.parse("2002/05/21")));
        transportes.add(new Buses("KJ1241EWIX", "Amarillo",20, 15));
        clases.add(new Clases("Programacion II", 1286));
        clases.add(new Clases("Algebra", 225));
        rutas.add(new Rutas("Plaza Miraflores", 5, 7));
        rutas.add(new Rutas("Mall Dorado", 1, 2));
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
                    System.out.print("Escogera el transporte a utilizar. Ingrese un numero entre [0 a "+(transportes.size()-1)+"]: ");
                    int pos = lea.nextInt();
                    do{
                        realizar( menuSimulacion(), pos );
                    }while(entra==true);
                    break;
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
                        "6. A???adir estacion\n" +
                        "7. Quitar estacion\n" +
                        "8. Imprimir transporte\n" +
                        "9. Comenzar\n" +
                        "10. Destruir el bus\n" +
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
    public static void crearAlumno() throws ParseException{
        lea.nextLine();
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = lea.nextLine();
        System.out.print("Ingrese el id: ");
        int id = lea.nextInt();
        for (Alumnos alumnos : alumnos){
            if (alumnos.getIdEstudiantil()== id){
                System.out.print("Id ingresado ya existe ingresado ya existe, intente de nuevo: ");
                id = lea.nextInt();
            }
        }
        System.out.print("Ingrese identidad: ");
        long identidad = lea.nextLong();
        for (Alumnos alumnos : alumnos){
            if (alumnos.getIdentidad()== identidad){
                System.out.print("la identidad ingresada ya existe , intente de nuevo: ");
                identidad = lea.nextLong();
            }
        }
        System.out.print("Ingrese su fecha de nacimiento con el formato [yyyy/mm/dd]: ");
        String fechaN = lea.next();
        Date fecha;
        
        fecha = df.parse(fechaN);
        alumnos.add(new Alumnos(id, nombre, identidad, fecha));
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
    public static void crearTransportista() throws ParseException{
        lea.nextLine();
        System.out.print("Ingrese el nombre del transportista: ");
        String nombre = lea.nextLine();
        System.out.print("Ingrese el apodo del transportista: ");
        String apodo = lea.nextLine();
        System.out.print("Ingrese los a???os de experiencia: ");
        int a = lea.nextInt();
        System.out.print("Ingrese identidad: ");
        long identidad = lea.nextLong();
        for (Transportistas transportistas : transportistas){
            if (transportistas.getIdentidad() == identidad){
                System.out.print("la identidad ingresada ya existe ingresado ya existe, intente de nuevo: ");
                identidad = lea.nextLong();
            }
        }
        System.out.print("Ingrese su fecha de nacimiento con el formato [yyyy/mm/dd]: ");
        String fechaN = lea.next();
        Date fecha;
        DateFormat df = new  SimpleDateFormat("yyyy/MM/dd");
        fecha = df.parse(fechaN);
        transportistas.add(new Transportistas(a, apodo, nombre, identidad, fecha));
    }
    public static void crearTransporte (){
        lea.nextLine();
        System.out.print("Ingrese la placa: ");
        String placa = lea.next();
        for (Transportes transportes : transportes){
            if (transportes.getPlaca().equalsIgnoreCase(placa)){
                System.out.print("la placa ingresada ya existe ingresado ya existe, intente de nuevo: ");
                placa = lea.next();
            }
        }
        System.out.print("Ingrese el color del transporte: ");
        String color = lea.next();
        System.out.print("Ingrese el tipo de transporte: ");
        String tipo = lea.next();
        if (tipo.equalsIgnoreCase("Buses")){
            System.out.print("Ingrese la cantidad de sillas: ");
            int sillas = lea.nextInt();
            System.out.print("Ingrese la cantidad de personas que pueden ir paradas: ");
            int depie = lea.nextInt();
            transportes.add(new Buses(placa,color,sillas, depie));
        }else if (tipo.equalsIgnoreCase("Rapiditos")){
            System.out.print("Ingrese la cantidad de sillas: ");
            int sillasR = lea.nextInt();
            transportes.add(new Rapiditos(sillasR, placa, color));
        }else if (tipo.equalsIgnoreCase("Mototaxi")){
            transportes.add(new Mototaxis (placa,color));
        }else if (tipo.equalsIgnoreCase("taxi")){
            System.out.print("Ingrese el numero del taxi: ");
            int num = lea.nextInt();
            transportes.add(new Taxis(num, placa, color));    
        }
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
    //static Buses buses = new Buses ();
    public static void realizar(int op, int pos){
        if (op == 0){
            entra=false;
        }else if (op == 1){
            subirAlumno(pos);
        }else if (op == 2){
            bajarAlumno(pos);
        }else if (op == 3){
           listarAlumnosTransporte(pos);
        }else if (op == 4){
            escogerTransportista(pos);
        }else if (op == 5){
            quitarTransportista(pos);
        }else if (op == 6){
           agregarEstacion(pos);
        }else if (op == 7){
           quitarEstacion(pos);
        }else if (op == 8){
            imprimirTransporte(pos);
        }else if (op == 9){
            simulacion(pos);
        }
        else if (op == 10){
            destruirTransporte(pos);
        }
    }
    public static void escogerTransportista(int pos){
        if((transportes.get(pos).getTransportista().size())==0){
            System.out.print("Ingrese un numero entre [0 a "+(transportistas.size()-1)+"]: ");
            int num = lea.nextInt();
            ((Transportes)transportes.get(pos)).getTransportista().add(transportistas.get(num));
            System.out.println("Se ha agregado el transportista exitosamente");
        }
        else{
            System.out.println("Ya hay un Transportista asignado");
        }
    }
    public static void quitarTransportista(int pos){
        if((transportes.get(pos).getTransportista().size())==0){
            System.out.println("No hay transportista asignado");
        }
        else{
            transportes.get(pos).getTransportista().remove(0);
            System.out.println("Se ha eliminado el transportista exitosamente");
        }
    }
    public static void agregarEstacion(int pos){
        System.out.print("Ingrese el nombre de la Estacion: ");
        lea.nextLine();
        String nom = lea.nextLine();
        System.out.print("Ingrese la coordenada x: ");
        int x = lea.nextInt(0);
        System.out.print("Ingrese la coordenada : ");
        int y = lea.nextInt(0);
        transportes.get(pos).getRutas().add(new Rutas(nom, x, y));
    }
    public static void quitarEstacion(int pos){
        System.out.print("Ingrese la posicion de la estacion que desea eliminar [0 a"+(rutas.size()-1)+"]: ");
        int num = lea.nextInt();
        transportes.get(pos).getRutas().remove(num);
    }
    public static void imprimirTransporte(int pos){
        if(transportes.size()==0){
            System.out.println("No hay transportes ");
        }
        else{
            System.out.println(transportes.get(pos));
        }
    }
    public static void listarAlumnosTransporte(int pos){ 
        for (Transportes trans : transportes) {
            System.out.println(transportes.indexOf(trans)+": "+transportes.get(pos).getAlumnos());
        }
    }
    public static void subirAlumno(int pos){
        System.out.print("Ingrese un numero entre [0 a "+(alumnos.size()-1)+"]: ");
        int num = lea.nextInt();
        ((Transportes)transportes.get(pos)).getAlumnos().add(alumnos.get(num));
        alumnos.remove(num);
        
    }
    public static void simulacion(int pos){
        int x1 = 0;
        int y1 = 0;
        int i = 0;
        ArrayList <Double> distancias = new ArrayList ();
        for (Transportes transporte : transportes){
            ((Transportes)transportes.get(pos)).getRutas().add(rutas.get(i));
        }
        for (int j = 0; i <  rutas.size(); i++){
            double XC = Math.pow(rutas.get(i).getX(), 2);
            double XY = Math.pow(rutas.get(i).getY(), 2);
            double XmasY = XC + XY;
            double distancia = Math.sqrt(XmasY);
            distancias.add(distancia);
            //System.out.println(distancia);
        }
        Collections.sort(distancias);
        for (int j = 0; j < ((Transportes)transportes.get(pos)).getAlumnos().size(); j++) {
            //if (((Transportes)transportes.get(pos)).getAlumnos().size() <= rutas.size()){
                for (int h = 0; h < ((Transportes)transportes.get(pos)).getAlumnos().size()/rutas.size(); h++){
                    System.out.println("El alumno que se ha bajado fue : " + transportes.get(pos).getAlumnos().get(h));
                    rutas.remove(h);
                    transportes.get(pos).getAlumnos().remove(h);
                }   
            /*}else{
                System.out.println("No hay suficientes alumnos para bajarse");
                System.exit(0);
            }*/
        }
    }
    public static void bajarAlumno(int pos){
        System.out.print("Ingrese un numero entre [0 a "+(alumnos.size()-1)+"]: ");
        int num = lea.nextInt();
        ((Transportes)transportes.get(pos)).getAlumnos().remove(alumnos.get(num));
    }
    public static void destruirTransporte(int pos){
        System.out.println("Noticia de Ultimo Momento: Transporte Escolar Explota ");
        System.out.println("Descripcion del Transporte: ");
        System.out.println("Color: "+transportes.get(pos).getColor()+"\nPlaca: "+transportes.get(pos).getPlaca());
        System.out.println("Muertos Confirmados");
        for (Transportes ob : transportes) {
            if(transportes.get(pos).getAlumnos().size()==0){
                System.out.println("No hubieron estudiantes muertos");
            }
            else{
                System.out.println("Estudiantes:");
                System.out.println(transportes.indexOf(ob)+":  "+transportes.get(pos).getAlumnos());
            }
        }
        System.out.println("");
        for (Transportes ob : transportes){
            if(transportes.get(pos).getTransportista().size()==0){
                System.out.println("El conductor pudo escapar");
            }
            else{
                System.out.println("Transportista:");
                System.out.println(transportes.indexOf(ob)+":  "+transportes.get(pos).getTransportista());
                System.out.println("");
            }
            
        }
        System.out.println("");
        transportes.remove(pos);
    }
}
