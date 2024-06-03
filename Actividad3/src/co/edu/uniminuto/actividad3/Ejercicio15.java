
package co.edu.uniminuto.actividad3;

import javax.swing.JOptionPane;

public class Ejercicio15 {
     public static void main (String[] args){
/*15. Realizar un programa que genere una matriz 5x6 y se rellene dinámicamente 
con los números impares partiendo desde n (n es dada por el usuario) y 
    se imprima.
         */      
       int numeroInicial=0;
       int numero = numeroInicial;
       
       numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "
               + "numero inicial de la matriz este numero debe ser impar: "));
      
       short arrayBidimen[][] = new short[5][6];
               for(int x=0; x<5;x++){
                   for(int y=0;y<6;y++){
                       if(numeroInicial%2!=0){
                           numero++; 
                           arrayBidimen[x][y]= (short) numero++;
                       }                   
               }  
           }
           for(int x=0; x<5;x++){
              for(int y=0;y<6;y++){
                  System.out.print(arrayBidimen[x][y]+" ");
             }
             System.out.println();
           }
       }
    }
