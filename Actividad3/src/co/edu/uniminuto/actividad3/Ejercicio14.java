
package co.edu.uniminuto.actividad3;

public class Ejercicio14 {
    /*14. Realizar un programa que genere un arreglo de 50 posiciones y se 
    rellene de con la función ramdom de Java (los números deben ser 1 a 99), 
    luego de llenar hacer la impresión de la matriz.
    */
    public static void main(String[] args) {
    
        int posiciones[]=new int[50];
        for(int i=0; i<50; i++){
        posiciones[i] = (int)(Math.random()*(1+99));
        }
        System.out.print("Las 50 posiciones entre 1 y 99 son: "); 
         for(int i=0; i<50; i++){    
        System.out.print(+posiciones[i]+" ");
         }
    }
}

