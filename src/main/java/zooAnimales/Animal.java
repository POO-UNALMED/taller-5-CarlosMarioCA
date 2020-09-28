package zooAnimales;
import gestion.Zona;
/**
 *
 * @author SAM
 */
public class Animal {
    public static int totalAnimales;
    private String nombre;
    int edad;
    public String habitat;
    public String genero;
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

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    
}
