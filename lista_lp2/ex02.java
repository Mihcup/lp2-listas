import java.util.Scanner; 
import java.io.IOException;

public class ex02{
    public static void main (String[] args) throws IOException{
        final double n = 3.14159;
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble(); 
        double area = n*(raio*raio); 
        System.out.printf("A=%.4f",area);
    }
}