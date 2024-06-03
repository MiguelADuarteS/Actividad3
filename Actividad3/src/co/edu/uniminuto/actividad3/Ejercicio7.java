
package co.edu.uniminuto.actividad3;

import java.util.Scanner;

public class Ejercicio7 {
/**Realizar un programa en Java que dado n cantidad de números determine si es
primo o no y si ese número primo es múltiplo de 3, se debe contar. Imprimir
cantidad de primos y cantidad de múltiplos de 3
     * @param args
 */
   public static void main(String[] args){
   Scanner leer = new Scanner(System.in);
   
   int numero;
   int contadorPrimos = 0;
       System.out.println("Verificar si es primo y multiplo de tres");
       System.out.print("Ingrese cantidad de numeros a verificar: ");
       numero = leer.nextInt();
       
   for(int i=1;i<=numero; i++){
       if(i % i ==1 && i % 1==i){
        contadorPrimos += i;
        System.out.println(contadorPrimos+" ");   
       }
    
   }
   }
   } 
