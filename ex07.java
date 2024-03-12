import java.io.IOException;
import java.util.Scanner; 

public class ex07 {
    public static void main(String[] args) throws IOException{
        int horas = 0;
        int minutos = 0; 
        int segundos = 0;
        Scanner scan = new Scanner(System.in);
        int ValorEmSegundos = scan.nextInt();
       
        if(ValorEmSegundos>=60){
            minutos = ValorEmSegundos/60;
            segundos = ValorEmSegundos%60;
            if(minutos>=60){
                horas = minutos/60; 
                minutos = minutos%60; 
            }
        }
        else
            segundos=ValorEmSegundos;
            
        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
