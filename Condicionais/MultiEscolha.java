//Condição de múltiipla escolhas (Switch)
import java.util.Scanner;

public class MultiEscolha{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Escreva a quantidade de pernas: ");
        int perna = input.nextInt();
        String tipo;
        System.out.println("Isso é um(a): ");
        switch(perna){
            case 1:
                tipo = "Saci";
                break;
            
            case 2:
                tipo = "Bípede";
                break;
            
            case 3:
                tipo = "Tripé";
                break;
            
            case 4:
                tipo = "Quadrúpede";
                break;
            
            case 5:
                tipo = "Aranha";
                break;
            
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    
        
    }
}