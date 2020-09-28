package gestion;

import zooAnimales.Animal;
import gestion.Zona;
import java.util.*;

/**
 *
 * @author marx1
 */
public class Zoologico {

    public String nombre;
    private String ubicacion;
    public ArrayList<Zona> zonas;

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<Zona>();
    }

    public Zoologico() {

    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        int conteo = 0;
        for (int i = 0; i < zonas.size(); i++) {
            int dato = zonas.get(i).cantidadAnimales();
            conteo = conteo + dato;
        }
        return conteo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public void setZona(Zona zona) {
        this.zonas.add(zona);
    }

}
