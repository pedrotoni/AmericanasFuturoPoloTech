import java.util.Arrays;
import java.util.Scanner;

public class Ex7Loops {
    public static void main (String[] args) {
        /*
        Escreva um programa que
         lê nome e idade de 5 pessoas e ao final informa quem é o mais novo,
          o mais velho e qual a média de idade.
         */
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        int[] idades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("digite o nome da %dº pessoa\n", i+1);
            nomes[i] = sc.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("digite o idade da %dº pessoa\n", i+1);
            idades[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nomes));
        System.out.println(Arrays.toString(idades));

        int maiorIdade = idades[0];
        int indiceMaiorIdade = 0;
        String pessoaMaiorIdade = "";
        for (int i = 0; i < idades.length; i++) {
            if (maiorIdade < idades[i]) {
                maiorIdade = idades[i];
                indiceMaiorIdade = i;
            }
        }
        for (int i = 0; i < nomes.length; i++) {
            if (i == indiceMaiorIdade) {
                pessoaMaiorIdade += nomes[i];
            }
        }

        int menorIdade = idades[0];
        int indiceMenorIdade = 0;
        String pessoaMenorIdade = "";
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                indiceMenorIdade = i;
            }
        }
        for (int i = 0; i < nomes.length; i++) {
            if (i == indiceMenorIdade) {
                pessoaMenorIdade += nomes[i];
            }
        }
        double total = 0;
        for (int idade : idades) {
            total += idade;
        }
        double media = total/idades.length;

        System.out.println("A pessoa de maior idade é "+pessoaMaiorIdade+", que possui "+maiorIdade+" anos.");
        System.out.println("A pessoa de menor idade é "+pessoaMenorIdade+", que possui "+menorIdade+" anos.");
        System.out.println("A média de idades é: "+media);

    }
}
