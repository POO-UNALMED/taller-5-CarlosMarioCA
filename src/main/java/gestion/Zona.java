package gestion;

import zooAnimales.Animal;
import gestion.Zoologico;
import java.util.ArrayList;

/**
 *
 * @author SAM
 */
public class Zona {

    private String nombre;
    public Zoologico zoo;
    static ArrayList<Animal> animales;

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = new ArrayList<>();
    }

    public Zona() {

    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }
    
    
    public int cantidadAnimales() {
        if (animales.isEmpty()) {
            return 0;
        } else {
            return (int)animales.size();
        }
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
