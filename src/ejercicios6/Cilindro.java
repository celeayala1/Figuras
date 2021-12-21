
package ejercicios6;


public class Cilindro extends Figura {
    
private int radio=10;
private int altura=10;
    public Cilindro(String nombre,int radio,int altura) {
        super(nombre);
        this.radio=radio;
        this.altura=altura;
    }

   



    
    public double area()
    { 
     return 2*3.14*radio*(radio+altura);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
