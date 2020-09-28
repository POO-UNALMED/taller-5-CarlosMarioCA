package zooAnimales;

import gestion.Zona;
import static zooAnimales.Mamifero.listado;

/**
 *
 * @author SAM
 */
public class Anfibio extends Animal {

    static Anfibio[] listado;
    int ranas;
    int salamandras;
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
}
