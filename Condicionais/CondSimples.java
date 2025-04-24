//Condição simples, utilizando apenas o if
import java.util.Scanner;

public class CondSimples{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Digite a sua primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.println("Digite a sua segunda nota: ");
        float n2 = sc.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi " + m);
        if (m>9){
            System.out.println("Parabéns!");
        }
    }
}



    

