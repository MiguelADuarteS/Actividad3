package co.edu.uniminuto.actividad3;

import java.util.Scanner;

public class Ejercicio9 {
 /**
 *Leer N cantidad de notas (validar rango de notas), 
 * imprimir el promedio de las notas, 
 * la nota más alta y la más baja.
 */   
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        //Definir variables
        int cantNotas;
        float notas = 0; //almacenamiento de notas
        float nota = 0; // nota indovidual
        int acumuladorn = 1; //acumulador
        float proNotas = 0;
        float notaMax = 0;
        float notaMin = 0;
       
        
        System.out.println("Ingrese cantidad de notas que desea promediar: ");
        cantNotas = leer.nextInt(); // Cantidad de notas
        
        for(int i=1; i <= cantNotas; i++){
        
        // Leer notas
        System.out.println("Introduzca la nota: "+acumuladorn);
        nota = leer.nextFloat();
        notas += nota;
        acumuladorn++;// Iteración
        proNotas = notas / cantNotas;
        
        
        if (i==0){
        notaMax=nota;
        notaMin=nota;
        }
        else if (nota>notaMax){
        notaMax=nota; 
        } 
        else if(notaMin<nota){
        notaMin=nota;
        }
 }
        System.out.println("El promedio notas es: "+proNotas);
        System.out.println("La nota mas alta es: "+notaMax);
        System.out.println("La nota mas baja es: "+notaMin);
}
}