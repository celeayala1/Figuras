
package ejercicios6;


public class Cuadrado extends Figura implements CalculoArea {
     private int lado=10;

    public Cuadrado(String nombre,int lado) {
        super(nombre);
        this.lado=lado;
    }

    public int getLado()
    {
     return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    


    

    @Override
    public String toString() {
          return super.toString() + "lado:"+ lado;
           
    }
   
    public double area()
    { 
     return lado*lado;
    }

   

        
        
        
    }
     
     
     
     
     
     
     
     
     
     
     
     
     

