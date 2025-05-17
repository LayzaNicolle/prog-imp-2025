import java.util.Scanner;
public class Exemplo12{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Produto p1 = new Produto(), p2 = new Produto();
        System.out.println("------------DADOS DO PRODUTO 1------------");
        lerProduto(p1);
        System.out.println("------------DADOS DO PRODUTO 2------------");
        lerProduto(p2);


        System.out.println("------------IMPRESSÃO DOS PRODUTOS------------");
        imprimirProduto(p1);
        imprimirProduto(p2);

    }

    public static void lerProduto(Produto p){
       System.out.print("Digite o nome do produto: ");
        p.titulo = input.nextLine();
        System.out.print("Digite a descrição do produto: ");
        p.descricao = input.nextLine();
        System.out.print("Digite o preço do produto: ");
        p.precoUnitario = input.nextDouble();
        input.nextLine(); 
        System.out.print("Digite o estoque desse produto: ");
        p.qtdEstoque = input.nextInt();
        input.nextLine(); 
    }

    public static void imprimirProduto(Produto p){
        System.out.println("Produto: " + p.titulo);
        System.out.println("Descrição: " + p.descricao);
        System.out.println("Preço: " + p.precoUnitario);
        System.out.println("Estoque: " + p.qtdEstoque);





    }


}