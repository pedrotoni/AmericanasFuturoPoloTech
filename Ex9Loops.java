public class Ex9Loops {
    public static void main (String[] args) {
        /*
        Supondo que a população do país "A" seja de 80_000 habitantes,
         com uma taxa anual de crescimento de 3%. E que a população de B seja 200_000 habitantes,
         com uma taxa de crescimento de 1.5%.

Faça um programa que calcule e escreva o número de anos necessários
 para que a população do país A ultrapasse ou iguale a população do país B mantidas as taxas de crescimento.
         */
        int popA = 80_000;
        int popB = 200_000;
        final double TAXA_CRESCIMENTO_POPA = 0.03;
        final double TAXA_CRESCIMENTO_POPB = 0.015;
        int numeroDeAnos = 0;

        while (popA <= popB) {
            popA += popA*TAXA_CRESCIMENTO_POPA;
            popB += popB*TAXA_CRESCIMENTO_POPB;
            numeroDeAnos++;
            System.out.printf("%d: A - %d / B - %d\n",numeroDeAnos,popA,popB);
        }

        System.out.printf("Foram necessários %d anos para que a população A superasse a população B, mantidas as taxas de crescimento.",numeroDeAnos);
    }
}
