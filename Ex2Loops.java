import java.util.Scanner;

public class Ex2Loops {
    public static void main (String[] args) {
        //Escreva um programa que lê uma palavra e a escreve de volta ao contrário.
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma palavra: ");
        String palavra = sc.nextLine();
        char[] chars = palavra.toCharArray();
        String palavraInvertida = "";

        for (int indice = chars.length-1; indice >= 0; indice--) {
            palavraInvertida += chars[indice];
        }

        System.out.println("Palavra: "+palavra);
        System.out.println("Palavra Invertida: "+palavraInvertida);
    }
}
