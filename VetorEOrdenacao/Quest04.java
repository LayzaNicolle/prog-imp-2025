import java.util.Scanner;

public class Quest04 {

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

    // Função para imprimir o maior valor ímpar ou uma mensagem se não houver ímpares
    public static void imprimirMaiorImpar(int[] v, int n) {
        // Inicializando com o menor valor possível
        int maiorImpar = Integer.MIN_VALUE;  

        for (int i = 0; i < n; i++) {
            if (v[i] % 2 != 0 && v[i] > maiorImpar) {
                maiorImpar = v[i];
            }
        }

        if (maiorImpar != Integer.MIN_VALUE) {
            System.out.println("Maior valor ímpar: " + maiorImpar);
        } else {
            System.out.println("Não há números ímpares no vetor");
        }
    }

   //Função principal para testar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitando o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        // Criando e preenche o vetor
        int[] vetor = new int[n];
        preencherVetor(vetor, n);

        // Imprimindo o vetor
        System.out.print("Vetor preenchido: ");
        imprimirVetor(vetor, n);

        // Imprimindo o maior valor ímpar
        imprimirMaiorImpar(vetor, n);
    }
}
