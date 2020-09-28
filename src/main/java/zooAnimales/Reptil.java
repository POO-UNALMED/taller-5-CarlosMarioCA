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

    public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
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

    public static Animal crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde" , 3);
    }

    public static Animal crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco" , 1);
    }

    public static Reptil[] getListado() {
        return listado;
    }

    public static void setListado(Reptil[] listado) {
        Reptil.listado = listado;
    }

    public static int getIguanas() {
        return iguanas;
    }

    public static void setIguanas(int iguanas) {
        Reptil.iguanas = iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public static void setSerpientes(int serpientes) {
        Reptil.serpientes = serpientes;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
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
