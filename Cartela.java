import java.util.Random;

public class Cartela {
    private int[][][] cartela;
    private Random random = new Random();
    private int qtdCartelas = 0;
    private int qtdMatriz = 0;


    public Cartela(int qtdCartelas, int qtdMatriz) {
        cartela = new int[qtdCartelas][qtdMatriz][qtdMatriz];
    }

    public void gerarCartela() {
        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                for (int k = 0; k < cartela[i][j].length; k++) {
                    cartela[i][j][k] = random.nextInt(100);
                }
            }
        }
    }

    public void imprimirCartela() {
        for (int i = 0; i < cartela.length; i++) {
            System.out.println("Cartela " + (i + 1));
            for (int j = 0; j < cartela[i].length; j++) {
                for (int k = 0; k < cartela[i][j].length; k++) {
                    System.out.print(cartela[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("____________________");
        }
    }





}
