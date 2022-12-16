import java.util.Scanner;

public class Ex6Loops {
    public static void main(String[] args) {
        //Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        String[] palavraSplit = palavra.split("");
        String palavraFormatada = "";

        for (int i = 0; i < palavraSplit.length; i++) {
            if (i % 2 != 0) {
                palavraFormatada += palavraSplit[i].toUpperCase();
            } else {
                palavraFormatada += palavraSplit[i];
            }
        }

        System.out.println(palavraFormatada);
    }
}
