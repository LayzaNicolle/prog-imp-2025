import java.util.Scanner;

public class Exercicio8 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros = new int[6];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nValores em ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}