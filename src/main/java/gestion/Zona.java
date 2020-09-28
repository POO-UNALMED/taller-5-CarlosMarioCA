package gestion;

import zooAnimales.Animal;

/**
 *
 * @author SAM
 */
public class Zona {

    private String nombre;
    public Zoologico zoo;
    public static Animal[] animales;

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona() {

    }

    public static void agregarAnimales(Animal animal) {
        animales[animales.length] = animal;
    }

    public int cantidadAnimales() {
        return animales.length;
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

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    public Zona get(int num) {
        return zoo.getZona()[num];
    }

}
