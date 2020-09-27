package zooAnimales;
import gestion.Zona;
/**
 *
 * @author SAM
 */
public class Animal {
    int totalAnimales;
    String nombre;
    int edad;
    String habitat;
    String genero;
    Zona[] zona;

    public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
        this.totalAnimales = totalAnimales;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
    }
    
    public void movimiento(){
        
    }
    
    public void totalPorTipo(){
        
    }
    
    @Override
    public String toString(){
        return "Soy un Animal";
    }
}
