/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo");
        int valor = entrada.nextInt();
        int [] arreglo = new int [valor];
        for (int i = 0; i < valor; i++) {
            System.out.println("Ingrese valores para el arreglo");
            arreglo[i] = entrada.nextInt();
            
        }
        System.out.printf("El total es: %d\n", 
                misterio(arreglo, arreglo.length));
        
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
