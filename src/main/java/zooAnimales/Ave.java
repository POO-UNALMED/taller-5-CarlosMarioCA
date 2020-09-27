package zooAnimales;

import gestion.Zona;

/**
 *
 * @author SAM
 */
public class Ave extends Animal {
    Ave[] listado;
    int halcones;
    int aguilas;
    String colorPlumas;

    public Ave(Ave[] listado, int halcones, int aguilas, String colorPlumas, int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.halcones = halcones;
        this.aguilas = aguilas;
        this.colorPlumas = colorPlumas;
    }
    
    public int cantidadAves(){
        return halcones + aguilas;
    }
    
    @Override
    public void movimiento(){
        
    }
    
    public void crearHalcon(){
        
    }
    
    public void crearAguilas(){
        
    }
}
