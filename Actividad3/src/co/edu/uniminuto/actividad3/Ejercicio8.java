package co.edu.uniminuto.actividad3;

import java.util.Scanner;

public class Ejercicio8 {
/*8. Dado N cantidad de precios de gaseosas en un supermercado el gerente de ventas
desea que se genere un programa que le permita saber cuál de las gaseosas tiene
el mayor precio, cuál tiene menor precio y cuál es el precio promedio. Hacer las
impresiones según lo requerido
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int cantidadPrecios;
        double acumuladorPrecios = 0;
        double precio;
        double promedioPrecio = 0;
        double precioMayor = 0;
        double precioMenor = 0;
       
        
        System.out.println("Ingrese cantidad de precios que desea comparar: ");
        cantidadPrecios = leer.nextInt();
        
        for(int i=1; i <= cantidadPrecios; i++){
        
        System.out.println("Introduzca el precio "+i+" :");
        precio = leer.nextDouble(); 
        acumuladorPrecios += precio;
               
        if (precio > precioMayor) {
                precioMayor = precio;
            }
            if (precio < precioMenor) {
                precioMenor = precio;
            }
 }      
         promedioPrecio = (double) (acumuladorPrecios/cantidadPrecios); 
        
        System.out.println("El promedio precios de gaseosa es: "+promedioPrecio);
        System.out.println("La precio mas alto es: "+precioMayor);
        System.out.println("La precio menor es: "+precioMenor);
}
}
