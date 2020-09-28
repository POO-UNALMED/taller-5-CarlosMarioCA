package zooAnimales;

import gestion.Zona;

/**
 *
 * @author SAM
 */
public class Mamifero extends Animal {
    static Mamifero[] listado;
    public static int caballos;
    public static int leones;
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

    public static Mamifero[] getListado() {
        return listado;
    }

    public static void setListado(Mamifero[] listado) {
        Mamifero.listado = listado;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static void setCaballos(int caballos) {
        Mamifero.caballos = caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static void setLeones(int leones) {
        Mamifero.leones = leones;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
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

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    
    
}
