import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args)  {
    
        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("Por favor insira sua idade : ");
        idade = leitor.nextInt();

      
        
        if (idade < 18){
            System.out.println(" Menor de idade ");
        }
    
        else if (idade >= 18){
            System.out.println("Maior de idade");
        }

    }
}
