import java.util.Arrays;
import java.util.Scanner;

public class Ex4Loops {
    public static void main (String[] args) {
        //Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            numeros[i] = sc.nextInt();
        }
        System.out.println("Numeros: "+ Arrays.toString(numeros));

        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (maior < numeros[i]) {
                maior = numeros[i];
            }
        }

        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double total = 0;
        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }

        System.out.println("O maior número da lista é: "+maior);
        System.out.println("O menor número da lista é: "+menor);
        System.out.printf("A média dos números da lista é: %.2f", total/numeros.length);
    }
}
