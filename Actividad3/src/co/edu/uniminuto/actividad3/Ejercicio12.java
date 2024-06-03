package co.edu.uniminuto.actividad3;

public class Ejercicio12 {
    /*Realizar un programa que genere una matriz 5x5, inicializarla en 2 e imprimirla.
    */
    public static void main(String[] args) {
        
        int matriz[][] = new int[5][5];
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                matriz[x][y] = 2;
            }
        }
        System.out.println("Matriz 5x5 inicializada en 2:");
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
    }
}
