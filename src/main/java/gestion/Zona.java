package gestion;

import zooAnimales.Animal;
import java.util.*;

/**
 *
 * @author SAM
 */
public class Zona {

    private String nombre;
    public Zoologico zoo;
    public static ArrayList<Animal> animales;

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona() {

    }

    public static void agregarAnimales(Animal animal) {
        animales.add(animal);
    }

    public int cantidadAnimales() {
        return animales.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public ArrayList getAnimales() {
        return animales;
    }

    public void setAnimales(Animal animal) {
        this.animales.add(animal);
    }
}
