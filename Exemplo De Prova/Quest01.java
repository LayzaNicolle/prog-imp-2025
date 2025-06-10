import java.util.Scanner;

public class Quest01{
    public static int TAM = 100; // Capacidade máxima do vetor de categoria

//Cadastrando uma nova categoria 

public static Scanner scanner = new Scanner(System.in);
public static int cadastrarCategorua(Categoria[] v, int qtd){
    //verificando se há espaço para cadastrar uma nova categoria 
    if (qtd >= TAM) {
        System.out.println("Erro: Não há mais espaço para cadastrar novas categorias");
        return qtd; //Retornando o valor atual de atd sem modificações
    }

    //solicitando o código da nova categoria 
    System.out.println("Digite o código da nova categorua: ");
    int codigo = scanner.nextInt();

    //Verificando se já existe uma categoria com o mesmo código
    for (int i = 0; i < qtd; i++){
        if (v[i].codigo == codigo){
            System.out.println("Erro: Já existe uma categoria com o código ");
            return qtd; //retornando o valor atual de qtd sem modificações
        }
    }

    //solicitando o nome da nova categoria
    System.out.print("Digite o nome da nova categoria: ");
    String nome = scanner.nextLine();

    //criando uma nova categoria e adicionando no vetor
    v[qtd] = new Categoria(codigo, nome);

    //retornando o novo tamanho do vetor (qtd + 1)
    return qtd + 1;

}

public static void main(String[] args){
    //inicialiando o vetor de categorias
    Categoria[] categorias = new Categoria[TAM];
    int qtd = 0; //quantidade de categorias cadastradas

    //Exemplo de cadastro
    qtd = cadastrarCategoria(categorias, qtd);
    System.out.println("Número de categorias cadastradas: " + qtd);

    // Exemplo de cadastro

    qtd = cadastrarCategoria(categorias, qtd);
    System.out.println("Número de categorias cadastradas: " + qtd);

    //Exibindo as categorias cadastradas
    for (int i = 0; i < qtd; i++){
        System.out.println("Categoria " + (i + 1) + ": Código = "
         + categorias[i].codigo + ", Nome = " + categorias[i].nome);
    }
}

}