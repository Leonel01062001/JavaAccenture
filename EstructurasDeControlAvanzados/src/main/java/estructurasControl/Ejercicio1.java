package estructurasControl;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un numero");
        numero = sc.nextInt();

        if (numero%5 == 0){
            System.out.printf("El numero: " + numero + " es multiplo de 5");
        }else {
            System.out.printf("El numero: " + numero + " no es multiplo de 5");

        }
    }
}
