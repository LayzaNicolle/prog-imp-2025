//Usando while
public class ContadorUm{
    public static void main(String[] args){
        int contador = 0;
        while(contador<10){
            //vai acrescentando mais 1 até chegar no valor que foi estabelecido no while
            contador++;
            
            if (contador == 5 || contador == 7){
                //vai interromper o fuxo natural e volta para o while
                continue;
            }

            if (contador == 9){
                //vai interromper a execução
                break;
            }
            System.out.println("Cambalhota " + contador);
            
        }
    }
}