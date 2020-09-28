package zooAnimales;
import gestion.Zona;
/**
 *
 * @author SAM
 */
public class Animal {
    static int totalAnimales;
    String nombre;
    int edad;
    String habitat;
    String genero;
    Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        this.totalAnimales = totalAnimales + 1;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
    }

    public Animal() {
        
    }
    
    public String movimiento(){
        return "desplazarse";
    }
    
    public String totalPorTipo(){
        int mamif = Mamifero.listado.length;
        int reptil = Reptil.listado.length;
        int ave = Ave.listado.length;
        int anfib = Anfibio.listado.length;
        int pez = Pez.listado.length;
        
        String message = "Mamiferos: " + mamif + "\n" +
                        "Aves: " + ave + "\n" + 
                        "Reptiles: " + reptil + "\n" +
                        "Peces: " + pez + "\n" +
                        "Anfibios: " + anfib;
        
        return message;
    }
    
    @Override
    public String toString(){
        String message;
        if(zona == null){
            message = "Mi nombre es " + nombre + " tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
        }
        else{
            message = "Mi nombre es " + nombre + " tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona + ", en el " + zona.zoo.nombre; 
        }
        return message;
    }
}
