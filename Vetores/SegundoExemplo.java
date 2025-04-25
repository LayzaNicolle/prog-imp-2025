//usando o for-each
import java.util.Arrays;
public class SegundoExemplo {
    public static void main(String[] args){
        //criando o vetor
        double v[] = {3.5, 2.75, 4.5 };

        //para colocar o vetor em ordem
        Arrays.sort(v);
    
        for(double valor: v){
            System.out.println(valor);
        }


    }
    
}
