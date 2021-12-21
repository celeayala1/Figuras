
package ejercicios6;


public class Triangulo extends Figura implements CalculoArea {
 
    private int base=10;
    private int altura=5;

    public Triangulo(String nombre,int base,int altura) {
        super(nombre);
        this.base=base;
        this.altura=altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    

    @Override
    public String toString() {
        return super.toString()+  "base:" + base + ", altura:" + altura;
          
    }

    
    public double area()
    { 
     return base*altura/2;
    }
            

   
      
       
   
    
    
    
}
