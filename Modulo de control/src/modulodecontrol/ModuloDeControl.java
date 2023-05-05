package modulodecontrol;
import java.util.Scanner;
import models.Estado;
import static models.Estado.estados;
import models.Localidad;
import static models.Localidad.localidades;
import models.Municipio;
import static models.Municipio.municipios;
/**
 *
 * @author chanp
 */
public class ModuloDeControl {
    static Scanner input = new Scanner(System.in);
    
    
    public static void agregarEstado(){
        System.out.println("-------------------Agregar nuevo estado-------------------");
        System.out.println("Id: ");
        int estadoId = input.nextInt();
        System.out.println("Nuevo Estado: ");
        String nombreEstado = input.next();
        System.out.println("Cantidad de poblacion: ");
        int poblacionEstado = input.nextInt();
        
        estados.add(new Estado(estadoId, nombreEstado, poblacionEstado));
    }
    
    public static void leerEstados(){
        estados.add(new Estado(1, "Hidalgo", 3000083));
        estados.add(new Estado(1, "Guerrero", 3000541));
        System.out.println(estados.toString());
    }
    
    public static void actualizarEstado(){
        System.out.println("-------------------Modificar estado-------------------");
        System.out.println("Id: ");
        int estadoId = input.nextInt();
        System.out.println("Ingrese los nuevos datos del estado");
        System.out.println("Nombre: ");
        String nombreEstado = input.next();
        System.out.println("Poblacion: ");
        int poblacionEstado = input.nextInt();
        
        estados.get(estadoId).setNombreEstado(nombreEstado);
        estados.get(estadoId).setPoblacionEstado(poblacionEstado);
        System.out.println("Los datos se han actuakizado correctamente");
    }
    
    public static void eliminarEstado(){
        System.out.println("-------------------Eliminar estado-------------------");
        System.out.println("Ingresa el Id: ");
        int estadoId = input.nextInt();
        estados.remove(estadoId);
        System.out.println("El estado se borrro de forma exitosa");
    }
    
    public static void agregarMunicipio(){
        System.out.println("-------------------Agregar nuevo municipio-------------------");
        System.out.println("Id: ");
        int municipioId = input.nextInt();
        System.out.println("Nombre: ");
        String nombreMunicipio = input.next();
        System.out.println("Poblacion: ");
        int poblacionMunicipio = input.nextInt();
        municipios.add(new Municipio(municipioId, nombreMunicipio,  poblacionMunicipio));
    }
    
    public static void leerMunicipio(){
       municipios.add(new Municipio(1, "Campeche",  294077));
       municipios.add(new Municipio (2, "Carmen",  248845));
   }
    
    public static void actualizarMunicipio(){
       System.out.println("-------------------Actualizar municipio-------------------");
        System.out.print("Id: ");
        int municipioId = input.nextInt();
        System.out.println("Ingrese los nuevos datos del municipio:");
        System.out.print("Nombre: ");
        String nombreMunicipio = input.next();
        System.out.println("Poblacion: ");
        int poblacionMunicipio = input.nextInt();
        municipios.get(municipioId).setNombreMunicipio(nombreMunicipio);
        municipios.get(municipioId).setPoblacionMunicipio(poblacionMunicipio);
        System.out.println("Los datos se han actualizado exitosamente");
   }
      
    public static void eliminarMunicipio(){
        System.out.println("-------------------Eliminar municipio-------------------");
        System.out.print("Id: ");
        int municipioId = input.nextInt();
        municipios.remove(municipioId);
        System.out.println("El estado se ha eliminado exitosamente");
    }
       
    public static void agregarLocalidad(){
       System.out.println("-------------------Agregar localidad-------------------");
        System.out.println("Id: ");
        int localidadId = input.nextInt();
        System.out.println("Nombre: ");
        String nombreLocalidad = input.next();
        System.out.println("Coloque la cantidad de poblacion de la localidad que desea agregar: ");
        int poblacionLocalidad = input.nextInt();
        localidades.add(new Localidad(localidadId, nombreLocalidad, poblacionLocalidad));
    }
       
    public static void leerlocalidad(){
       localidades.add(new Localidad(0, "Lerma", 8281));
       localidades.add(new Localidad (1, "Hampolol", 1123));
    }
    
     public static void eliminarLocalidad(){
        System.out.println("Ingrese el ID de la localidad que desea eliminar");
        System.out.print("ID: ");
        int localidadId = input.nextInt();
        localidades.remove(localidadId);
        System.out.println("La localidad se ha eliminado de forma exitosa");
    }
    
    public static void actualizarLocalidad(){
       System.out.println("-------------------Actualizar localidad-------------------");
        System.out.print("Id: ");
        int localidadId = input.nextInt();
        System.out.println("Ingrese los nuevos datos del municipio:");
        System.out.print("Nombre: ");
        String nombreLocalidad = input.next();
        System.out.println("Poblacion: ");
        int poblacionLocalidad = input.nextInt();
        localidades.get(localidadId).setNombreLocalidad(nombreLocalidad);
        localidades.get(localidadId).setPoblacionLocalidad(poblacionLocalidad);
        System.out.println("Los datos se han actualizado exitosamente");
    }
     
    public static void menu(){
       System.out.println("Elige una opcion");
       System.out.println("Estados:");
       System.out.println("Agregar estado a la lista.......................1");
       System.out.println("Leer lista de estados...........................2");
       System.out.println("Eliminar estado de la lista.....................3");
       System.out.println("Municipios:");
       System.out.println("Agregar municipio a la lista....................4");
       System.out.println("Leer lista de municipios........................5");
       System.out.println("Eliminar municipio de la lista..................6");
       System.out.println("Localidades");
       System.out.println("Agregar localidad a la lista....................7");
       System.out.println("Leer lista de localidades.......................8");
       System.out.println("Eliminar localidad de la lista..................9");
       System.out.println("Salir de la app.................................0");
    }
      
       public static void opciones(int opcion){
       switch (opcion){
           case 0: System.out.println("-PROCESS FINISHED-");
           case 1: agregarEstado(); break;
           case 2: leerEstados(); break;
           case 3: actualizarEstado(); break;
           case 4: eliminarEstado(); break;
           case 5: agregarMunicipio(); break;
           case 6: leerMunicipio(); break;
           case 7: actualizarMunicipio(); break;
           case 8: eliminarMunicipio(); break;
           case 9: agregarLocalidad(); break;
           case 10: leerlocalidad(); break;
           case 11: actualizarLocalidad(); break;
           case 12: eliminarLocalidad(); break;
       }
   }

    public static void main(String[] args) {
         
        int opcion;
        do {
            menu();
            System.out.println("Seleccione una opcion");
            opcion = input.nextInt();
            opciones(opcion);
        } while (opcion != 13);
    
    }
    
}
