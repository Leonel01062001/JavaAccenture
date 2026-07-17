package estructurasControl;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        boolean incorrecto = true;
        do {
            System.out.println("Ingrese un numero");
            numero = teclado.nextInt();

            if (numero>0){
                System.out.println("El numero es correcto");
                incorrecto = false;
            }else {
                System.out.println("El numero no es correcto");
            }
        }while (incorrecto);
    }
}
