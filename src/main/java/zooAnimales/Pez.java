package zooAnimales;

import gestion.Zona;
import static zooAnimales.Mamifero.listado;

/**
 *
 * @author SAM
 */
public class Pez extends Animal {

    static Pez[] listado;
    public static int salmones;
    public static int bacalaos;
    String colorEscamas;
    int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        int largo = listado.length;
        listado[largo] = this;
    }

    public Pez() {

    }

    public int cantidadPeces() {
        return bacalaos + salmones;
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    public void crearSalmon(String nombre, int edad,String genero, Zona zona) {
        new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
        salmones++;
    }

    public void crearBacalao(String nombre, int edad,String genero, Zona zona) {
        new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
        bacalaos++;
    }

    public static Pez[] getListado() {
        return listado;
    }

    public static void setListado(Pez[] listado) {
        Pez.listado = listado;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static void setSalmones(int salmones) {
        Pez.salmones = salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

    public static void setBacalaos(int bacalaos) {
        Pez.bacalaos = bacalaos;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
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
