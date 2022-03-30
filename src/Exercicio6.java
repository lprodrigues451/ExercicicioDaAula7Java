import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args)  {
    
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);

        int gol1, gol2;
        String time1, time2;

        System.out.println("Por favor insira o nome do time da casa : ");
        time1 = leitor.nextLine();

        System.out.println("Por favor insira a quantidade gol que o "+time1+" marcou");
        gol1 = leitor.nextInt();

        System.out.println("Por favor insira o nome do time visitante : ");
        time2 = leitor2.nextLine();

        System.out.println("Por favor insira a quantidade gol que o "+time2+" marcou");
        gol2 = leitor.nextInt();

      
        
        if (gol1 > gol2){
            System.out.println(" O time vencedor foi: "+time1);
        }
    
        else if (gol1 < gol2 ){
            System.out.println( " O time vencedor foi: "+time2);
        }

        else {
            System.out.println("O jogo ficou empatado");
        }
    }
    
}
