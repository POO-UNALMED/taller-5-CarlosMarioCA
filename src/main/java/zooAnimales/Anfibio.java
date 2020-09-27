package zooAnimales;

import gestion.Zona;

/**
 *
 * @author SAM
 */
public class Anfibio extends Animal{
    Anfibio[] listado;
    int ranas;
    int salamandras;
    String colorPiel;
    boolean venenoso;

    public Anfibio(Anfibio[] listado, int ranas, int salamandras, String colorPiel, boolean venenoso, int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.ranas = ranas;
        this.salamandras = salamandras;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }
    
    public int cantidadAnfibios(){
        return salamandras + ranas;
    }
    
    @Override
    public void movimiento(){
        
    }
    
    public void crearRana(){
        
    }
    
    public void crearSalamandra(){
        
    }
}
