//Verificando, de forma simples, se o número é par ou ímpar

import java.util.Scanner;
public class ParOuImpar{

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Digite o primeiro número: ");
        int valor = input.nextInt();
        if(valor%2==0){
            System.out.println("O número é par!");
        }else{
            System.out.println("O número é ímpar!");
        }
    }
}

