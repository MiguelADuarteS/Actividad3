
package co.edu.uniminuto.actividad3;

public class Ejercicio17 {
    /*17. Generar un arreglo unidimensional de 50 posiciones que se llene con 
    valores aleatorios y contar la cantidad de positivos, negativos y ceros 
    del arreglo.
    */
    public static void main(String[] args) {
        
        int arrayRamdom[]=new int[50];
        short contadorPositivos = 0;
        short contadorNegativos = 0;
        short contadorCeros = 0;
        
        
        for(int i=0; i<50; i++){
        arrayRamdom[i] = (int)(Math.random()*(200)-100);
        if(arrayRamdom[i]>0)contadorPositivos++;
        else if(arrayRamdom[i]<0) contadorNegativos++;
        else contadorCeros++;
        }
        for(int i=0; i<50; i++){
            
            System.out.println(arrayRamdom[i]+" ");
            
        }
        
        System.out.println("Los numeros positivos en las 50 posiciones son: "+contadorPositivos);
        System.out.println("Los numeros negativos en las 50 posiciones son: "+contadorNegativos);
        System.out.println("Los numeros cero en las 50 posiciones son: "+contadorCeros);
    }
}
