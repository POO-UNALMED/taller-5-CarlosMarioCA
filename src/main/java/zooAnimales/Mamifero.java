package zooAnimales;

import gestion.Zona;

/**
 *
 * @author SAM
 */
public class Mamifero extends Animal {
    static Mamifero[] listado;
    int caballos;
    int leones;
    boolean pelaje;
    int patas;


    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
        int largo = listado.length;
        listado[largo] = this;
    }
    
    public Mamifero(){
        
    }
    
    public int cantidadMamiferos(){
        return caballos+leones;
    }
    
    public void crearCaballo(String nombre,int edad,String genero,Zona zona){
        new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
        caballos++;
    }
    
    public void crearLeon(String nombre,int edad,String genero,Zona zona){
        new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
        leones++;
    }
}
