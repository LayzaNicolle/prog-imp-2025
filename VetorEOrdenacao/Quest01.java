import java.util.Scanner;

public class Quest01 {
    public static Scanner sc = new Scanner(System.in);
    public static void preencherVetor(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
    }

    // Essa é a função principal para testar o preenchimento
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitando o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        // Criando o vetor com tamanho n
        int[] vetor = new int[n];

        // Chamando a função para preencher o vetor
        preencherVetor(vetor, n);

        // Mostrando o vetor preenchido
        System.out.print("Vetor preenchido: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}