package gestion;
import zooAnimales.Animal;
/**
 *
 * @author SAM
 */
public class Zona{
    String nombre;
    public Zoologico zoo;
    Animal[] animales;
    
    public Zona(String nombre,Zoologico zoo, Animal[] animales){
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
        
    }
    
    public void agregarAnimales(Animal animal){
        int indice = animales.length;
        animales[indice] = animal;
    }
    
    public int cantidadAnimales(){
        return animales.length;
    }
}
