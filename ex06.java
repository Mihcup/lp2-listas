import java.io.IOException;
import java.util.Scanner; 

public class ex06 {
    public static void main (String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int maiorValorAB = (a+b+Math.abs(a-b))/2;
        if(maiorValorAB>c){
            System.out.println(maiorValorAB+" eh o maior valor");
        } else{
            System.out.println(c+" eh o maior valor");
        }
    }

}
