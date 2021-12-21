
package ejercicios6;

public class Esfera extends Figura {
    
      private int radio=10;

    public Esfera(String nombre,int radio) {
        super(nombre);
        this.radio=radio;
    }
 


    
    public double area()
    { 
     return (4*3.14)*radio*radio;
    }
    
    
    
    
    
    
    
}
