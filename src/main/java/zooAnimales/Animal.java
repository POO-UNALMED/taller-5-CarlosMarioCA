package zooAnimales;
import gestion.Zona;
/**
 *
 * @author SAM
 */
public class Animal {
    public static int totalAnimales = 0;
    private String nombre;
    int edad;
    public String habitat;
    public String genero;
    Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.totalAnimales++;
    }

    public Animal() {
        this.totalAnimales++;
    }
    
    public String movimiento(){
        return "desplazarse";
    }
    
    public static String totalPorTipo(){
        int mamif = Mamifero.listado.size();
        int reptil = Reptil.listado.size();
        int ave = Ave.listado.size();
        int anfib = Anfibio.listado.size();
        int pez = Pez.listado.size();
        
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
        if(nombre == null){
            message = "Mi nombre es " + nombre + " tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
        }
        else{
            message = "Mi nombre es " + nombre + " tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona + ", en el " + zona.zoo.getNombre(); 
        }
        return message;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
