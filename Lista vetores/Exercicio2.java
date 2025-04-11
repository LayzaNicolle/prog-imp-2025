import java.util.Scanner;

public class Exercicio2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros = new int[6];
       
        // Lê 6 valores inteiros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Mostra os valores lidos
        System.out.println("Valores digitados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}