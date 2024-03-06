import java.util.Scanner; 
import java.io.IOException;

public class ex05{
    public static void main (String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int codigo1 = scan.nextInt(); 
        int qtd1 = scan.nextInt(); 
        float valor1 = scan.nextFloat(); 
        int codigo2 = scan.nextInt(); 
        int qtd2 = scan.nextInt(); 
        float valor2 = scan.nextFloat();
        
        float valorTotal = (qtd1*valor1)+(qtd2*valor2); 
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valorTotal);
    }
}