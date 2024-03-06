import java.util.Scanner; 
import java.io.IOException;

public class ex04{
    public static void main (String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int nFuncionario = scan.nextInt(); 
        int horasTrabalhadas = scan.nextInt(); 
        float porHora = scan.nextFloat(); 
        float salario = horasTrabalhadas*porHora; 
        System.out.println("NUMBER = "+nFuncionario);
        System.out.printf("SALARY = U$ %.2f\n",salario);
    }
}