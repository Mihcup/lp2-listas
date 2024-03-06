import java.util.Scanner; 
import java.io.IOException;

public class ex01{
    public static void main (String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt(); 
        int n2 = scan.nextInt(); 
        int soma = n1+n2;
        System.out.println("x = "+soma);
    }
}