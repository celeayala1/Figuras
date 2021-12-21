
package ejercicios6;

import java.util.Vector;


public class Ejercicios6 {

    public static void main(String[] args) {


Vector<Figura> figuras = new Vector<Figura>();
figuras.add(new Circulo("circulo",10)); // Radio=10
figuras.add(new Cuadrado("cuadrado",10)); // Lado=10
figuras.add(new Triangulo("triangulo",10,5)); // Base=10, Altura=5;
figuras.add(new Rectangulo("rectangulo",10,10)); // Radio=10 altura=10
figuras.add(new Esfera("esfera",10)); // Radio=10
figuras.add(new Cilindro("cilindro",10,10)); // Radio=10 altura=10

for (Figura f: figuras)

 //Figura q =(Figura)f;
 
System.out.println("Área del "+f.getNombre()  + "  " +f.area());


}
} 
 
        
        
        
        
        
        
        
        
        
        
        
        
    
    

