package co.edu.uniminuto.actividad3;

import java.util.Scanner;

public class Ejercicio8 {
/*Dado N cantidad de precios de gaseosas en un supermercado el gerente de ventas
desea que se genere un programa que le permita saber cuál de las gaseosas tiene
el mayor precio, cuál tiene menor precio y cuál es el precio promedio. Hacer las
impresiones según lo requerido
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int cantPrecios;
        short precios = 0;
        short precio;
        short acumuladorp = 1;
        short proPrecio = 0;
        short precioMax = 0;
        short precioMin = 0;
       
        
        System.out.println("Ingrese cantidad de precios que desea comparar: ");
        cantPrecios = leer.nextInt();
        
        for(int i=1; i <= cantPrecios; i++){
        
        System.out.println("Introduzca el precio "+acumuladorp+" :");
        precio = leer.nextShort();
        precios += precio;
        acumuladorp++;// Iteración
        proPrecio = (short) (precios/cantPrecios);
        
        if (i==0){
        precioMax=precio;
        precioMin=precio;
        }
        else if (precio>precioMax || precioMin<precio){
        precioMax=precio; 
        precioMin=precio;
        } 
         if (i== 0){
        precioMin=precio;
        }
        else if (precioMin>precio){
        precioMin=precio;
        }
 }
        System.out.println("El promedio precios de gaseosa es: "+proPrecio);
        System.out.println("La precio mas alto es: "+precioMax);
        System.out.println("La precio menor es: "+precioMin);
}
}
