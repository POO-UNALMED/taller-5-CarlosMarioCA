package zooAnimales;

import gestion.Zona;
import static zooAnimales.Mamifero.listado;

/**
 *
 * @author SAM
 */
public class Reptil extends Animal {

    static Reptil[] listado;
    public static int iguanas;
    public static int serpientes;
    String colorEscamas;
    int largoCola;

    public Reptil() {

    }

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona,String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero, zona);
        this.serpientes = serpientes;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        int largo = listado.length;
        listado[largo] = this;
    }

    public int cantidadReptiles() {
        return iguanas + serpientes;
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public void crearIguana(String nombre, int edad, String genero, Zona zona) {
        new Reptil(nombre, edad, "humedal", genero, zona, "verde" , 3);
        iguanas++;
    }

    public void crearSerpiente(String nombre, int edad, String genero, Zona zona) {
        new Reptil(nombre, edad, "jungla", genero, zona, "blanco" , 1);
        serpientes++;
    }
}
