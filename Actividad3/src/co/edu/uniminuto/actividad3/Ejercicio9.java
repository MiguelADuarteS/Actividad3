package co.edu.uniminuto.actividad3;

import java.util.Scanner;

public class Ejercicio9 {
 /**
 *9. Leer N cantidad de notas (validar rango de notas), 
 * imprimir el promedio de las notas, 
 * la nota más alta y la más baja.
 */   
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);

        int cantNotas;
        float notas = 0;
        float nota = 0; 
        int acumuladorn = 1;
        float proNotas = 0;
        float notaMax = 0;
        float notaMin = 0;
       
        
        System.out.println("Ingrese cantidad de notas que desea promediar: ");
        cantNotas = leer.nextInt();
        
        for(int i=1; i <= cantNotas; i++){
        
        System.out.println("Introduzca la nota: "+i);
        nota = leer.nextFloat();
        if(nota<0 || nota>5){
            System.out.println("El rango de notas debe ser entre 0.0 y 5.0");
            return;
        }
        else{
        notas += nota;
        proNotas = notas / cantNotas;
                
        if (nota>notaMax)notaMax=nota;
        if (nota<notaMin)notaMin=nota;
        
        }
 }
        System.out.println("El promedio notas es: "+proNotas);
        System.out.println("La nota mas alta es: "+notaMax);
        System.out.println("La nota mas baja es: "+notaMin);
}
}