import java.util.Scanner;

public class Quest03{

    // Função para preencher o vetor com n valores inteiros digitados pelo usuário
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

    // Função que vai ordenar o vetor utilizando o algoritmo Bubble Sort
    public static void ordenar(int[] v, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    // Trocando os elementos se estiverem fora de ordem
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    // Função principal para testar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitando o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        // Criando e preenchendo o vetor
        int[] vetor = new int[n];
        preencherVetor(vetor, n);

        // Imprimindo o vetor antes de ordenar
        System.out.print("Vetor antes da ordenação: ");
        imprimirVetor(vetor, n);

        // Ordenando o vetor utilizando Bubble Sort
        ordenar(vetor, n);

        // Imprimindo o vetor após ordenar
        System.out.print("Vetor após a ordenação: ");
        imprimirVetor(vetor, n);
    }
}
