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

}
