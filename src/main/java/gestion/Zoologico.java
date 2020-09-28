package gestion;

import zooAnimales.Animal;
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
        Iterator<Zona> it = zonas.iterator();
        while (it.hasNext()) {
            conteo = conteo + it.cantidadAnimales();
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

    public ArrayList getZona() {
        return zonas;
    }

    public void setZona(Zona zona) {
        this.zonas.add(zona);
    }

}
