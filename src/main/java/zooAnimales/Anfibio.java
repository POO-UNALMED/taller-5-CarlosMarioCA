package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

/**
 *
 * @author SAM
 */
public class Anfibio extends Animal {

    static ArrayList<Animal> listado;
    public static int ranas;
    public static int salamandras;
    String colorPiel;
    boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        this.listado = new ArrayList<Animal>();
        listado.add(this);
    }

    public Anfibio() {

    }

    public int cantidadAnfibios() {
        return salamandras + ranas;
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    public static Animal crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
    }

    public static Animal crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
    }


    public static int getRanas() {
        return ranas;
    }

    public static void setRanas(int ranas) {
        Anfibio.ranas = ranas;
    }

    public static int getSalamandras() {
        return salamandras;
    }

    public static void setSalamandras(int salamandras) {
        Anfibio.salamandras = salamandras;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
