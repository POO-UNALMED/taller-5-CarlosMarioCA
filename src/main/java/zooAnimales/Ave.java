package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;
import static zooAnimales.Anfibio.listado;
import static zooAnimales.Mamifero.listado;

/**
 *
 * @author SAM
 */
public class Ave extends Animal {

    static ArrayList<Animal> listado = new ArrayList<>();;
    public static int halcones;
    public static int aguilas;
    String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        this.listado.add(this);
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

    public static Animal crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
    }

    public static Animal crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
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
    
    
}
