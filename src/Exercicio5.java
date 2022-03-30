import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args)  {
    
        Scanner leitor = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Por favor insira o primeiro número : ");
        numero1 = leitor.nextInt();

        System.out.println("Por favor insira o segundo número : ");
        numero2 = leitor.nextInt();

      
        
        if (numero1 > numero2){
            System.out.println(" O maior número foi "+ numero1);
        }
    
        else if (numero1 < numero2 ){
            System.out.println(" O maior número foi "+ numero2);
        }

        else {
            System.out.println("Valores iguais não permitido");
        }
    }
    
}
