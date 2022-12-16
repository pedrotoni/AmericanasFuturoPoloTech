import java.util.Scanner;

public class Ex5Loops {
    public static void main (String[] args) {
        /*Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados.
        Ao final, informe qual o nome mais longo presente na lista.
         */
        Scanner sc = new Scanner(System.in);
        String[] listaConvidados = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o nome do %dº convidado: ", i+1);
            listaConvidados[i] = sc.nextLine();
        }
        System.out.println("Lista de convidados: ");
        for (String convidado : listaConvidados) {
            System.out.println(convidado);
        }

        int numeroLetrasMaiorNome = 0;
        for (String nome : listaConvidados) {
            if (nome.length() > numeroLetrasMaiorNome) {
                numeroLetrasMaiorNome = nome.length();
            }
        }

        System.out.print("O maior nome da lista é: ");

        for (String nome : listaConvidados) {
            if (nome.length() == numeroLetrasMaiorNome) {
                System.out.print(nome+" ");
            }
        }
    }
}
