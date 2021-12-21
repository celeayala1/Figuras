
package ejercicios6;

public class Circulo extends Figura implements CalculoArea {
     private int radio=10;

    public Circulo(String nombre,int radio) {
        super(nombre);
        this.radio=radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    
    @Override
    public String toString() {
        return super.toString()+ "radio:" + radio;
      
    }

    
    
    public double area()
    { 
     return radio*3.14;
    }

    
     
     
     
     
     
    
}
