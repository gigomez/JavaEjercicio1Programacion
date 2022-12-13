/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercicio1;

/**
 *
 * @author gloir
 */
public class JavaEjercicio1 {

      /**
     * @param args the command line arguments
     *     /*Primera parte:
        Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int suma = suma(1,5,6); 
        System.out.println(suma);
        
        Coche miCoche = new Coche();
        miCoche.incrementoPuerta();
        miCoche.incrementoPuerta();
        miCoche.incrementoPuerta();
        miCoche.incrementoPuerta();
        System.out.println(miCoche.numPuerta);
        
        
    }
    
    public static int suma(int n1, int n2, int n3)
    {
       return n1+n2+n3;
    }
       
}
     
/* * Segunda parte:
 Crear una clase Coche.
    Dentro de la clase Coche, una variable numérica que almacene el número de puertas que tiene.
    Una función que incremente el número de puertas que tiene el Coche.
    Crear un objeto miCoche en el main y añadirle una puerta.
    Mostrar el número de puertas que tiene el objeto.
 */
class Coche{
     
    public int numPuerta = 0;
    
    public void incrementoPuerta()
    {
        this.numPuerta++;
    }
           
}
    