
package co.edu.uniminuto.actividad3;

import java.util.Scanner;

public class Ejercicio3 {
     /**
 *3.Hacer un programa en Java que, dado un rango, por el usuario, se da número  
 * inicial y uno final (tomar en cuenta que el inicial debe ser menor que el 
 * final, hacer  la validación y volver a pedir los dos números si no cumple la 
 * condición) y sume  los números pares dentro del rango incluyendo el valor 
 * inicial y final.  
     * @param args
 */
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    
    int numeroInicial;
    int numeroFinal;
    int acumuladorPares =0;
    int suma=0;
    
        System.out.println("Contador y suma de numeros pares");
        System.out.print("Ingrese el numero inicial: ");
        numeroInicial = leer.nextInt();
        System.out.print("Ingrese el numero final: ");
        numeroFinal = leer.nextInt();
        
        if(numeroInicial>numeroFinal){
            System.out.println("Recuerde que le numero inicial no puede ser "
                    + "mayor al numero final");     
        }
        else{
        System.out.println("Los numero pares entre "+numeroInicial+" y "
                     +numeroFinal+" es: ");
        for(int i=numeroInicial;i<=numeroFinal;i++){
            
        if(i % 2 == 0){
             acumuladorPares+=i;
             suma = acumuladorPares+numeroInicial+numeroFinal;
             System.out.println(i+" ");
        } 
      } 
      System.out.println("La suma de los numeros pares entre "+numeroInicial+
              " y "+numeroFinal+" incluyendo estos dos numeros es:"+suma);  
     }
    
   }
 }
