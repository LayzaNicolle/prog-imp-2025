import java.util.Scanner;
public class ContadorTres{
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[]args){
        int n, soma=0;
        String resposta;
        do{
            System.out.println("Digite um número: ");
            n = teclado.nextInt();
            //soma recebe n
            soma += n;
            System.out.println("Quer continuar [S/N] ");
            resposta = teclado.next();
            
        } while(resposta.equals("S"));
        System.out.println("A soma de todos os valores é: " + soma);
    }
}