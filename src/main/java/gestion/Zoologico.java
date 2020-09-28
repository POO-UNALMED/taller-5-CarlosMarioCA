package gestion;
import zooAnimales.Animal;
/**
 *
 * @author marx1
 */
public class Zoologico {
    public String nombre;
    private String ubicacion;
    public Zona[] zonas;
    
    public Zoologico(String nombre,String ubicacion,Zona[] zonas){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new Zona[100];
    }
    
    public Zoologico(){
        
    }
    
    public void agregarZonas(Zona zona){
        int indice = zonas.length;
        zonas[indice] = zona;
    }
    
    public int cantidadTotalAnimales(){
        int conteo = 0;
        for(int i =0; i < zonas.length; i++){
            conteo = conteo + zonas[i].cantidadAnimales();        
        }
        return conteo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Zona[] getZonas() {
        return zonas;
    }

    public void setZonas(Zona[] zonas) {
        this.zonas = zonas;
    }
    
    
}
