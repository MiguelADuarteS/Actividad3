package co.edu.uniminuto.actividad3;

import java.util.Scanner;

public class Ejercicio1 {
    /**
     1.Hacer un rpograma en java que sume los sigueintes 25 numeros
     * impares que le siguen a n e imprimir los 25 numeros y la suma.
     * @param args
     **/
 public static void main(String[] args){
  Scanner leer = new Scanner(System.in);
  int numero;
  int acumuladorImpares = 0;
  int contadorImpares = 0;
  
     System.out.println("Dame un numero: ");
     numero = leer.nextInt();
     
     while(contadorImpares<25){
         numero++;
         if(numero % 2 != 0){
             acumuladorImpares+=numero;
             System.out.print(numero+" ");
             contadorImpares++;
         }
         
         
     }System.out.println("suma "+acumuladorImpares);
 }   
}

