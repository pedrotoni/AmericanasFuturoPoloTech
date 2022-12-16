import java.util.Arrays;
import java.util.Scanner;

public class Ex3Loops {
    public static void main (String[] args) {
        //Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            numeros[i] = sc.nextInt();
        }
        System.out.println("Numeros: "+ Arrays.toString(numeros));

        System.out.println("Impares: ");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();

        System.out.println("Pares: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
    }
}
