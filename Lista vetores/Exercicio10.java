
import java.util.Scanner;

public class Exercicio10 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[] notas = new double[15];
        double soma = 0;
         
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
 
        double media = soma / notas.length;

        System.out.printf("\nMédia geral da turma: %.2f\n", media);

        scanner.close();
    }
}
