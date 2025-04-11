import java.util.Scanner;

public class Exercicio5 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int quantidadePares = 0;
       
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                quantidadePares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);

        scanner.close();
    }
}