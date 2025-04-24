//Condição composta, utilizando if e else

import java.util.Scanner;

public class CondComposta{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Em que ano você nasceu?");
        int nasc = sc.nextInt();
        int idade = 2025 - nasc;
        System.out.println("Sua idade é " + idade);
        if (idade>=18){
            System.out.println("Você é maior de idade!");

        } else{
            System.out.println("Você é menor de idade!");
        }
    }
}