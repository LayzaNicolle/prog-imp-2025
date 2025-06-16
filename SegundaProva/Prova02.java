import java.util.Scanner;

public class Prova02 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[100];  // vetor com capacidade para 100 pessoas
        int qtd = 0;

        System.out.println("\n--- Cadastro de pessoas ---\n");

        // Vamos cadastrar 2 pessoas como exemplo, você pode alterar para mais
        qtd = cadastrarPessoa(pessoas, qtd);
        qtd = cadastrarPessoa(pessoas, qtd);

        System.out.println("\n--- Pessoas cadastradas ---\n");
        imprimirPessoas(pessoas, qtd);
    }

    public static int buscarPessoaPorNome(Pessoa[] v, int qtd, String nome) {
        for (int i = 0; i < qtd; i++) {
            if (v[i].nome.equalsIgnoreCase(nome)) {
                return i;  // Nome encontrado
            }
        }
        return -1;  // Nome não encontrado
    }

    public static int cadastrarPessoa(Pessoa[] v, int qtd) {
        if (qtd >= v.length) {
            System.out.println("Não é possível cadastrar mais pessoas. Vetor cheio.");
            return qtd;
        }

        String nome;
        int idade;
        double peso, altura;

        while (true) {
            System.out.print("Digite o nome da nova pessoa: ");
            nome = sc.nextLine();

            if (buscarPessoaPorNome(v, qtd, nome) == -1) {
                break;  // nome único
            } else {
                System.out.println("Nome já existe. Digite outro nome.");
            }
        }

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();

        System.out.print("Digite o peso (kg): ");
        peso = sc.nextDouble();

        System.out.print("Digite a altura (m): ");
        altura = sc.nextDouble();

        sc.nextLine(); // limpa buffer

        v[qtd] = new Pessoa();
        v[qtd].nome = nome;
        v[qtd].idade = idade;
        v[qtd].peso = peso;
        v[qtd].altura = altura;

        System.out.println("Pessoa cadastrada com sucesso!\n");

        return qtd + 1;
    }

    public static double calcularIMC(Pessoa p) {
        return p.peso / (p.altura * p.altura);
    }

    public static void imprimirPessoas(Pessoa[] v, int qtd) {
        for (int i = 0; i < qtd; i++) {
            Pessoa p = v[i];
            double imc = calcularIMC(p);
            System.out.printf("Nome: %s\nIdade: %d\nPeso: %.2f kg\nAltura: %.2f m\nIMC: %.2f\n\n",
                    p.nome, p.idade, p.peso, p.altura, imc);
        }
    }
}
