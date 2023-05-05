package models;

import java.util.ArrayList;

/**
 *
 * @author chanp
 */
public class Estado {
    public static ArrayList<Estado> estados = new ArrayList<>();
    
    private int estadoId;
    private String nombreEstado;
    private int poblacionEstado;

    public Estado() {
    }

    public Estado(int estadoId, String nombreEstado, int poblacionEstado) {
        this.estadoId = estadoId;
        this.nombreEstado = nombreEstado;
        this.poblacionEstado = poblacionEstado;
    }

    public static ArrayList<Estado> getEstados() {
        return estados;
    }

    public static void setEstados(ArrayList<Estado> estados) {
        Estado.estados = estados;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public int getPoblacionEstado() {
        return poblacionEstado;
    }

    public void setPoblacionEstado(int poblacionEstado) {
        this.poblacionEstado = poblacionEstado;
    }

    @Override
    public String toString() {
        return "Estado{" + "estadoId=" + estadoId + ", nombreEstado=" + nombreEstado + ", poblacionEstado=" + poblacionEstado + '}';
    }
    
    
    
    
}
