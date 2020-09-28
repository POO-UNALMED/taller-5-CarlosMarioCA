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
}
