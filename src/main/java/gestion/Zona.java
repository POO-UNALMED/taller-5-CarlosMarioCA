package gestion;
import zooAnimales.Animal;
/**
 *
 * @author SAM
 */
public class Zona{
    private String nombre;
    public Zoologico zoo;
    public Animal[] animales;
    
    public Zona(String nombre,Zoologico zoo, Animal[] animales){
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
        
    }
    
    public Zona(){
        
    }
    
    public void agregarAnimales(Animal animal){
        int indice = animales.length;
        animales[indice] = animal;
    }
    
    public int cantidadAnimales(){
        return animales.length;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }
    
    
}
