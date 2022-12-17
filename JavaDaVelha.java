
public class JavaDaVelha {
    public static void main (String[] args) {
        Character[][] tabuleiro = new Character[3][3];
        mostraTabuleiro(tabuleiro);
    }

    public static void mostraTabuleiro(Character[][] tabuleiro) {
        for (Character[] linha : tabuleiro) {
            System.out.print("[ ");

            for (int numColuna = 0; numColuna < linha.length; numColuna++) {
                Character elemento = linha[numColuna];

                if (elemento == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(elemento);
                }

                if (numColuna == linha.length - 1) {
                    System.out.print(" ]");
                } else {
                    System.out.print(" ][ ");
                }
            }
            System.out.println();
        }
    }
}
