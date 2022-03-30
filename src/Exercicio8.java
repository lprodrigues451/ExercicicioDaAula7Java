import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args)  {
    
        Scanner leitor = new Scanner(System.in);
        int numero1,numero2, numero3, numero4, numero5, numero6;

        System.out.println("Por favor insira o primeiro número : ");
        numero1 = leitor.nextInt();
        System.out.println("Por favor insira o segundo número : ");
        numero2 = leitor.nextInt();
        System.out.println("Por favor insira o terceiro número : ");
        numero3 = leitor.nextInt();
        System.out.println("Por favor insira o quarto número : ");
        numero4 = leitor.nextInt();
        System.out.println("Por favor insira o quinto número : ");
        numero5 = leitor.nextInt();
        System.out.println("Por favor insira o sexto número : ");
        numero6 = leitor.nextInt();

      
        
        if (numero1 == numero2 && numero3 != numero4 && numero5 > numero6 ){
            System.out.println(" A é igual a B \n C é diferente D \n E é maior F ");
        }

        else if (numero3 != numero4 && numero5 > numero6){
            System.out.println(" C é diferente D \n E é maior F ");
        }

        else if (numero1 == numero2 && numero5 > numero6 ){
            System.out.println(" A é igual a B \n E é maior F");
        }

        else if (numero1 == numero2 && numero3 != numero4 ){
            System.out.println(" A é igual a B \n C é diferente D");
        }

        else if (numero1 == numero2 ){
            System.out.println("A é igual a B");
        }
    
        else if (numero3 != numero4 ){
            System.out.println("C é diferente D");
        }

        else if (numero5 > numero6){
            System.out.println("E é maior F");
        }
    }
    
}
