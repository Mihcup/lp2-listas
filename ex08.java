import java.io.IOException;
import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) throws IOException{
        int anos = 0; 
        int meses = 0; 
        int dias = 0; 
        Scanner scan = new Scanner(System.in);
        int idadeEmDias = scan.nextInt(); 

        if(idadeEmDias>=365){
            anos = idadeEmDias/365;
            meses = idadeEmDias%365;
            if(meses>=30){
                dias = meses%30;
                meses = meses/30; 
            } 
            else{
                meses = 0; 
                dias = idadeEmDias%365;

            }
        }
        else{
            if(idadeEmDias>=30){
                meses = idadeEmDias/30; 
                dias = idadeEmDias%30;

            }
            else{
                dias = meses; 
            }
        }
        System.out.println(anos+" ano(s)");
        System.out.println(meses+" mes(es)");
        System.out.println(dias+" dia(s)");

    }
}
