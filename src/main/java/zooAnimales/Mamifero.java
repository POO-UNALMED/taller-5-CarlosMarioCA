package zooAnimales;

import gestion.Zona;

/**
 *
 * @author SAM
 */
public class Mamifero extends Animal {
    Mamifero[] listado;
    int caballos;
    int leones;
    boolean pelaje;
    int patas;

    public Mamifero(Mamifero[] listado, int caballos, int leones, boolean pelaje, int patas, int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.caballos = caballos;
        this.leones = leones;
        this.pelaje = pelaje;
        this.patas = patas;
    }
    
    public int cantidadMamiferos(){
        return caballos;
    }
    
    public void crearCaballo(){
        
    }
    
    public void crearLeon(){
        
    }
}
