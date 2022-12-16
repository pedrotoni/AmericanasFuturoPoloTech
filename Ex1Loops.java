import java.util.Scanner;

public class Ex1Loops {
    public static void main(String[] args) {
        /*Escreva um programa que lê o nome
        de 5 frutas e armazena num carrinho de compras.
        Ao final da entrada dos 5 itens, exiba a lista completa.
         */
        Scanner sc = new Scanner(System.in);
        String[] frutas = new String[5];
        for (int pergunta = 0; pergunta < 5; pergunta++) {
            System.out.printf("Digite o nome da fruta %d: ", pergunta + 1);
            frutas[pergunta] = sc.nextLine();
        }
        System.out.println("Lista de Frutas: ");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
