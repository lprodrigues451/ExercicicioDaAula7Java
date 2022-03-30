import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args)  {
    
        Scanner leitor = new Scanner(System.in);
        double altura, base, area;

        System.out.println("Por favor insira a altura do retângulo : ");
        altura = leitor.nextDouble();

        System.out.println("Por favor insira a base do retângulo : ");
        base = leitor.nextDouble();

        area = base * altura ;
        
        System.out.println("A área do retângulo é : "+ area);

    }
    


    
}
