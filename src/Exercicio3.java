import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args)  {
    
        Scanner leitor = new Scanner(System.in);
        int numero1;

        System.out.println("Por favor insira um número : ");
        numero1 = leitor.nextInt();

      
        
        if (numero1 < 10){
            System.out.println(" NÃO É MAIOR QUE 10 ");
        }
    
        else if (numero1 > 10 ){
            System.out.println("É MAIOR QUE 10");
        }

        else {
            System.out.println("É IGUAL A 10");
        }
    }
    
}
