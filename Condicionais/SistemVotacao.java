import java.util.Scanner;

public class SistemVotacao{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Digite o ano que você nasceu: ");
        int ano = input.nextInt();
        int idade = 2025 - ano;
        System.out.println("Sua idade é: " + idade + " anos");
        if (idade < 16){
            System.out.println("Você ainda não pode votar");
        
        // && = e || = OU
        } else if((idade >= 16 && idade <18)|| (idade >70)){
            System.out.println("Seu voto é Opcional");    
        } else{
            System.out.println("Seu voto é Obrigatório!");
        }
    }
}