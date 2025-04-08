import java.util.Random;

public class TabelaDeFrequencia {
    public static void main(String[] args) {
        int tamanhoVetor = 200;
        int[] posicaoVetor = new int[tamanhoVetor];
        Random rand = new Random();

        
        for (int i = 0; i < tamanhoVetor; i++) {
            posicaoVetor[i] = rand.nextInt(20) + 1;
        }

        System.out.println("Primeiro método da requência dos números:");
        System.out.println("Valor | Frequência");
        for (int i = 1; i <= 20; i++) {
            int contador = 0;
            for (int num : posicaoVetor) {
                if (num == i) {
                    contador++;
                }
            }
            System.out.printf("  %2d   |   %2d%n", i, contador);
        }

        int[] frequencias = new int[21]; 
        for (int num : posicaoVetor) {
            frequencias[num]++;
        }

        System.out.println("\nSegundo método da frequência dos números :");
        System.out.println("Valor | Frequência");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("  %2d   |   %2d%n", i, frequencias[i]);
        }
    }
}
