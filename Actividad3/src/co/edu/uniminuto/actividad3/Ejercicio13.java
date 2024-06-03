
package co.edu.uniminuto.actividad3;

public class Ejercicio13 {
  /*13. Realizar un programa que genere una matriz 7x7, inicializarla la diagonal
principal con el número “0”(cero), el resto de las posiciones deben ser - (guion).
Imprimir la matriz. 
    */
    public static void main(String[] args) {
        char matriz[][]=new char[7][7];
        for(var i=0;i<7;i++){
            for(int j=0;j<7;j++)
                matriz[i][j]= '-';
        }
       
        for(int i=0;i<7;i++){
                matriz[i][i]='0';
        }
        
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++)
            System.out.print( matriz[i][j]+" ");
       System.out.println();    
    }
} 
} 

