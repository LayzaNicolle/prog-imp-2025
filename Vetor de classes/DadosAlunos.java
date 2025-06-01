import java.util.Scanner;
public class DadosAlunos {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Aluno[] alunos = new Aluno[10];
        int aprovadosCount = 0, reprovadosCount = 0;

        
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite a matrícula do aluno " + (i + 1) + ":");
            String matricula = scanner.nextLine();

            System.out.println("Digite a média final do aluno " + (i + 1) + ":");
            double mediaFinal = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            alunos[i] = new Aluno(nome, matricula, mediaFinal);
        }

        
        for (Aluno aluno : alunos) {
            if (aluno.mediaFinal >= 5.0) {
                aprovadosCount++;
            } else {
                reprovadosCount++;
            }
        }

        
        Aluno[] aprovados = new Aluno[aprovadosCount];
        Aluno[] reprovados = new Aluno[reprovadosCount];

        int indexAprovado = 0;
        int indexReprovado = 0;

        for (Aluno aluno : alunos) {
            if (aluno.mediaFinal >= 5.0) {
                aprovados[indexAprovado++] = aluno;
            } else {
                reprovados[indexReprovado++] = aluno;
            }
        }

        
        System.out.println("\n--- Alunos Aprovados ---");
        for (Aluno aluno : aprovados) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Matrícula: " + aluno.matricula);
            System.out.println("Média Final: " + aluno.mediaFinal);
            System.out.println("-----------------------");
        }

       
        System.out.println("\n--- Alunos Reprovados ---");
        for (Aluno aluno : reprovados) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Matrícula: " + aluno.matricula);
            System.out.println("Média Final: " + aluno.mediaFinal);
            System.out.println("------------------------");
        }
    }
}