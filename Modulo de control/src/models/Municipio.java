package models;

import java.util.ArrayList;

/**
 *
 * @author chanp
 */
public class Municipio {
    public static ArrayList<Municipio> municipios = new ArrayList<>();
    
    private int municipiooId;
    private String nombreMunicipio;
    private int poblacionMunicipio;

    public Municipio() {
    }

    public Municipio(int municipiooId, String nombreMunicipio, int poblacionMunicipio) {
        this.municipiooId = municipiooId;
        this.nombreMunicipio = nombreMunicipio;
        this.poblacionMunicipio = poblacionMunicipio;
    }

    public static ArrayList<Municipio> getMunicipios() {
        return municipios;
    }

    public static void setMunicipios(ArrayList<Municipio> municipios) {
        Municipio.municipios = municipios;
    }

    public int getMunicipiooId() {
        return municipiooId;
    }

    public void setMunicipiooId(int municipiooId) {
        this.municipiooId = municipiooId;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public int getPoblacionMunicipio() {
        return poblacionMunicipio;
    }

    public void setPoblacionMunicipio(int poblacionMunicipio) {
        this.poblacionMunicipio = poblacionMunicipio;
    }

    @Override
    public String toString() {
        return "Municipio{" + "municipiooId=" + municipiooId + ", nombreMunicipio=" + nombreMunicipio + ", poblacionMunicipio=" + poblacionMunicipio + '}';
    }
    
    
}
