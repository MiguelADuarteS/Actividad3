
package co.edu.uniminuto.actividad3;

import java.util.Scanner;

public class Ejercicio2 {
 /**
 *2. Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 (para ser
 * sumado debe verificarse que sea múltiplo de 5 y 3 a la vez) comprendidos 
 * entre 1  y n (n es determinado por el usuario). Imprimir la cantidad de 
 * múltiplos de 5 y 3
     * @param args
 */
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    
    
    int numero;
    int contadorMultiplos;
    int acumuladorMultiplos = 0;
           
    System.out.println("Ingrese el numero maximo del cual desea saber sus multiplos de 5 y 3: ");
    numero = leer.nextInt();    
        
    
        System.out.println("Los numeros multiplos de 5 y 3 son: ");
        for(int i = 1; i <= numero; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            contadorMultiplos = i;
        acumuladorMultiplos += i;
        System.out.println(+contadorMultiplos+" ");
        }
        }
        System.out.println("La suma de estos numeros es: "+acumuladorMultiplos);    
            
    }
    }