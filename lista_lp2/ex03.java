import java.util.Scanner; 
import java.io.IOException;

public class ex03{
    public static void main (String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        double nota1 = scan.nextDouble(); 
        double nota2 = scan.nextDouble(); 
        double media = (nota1*0.35)+(nota2*0.75); 
        media= (media*10)/11;
        System.out.printf("MEDIA = %.5f\n",media);
    }
}