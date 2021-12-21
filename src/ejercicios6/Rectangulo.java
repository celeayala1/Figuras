
package ejercicios6;

public class Rectangulo extends Figura{
    
      private int base=10;
      private int altura=10;

    public Rectangulo(String nombre,int base,int altura) {
        super(nombre);
        this.base=base;
        this.altura=altura;
    }


    
    public double area()
    { 
     return altura*base;
    }
    
    
    
    
    
    
    
}
