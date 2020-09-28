package zooAnimales;

import gestion.Zona;
import static zooAnimales.Mamifero.listado;

/**
 *
 * @author SAM
 */
public class Anfibio extends Animal {

    static Anfibio[] listado;
    public static int ranas;
    public static int salamandras;
    String colorPiel;
    boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        int largo = listado.length;
        listado[largo] = this;
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

    public void crearRana(String nombre, int edad, String genero, Zona zona) {
        new Anfibio(nombre,edad,"selva",genero,zona,"rojo",true);
        ranas++;
    }

    public void crearSalamandra(String nombre, int edad, String genero, Zona zona) {
        new Anfibio(nombre,edad,"selva",genero,zona,"negro y amarillo",false);
        salamandras++;
    }

    public static Anfibio[] getListado() {
        return listado;
    }

    public static void setListado(Anfibio[] listado) {
        Anfibio.listado = listado;
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

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    
}
