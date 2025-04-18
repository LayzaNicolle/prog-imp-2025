import java.util.Scanner;

public class Quest02 {

    // Função que vai preencher o vetor com n valores inteiros digitados pelo usuário
    public static Scanner sc = new Scanner(System.in);
    public static void preencherVetor(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
    }

    // Função que vai imprimir o vetor no formato { 1, 2, 3 }
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

    // Função principal para testar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitando o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        // Cria e preenche o vetor
        int[] vetor = new int[n];
        preencherVetor(vetor, n);

        // Imprime o vetor
        System.out.print("Vetor preenchido: ");
        imprimirVetor(vetor, n);
    }
}
