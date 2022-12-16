import java.util.Arrays;
import java.util.Scanner;

public class Ex8Loops {
    public static void main(String[] args) {
        /*
        Escreva um programa que lê nome,
        altura e peso de 5 pessoas,
         calcula o IMC de cada um e ao final
          se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).
         */
        Scanner sc = new Scanner(System.in);
        String [] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o nome da %dº pessoa: ",i+1);
            nomes[i] = sc.nextLine();
        }
        double [] alturas = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite a altura da %dº pessoa: ",i+1);
            alturas[i] = sc.nextDouble();
        }
        double [] pesos = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o peso da %dº pessoa: ",i+1);
            pesos[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(nomes));
        System.out.println(Arrays.toString(alturas));
        System.out.println(Arrays.toString(pesos));

        Pessoa pessoa = new Pessoa();

        for (int i = 0; i < 5; i++) {
            pessoa.calculaIMC(nomes[i],alturas[i],pesos[i]);
        }
    }

    static class Pessoa {
        String nome;
        double altura;
        double peso;

        public void calculaIMC(String nome, double altura, double peso) {
            double imc = peso/Math.pow(altura,2);
            if (imc >= 18.5 && imc <= 25) {
                System.out.printf("%s está no Peso Ideal - IMC: %.2f\n", nome, imc);
            } else {
                System.out.printf("%s está fora do Peso Ideal - IMC: %.2f\n", nome,imc);
            }
        }
    }
}
