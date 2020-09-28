package zooAnimales;

import gestion.Zona;
import static zooAnimales.Mamifero.listado;

/**
 *
 * @author SAM
 */
public class Ave extends Animal {

    static Ave[] listado;
    public static int halcones;
    public static int aguilas;
    String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
        int largo = listado.length;
        listado[largo] = this;
    }

    public Ave() {

    }

    public int cantidadAves() {
        return halcones + aguilas;
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public void crearHalcon(String nombre, int edad, String genero, Zona zona) {
        new Ave(nombre,edad,"montanas",genero,zona,"cafe glorioso");
        halcones++;
    }

    public void crearAguilas(String nombre, int edad, String genero, Zona zona) {
        new Ave(nombre,edad,"montanas",genero,zona,"blanco y amarillo");
        aguilas++;
    }

    public static Ave[] getListado() {
        return listado;
    }

    public static void setListado(Ave[] listado) {
        Ave.listado = listado;
    }

    public static int getHalcones() {
        return halcones;
    }

    public static void setHalcones(int halcones) {
        Ave.halcones = halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    public static void setAguilas(int aguilas) {
        Ave.aguilas = aguilas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
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
