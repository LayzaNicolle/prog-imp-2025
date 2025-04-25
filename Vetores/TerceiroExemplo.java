import java.util.Arrays;
public class TerceiroExemplo{
    public static void main(String[] args){
        int vetor[] = {3, 7, 6,1, 9, 8, 10};
        for(int v: vetor){
            System.out.println(v + " ");
        }
        int p = Arrays.binarySearch(vetor, 1);
        System.out.println("Encontrei o valor na posição " + p);

    }
}
