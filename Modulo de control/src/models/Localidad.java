package models;

import java.util.ArrayList;

/**
 *
 * @author chanp
 */
public class Localidad {
    public static ArrayList<Localidad> localidades = new ArrayList<>();
    
    private int LocalidadId;
    private String nombreLocalidad;
    private int poblacionLocalidad;

    public Localidad() {
    }

    public Localidad(int LocalidadId, String nombreLocalidad, int poblacionLocalidad) {
        this.LocalidadId = LocalidadId;
        this.nombreLocalidad = nombreLocalidad;
        this.poblacionLocalidad = poblacionLocalidad;
    }

    public static ArrayList<Localidad> getLocalidades() {
        return localidades;
    }

    public static void setLocalidades(ArrayList<Localidad> localidades) {
        Localidad.localidades = localidades;
    }

    public int getLocalidadId() {
        return LocalidadId;
    }

    public void setLocalidadId(int LocalidadId) {
        this.LocalidadId = LocalidadId;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public int getPoblacionLocalidad() {
        return poblacionLocalidad;
    }

    public void setPoblacionLocalidad(int poblacionLocalidad) {
        this.poblacionLocalidad = poblacionLocalidad;
    }

    @Override
    public String toString() {
        return "Localidad{" + "LocalidadId=" + LocalidadId + ", nombreLocalidad=" + nombreLocalidad + ", poblacionLocalidad=" + poblacionLocalidad + '}';
    }
    
    
}
