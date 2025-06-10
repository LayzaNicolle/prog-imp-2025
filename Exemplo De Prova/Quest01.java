import java.util.Scanner;

public class Quest01{
    public static Scanner input = new Scanner(System.in);
    public static final int TAM = 100;
    public static void main(String[] args){
        Categoria[] categorias = new Categoria[TAM];
        Produtos[] produtos = new Produtos[TAM];
        int qtdCategorias = 0;
        int qtdProdutos = 0;
        System.out.println("\n--- Cadastro de Categorias ---\n");
        qtdCategorias = cadastrarCategoria(categorias, qtdCategorias);
        System.out.println("\n--- Listagem de Categorias ---\n");
        imprimirCategorias(categorias, qtdCategorias);
        System.out.println("\n--- Cadastro de Produtos ---\n");
        qtdProdutos = cadastrarProduto(produtos,qtdProdutos, categorias, qtdCategorias);
        System.out.println("\n--- Listagem de produtos ---\n");
        input.nextLine();
        imprimirProdutos(produtos, qtdProdutos, categorias, qtdCategorias);
        bubbleSortPorDescricao(produtos, qtdProdutos);
        System.out.println("");
        System.out.print("Digite uma descrição para busca: ");
        String busca = input.nextLine();
        buscaBinariaPorDescricao(produtos, qtdProdutos, busca);
    }

    public static int cadastrarCategoria(Categoria[] v, int qtd) {
        if (qtd >= TAM) {
            System.out.println("Limite de categorias Atingido!");
            return qtd;
        }

        System.out.print("Codigo da Categoria: ");
        int codigo = input.nextInt();
        input.nextLine();

        for (int i = 0; i < qtd; i++) {
            if (v[i].codigoCategoria == codigo) {
                System.out.println("Código já existente!");
                return qtd;
            }
        }

        System.out.print("Nome da catégoria: ");
        String nome = input.nextLine();

        v[qtd] = new Categoria();
        v[qtd].codigoCategoria = codigo;
        v[qtd].nomeCategoria = nome;

        return qtd + 1;
    }

    //Quest 02, implementando a função void cadastrarCategoria(Categoria[] v, int qtd)

    public static void imprimirCategorias(Categoria[] v, int qtd) {
        for (int i = 0; i < qtd; i++) {
            System.out.printf("(Código: %d, Nome: %s)\n",
                v[i].codigoCategoria,v[i].nomeCategoria);
        }
    }

    //Quest 03, implementando a função void imprimirProdutos(Produto[] vp, int qtdProdutos, Categoria[] vc, int qtdCategorias)

    public static int cadastrarProduto(Produtos[] vp, int qtdProdutos, Categoria[] vc, int qtdCategorias) {
        if (qtdProdutos >= TAM) {
            System.out.println("Limite de produtos atingido!");
            return qtdProdutos;
        }

        System.out.print("Código do produto: ");
        int codigo = input.nextInt();
        input.nextLine(); // Limpa buffer

        System.out.print("Título: ");
        String titulo = input.nextLine();

        System.out.print("Descrição: ");
        String descricao = input.nextLine();

        // Lista categorias disponíveis
        System.out.println("Categorias disponíveis:");
        for (int i = 0; i < qtdCategorias; i++) {
            System.out.println(vc[i].codigoCategoria + " - " + vc[i].nomeCategoria);
        }

        System.out.print("Código da categoria: ");
        int codCategoria = input.nextInt();

        System.out.print("Preço (em centavos, ex: 1000 = R$10.00): ");
        int preco = input.nextInt();

        vp[qtdProdutos] = new Produtos();
        vp[qtdProdutos].codigoProduto = codigo;
        vp[qtdProdutos].tituloProduto = titulo;
        vp[qtdProdutos].descricaoProduto = descricao;
        vp[qtdProdutos].categoriaProduto = codCategoria;
        vp[qtdProdutos].precoProduto = preco;

        return qtdProdutos + 1;
    }

    public static void imprimirProdutos(Produtos[] vp, int qtdProdutos, Categoria[] vc, int qtdCategorias) {
        for (int i = 0; i < qtdProdutos; i++) {
            Produtos p = vp[i];

            String nomeCategoria = "Não Encontrada";
            for (int j = 0; j < qtdCategorias; j++) {
                if (vc[j].codigoCategoria == p.categoriaProduto) {
                    nomeCategoria = vc[j].nomeCategoria;
                    break;
                }
            }

            double precoReais = p.precoProduto / 100.0;

            System.out.printf("Código: %d | Título: %s | Descrição: %s | Categoria: %s | Preço: R$ %.2f%n",
                            p.codigoProduto, p.tituloProduto, p.descricaoProduto, nomeCategoria, precoReais);
        }
    }

    //Questão 04 utilizando bubble Sort, mas preisa alterar para selection sort
    public static void bubbleSortPorDescricao (Produtos[] vp, int qtd) {
        Produtos aux;
        boolean trocou;
        for (int i = 0; i < qtd - 1; i ++) {
            trocou = false;
            for (int j = 0; j < qtd - 1 - i; j++) {
                if (vp[j].descricaoProduto.compareToIgnoreCase(vp[j+1].descricaoProduto) > 0) {
                    aux = vp[j];
                    vp[j] = vp[j+1];
                    vp[j+1] = aux;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }
    }

    //Questão 05, onde vamos implementar a função void buscaBinariaPorDescricao(Produto[] v, int qtd, String x)

    public static void buscaBinariaPorDescricao(Produtos[] v, int qtd, String x) {
        int inicio = 0;
        int fim = qtd - 1;
        int meio;
        boolean encontrou = false;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            int comparacao = x.compareToIgnoreCase(v[meio].descricaoProduto);
            if (comparacao == 0) {
                encontrou = true;
                System.out.println("Produto Encontrado na Posição: " + meio);
                System.out.printf("(Código: %d | Título: %s | Descrição: %s | Categoria: %d | Preço: R$ %.2f)%n",
                                 v[meio].codigoProduto, v[meio].tituloProduto,v[meio].descricaoProduto, v[meio].categoriaProduto, v[meio].precoProduto / 100.0);
                break;
            } else if (comparacao < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }

        }
        if (!encontrou) {
            System.out.println("Produto com Descrição '" + x + "' Não Encontrado.");
        }
    }
}