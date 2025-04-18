import java.util.Scanner;

public class Quest05{

    // Função para preencher o vetor com n valores inteiros digitados pelo usuário
    public static Scanner sc = new Scanner(System.in);
    public static void preencherVetor(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
    }

    // Função para imprimir o vetor no formato { 1, 2, 3 }
    public static void imprimirVetor(int[] v, int n) {
        System.out.print("{ ");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    // Função para criar os vetores de pares e ímpares a partir do vetor original
    public static void criarParesImpares(int[] v, int n, int[] pares, int[] impares) {
        int posPares = 0, posImpares = 0;

        // Inicializando os vetores de pares e ímpares com o valor -1
        for (int i = 0; i < n; i++) {
            pares[i] = -1;
            impares[i] = -1;
        }

        // Preenchendo os vetores pares e ímpares com os valores de 'v'
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) { // Número par
                pares[posPares] = v[i];
                posPares++;
            } else { // Número ímpar
                impares[posImpares] = v[i];
                posImpares++;
            }
        }
    }

    // Função principal para testar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitando o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        // Criando o vetor
        int[] vetor = new int[n];
        preencherVetor(vetor, n);

        // Criando os vetores de pares e ímpares com o mesmo tamanho do vetor original
        int[] pares = new int[n];
        int[] impares = new int[n];

        // Preenchendo os vetores de pares e ímpares
        criarParesImpares(vetor, n, pares, impares);

        // Exibindo os vetores de pares e ímpares
        System.out.print("Vetor de Pares: ");
        imprimirVetor(pares, n);

        System.out.print("Vetor de Ímpares: ");
        imprimirVetor(impares, n);
    }
}
