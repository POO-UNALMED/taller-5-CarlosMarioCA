package zooAnimales;

import gestion.Zona;

/**
 *
 * @author SAM
 */
public class Pez extends Animal{
    Pez[] listado;
    int salmones;
    int bacalaos;
    String colorEscamas;
    int cantidadAletas;

    public Pez(Pez[] listado, int salmones, int bacalaos, String colorEscamas, int cantidadAletas, int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.salmones = salmones;
        this.bacalaos = bacalaos;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }
    
    public int cantidadPeces(){
        return bacalaos + salmones;
    }
    
    @Override
    public void movimiento(){
        
    }
    
    public void crearSalmon(){
        
    }
    
    public void crearBacalao(){
        
    }
    
}

