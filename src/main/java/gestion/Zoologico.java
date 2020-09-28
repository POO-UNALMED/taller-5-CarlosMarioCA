package gestion;
import zooAnimales.Animal;
/**
 *
 * @author marx1
 */
public class Zoologico {
    public String nombre;
    String ubicacion;
    public Zona[] zonas;
    
    public Zoologico(String nombre,String ubicacion,Zona[] zonas){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new Zona[100];
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
    
    
}
