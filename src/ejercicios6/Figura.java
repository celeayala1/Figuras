
package ejercicios6;

public abstract class Figura   {
    
private String nombre;



    public Figura(String nombre) {
        this.nombre = nombre;

        
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre;
    }
    
    


  public abstract double area();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
