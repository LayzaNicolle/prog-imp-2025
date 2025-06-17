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

       maisVelhaIMCMagreza(pessoas, qtd);

       insertionSortPorNome(pessoas, qtd);

       bubbleSortPorNome(pessoas, qtd);

    }

    //Questão 01
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

    // Questão 02
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

    //Questão 03
    public static int maisVelhaIMCMagreza(Pessoa[] v, int qtd) {
        int maisVelha = -1;
        int maiorIdade = -1;

        for (int i = 0; i < qtd; i++) {
            double imc = calcularIMC(v[i]);

            if (imc < 18.5) {
                if (v[i].idade > maiorIdade) {
                    maiorIdade = v[i].idade;
                    maisVelha = i;
                }
            }
        }

        if (maisVelha != -1) {
            Pessoa p = v[maisVelha];
            double imc = calcularIMC(p);

            System.out.printf("Pessoa mais velha com IMC Magreza:%n");
            System.out.printf("Nome: %s%n", p.nome);
            System.out.printf("Idade: %d%n", p.idade);
            System.out.printf("Peso: %.2f kg%n", p.peso);
            System.out.printf("Altura: %.2f m%n", p.altura);
            System.out.printf("IMC: %.2f%n", imc);
        } else {
            System.out.println("Nenhuma pessoa com IMC Magreza foi encontrada.");
        }

        return maisVelha;
    }

    //Questão 04
    public static void insertionSortPorNome(Pessoa[] v, int qtd) {
        for (int i = 1; i < qtd; i++) {
            Pessoa aux = v[i];
            int j = i - 1;

            while (j >= 0 && v[j].nome.compareToIgnoreCase(aux.nome) > 0) {
                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = aux;
        }
        System.out.println("\n--- Pessoas ordenadas por nome ---\n");
        for (int i = 0; i < qtd; i++) {
            System.out.printf("%s - %d anos%n", v[i].nome, v[i].idade);
        }
}

    //Questão 05

    public static void bubbleSortPorNome(Pessoa[] vp, int qtd){
        Pessoa auxiliar;
        boolean trocou;

        for(int i = 0; i < qtd - 1; i++){
            trocou = false;
            for(int j = 0; j < qtd - 1- i; j++){
                if(vp[j].nome.compareToIgnoreCase(vp[j+1].nome) > 0){
                    auxiliar = vp[j];
                    vp[j] = vp[j + 1];
                    vp [j + 1] = auxiliar;
                    trocou = true;
                }

                if(!trocou) break;
            }
        }
        System.out.println("\n--- Pessoas ordenadas por nome ---");
        for (int i = 0; i < qtd; i++) {
            System.out.printf("%s - %d anos%n", vp[i].nome, vp[i].idade);
        }
    }
 
}




