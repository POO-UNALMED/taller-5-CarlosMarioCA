package zooAnimales;

import gestion.Zona;

/**
 *
 * @author SAM
 */
public class Reptil extends Animal{
    Reptil[] listado;
    int iguanas;
    int serpientes;
    String colorEscamas;
    int largoCola;

    public Reptil(Reptil[] listado, int iguanas, int serpientes, String colorEscamas, int largoCola, int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
        super(totalAnimales, nombre, edad, habitat, genero, zona);
        this.listado = listado;
        this.iguanas = iguanas;
        this.serpientes = serpientes;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }
    
    public int cantidadReptiles(){
        return iguanas + serpientes;
    }
    
    @Override
    public void movimiento(){
        
    }
    
    public void crearSalmon(){
        
    }
    
    public void crearBacalao(){
        
    }
}
