import java.io.IOException;
import java.util.Scanner; 
public class ex10 {
    public static void main(String[] args) throws IOException{
        int menor=0;
        int posicao = 0; 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int[] x = new int[n];
        String numeros = scan.nextLine();
        String[] partes = numeros.split(" ");
        for(int i=0; i<n; i++){
            x[i] = Integer.parseInt(partes[i]);
        }
        for(int i=0; i<n; i++){
            if(i==0){
                menor = x[i];
                posicao = i;
            }
            if(x[i]<menor){
                menor = x[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: "+menor+"\nPosicao: "+posicao);
    }
}
