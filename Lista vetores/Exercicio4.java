import java.util.Scanner;

public class Exercicio4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[8];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = scanner.nextInt();
        }
 
        System.out.print("Digite a posição X (entre 0 e 7): ");
        int x = scanner.nextInt();
        System.out.print("Digite a posição Y (entre 0 e 7): ");
        int y = scanner.nextInt();

       
        if (x >= 0 && x < 8 && y >= 0 && y < 8) {
            int soma = vetor[x] + vetor[y];
            System.out.println("Soma dos valores nas posições " + x + " e " + y + ": " + soma);
        } else {
            System.out.println("Posições inválidas! X e Y devem estar entre 0 e 7.");
        }

        scanner.close();
    }
}